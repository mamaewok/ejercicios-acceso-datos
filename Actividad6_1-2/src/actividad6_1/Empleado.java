package actividad6_1;

import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Empleado implements Serializable {


	private static final long serialVersionUID = 1L;

	private int emp_no;
	private String lastname;
	private String name;
	private int job;
	private Date date;
	private double salary;
	private double commission;
	private int dept_number;
	
	private final int TAMAÑO = 20;

	/**
	 * Constructor
	 * @param emp_no
	 * @param lastname
	 * @param name
	 * @param job
	 * @param sDate
	 * @param salary
	 * @param commission
	 * @param dept_number
	 */
	Empleado(int emp_no, String name, String lastname, int job, String sDate,
			double salary, double commission, int dept_number) {
		Date date;
		
		this.emp_no = emp_no;
		
		if (lastname.length()>TAMAÑO)
			this.lastname = this.lastname.substring(0, TAMAÑO);
		else this.lastname = lastname;
				
		if (name.length()>TAMAÑO)
			this.name = name.substring(0, TAMAÑO);		
		else this.name = name;
		
		this.job = job;
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = (Date) formatter.parse(sDate);
		} catch (ParseException e) {
			date = null;
		}
		this.date = date;
		this.salary = salary;
		this.commission = commission;
		this.dept_number = dept_number;
		
	}

	//*******************************
	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		
		if (lastname.length()>TAMAÑO)
			lastname = this.lastname.substring(0, TAMAÑO);
		else this.lastname = lastname;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length()>TAMAÑO)
			name = this.name.substring(0, TAMAÑO);
		else this.name = name;
	}

	public int getJob() {
		return job;
	}

	public void setJob(int job) {
		this.job = job;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(String sDate) {
		Date date;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = (Date) formatter.parse(sDate);
		} catch (ParseException e) {
			date = null;
		}
		this.date = date;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public int getDept_number() {
		return dept_number;
	}

	public void setDept_number(int dept_number) {
		this.dept_number = dept_number;
	}
	
	@Override
	public String toString(){
		
		 SimpleDateFormat  formatter = new SimpleDateFormat("dd/MM/yyyy");
		 
		return getEmp_no()+ " " + getName() + " "
					+ getLastname() + " fecha "
					+ formatter.format(getDate())+
					" job "+ getJob() + " salario " + getSalary()
					+" comision " + getCommission() + 
					" dept "+ getDept_number();
	}

}

