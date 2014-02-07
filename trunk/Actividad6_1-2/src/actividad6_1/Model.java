package actividad6_1;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Model {

	private File fichero ;
	private File ficheroCSV;
	
	private ArrayList<Empleado> listaEmpleados;

	/**
	 * Crea la lista de empleados y el fichero binario en caso de que no esté
	 * creado ya
	 * 
	 * @param rutaCSV
	 *            ruta del fichero con los datos para el binario
	 * @param rutaBin
	 *            ruta del fichero que se está creando
	 */
	public Model(String rutaCSV, String rutaBin) {
		fichero = new File(rutaBin);
		ficheroCSV = new File(rutaCSV);
		listaEmpleados = new ArrayList<Empleado>();
		leerFicheroCSV();
		crearFicheroBin();
	}

	/**
	 * Se usa en caso de que le fichero bin ya este creado
	 * 
	 * @param rutaBin
	 */
	public Model(String rutaBin) {
		listaEmpleados = new ArrayList<Empleado>();
		fichero = new File(rutaBin);
		leerFicheroBin();
	}

	/**
	 * Lee y devuelve los datos de un fichero csv o txt sobre empelados
	 * 
	 */
	public void leerFicheroCSV() {
		FileReader f = null;
		BufferedReader bf = null;
		String linea; 
		
		try {
			f = new FileReader(ficheroCSV);
			bf = new BufferedReader(f);

			StringTokenizer tokens = null;
			while ((linea = bf.readLine()) != null) {
				
				tokens = new StringTokenizer(linea, ";");
								
				int emp_no = Integer.parseInt(tokens.nextToken());
				String lastname = tokens.nextToken();
				String name = tokens.nextToken();
				int job = Integer.parseInt(tokens.nextToken());
				String date = tokens.nextToken();
				double salary = Double.parseDouble(tokens.nextToken());
				double commission = Double.parseDouble(tokens.nextToken());
				int dept_number = Integer.parseInt(tokens.nextToken());

				Empleado emp = new Empleado(emp_no, lastname, name, job, date, salary,
						commission, dept_number);

				listaEmpleados.add(emp);
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println("No se encuentra el fichero CSV");
		} catch (IOException e) {
			System.err.println("Error de E/S en fichero CSV");
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				System.err.println("No se ha podido cerrar el archivo CSV");
			}
		}
	}

	/**
	 * Crea un fichero binario con objetos de clase Empleado usando un fichero temporal
	 */
	public void crearFicheroBin() {
		File temporal = new File (fichero.getAbsolutePath() + ".tmp");
				
		ObjectOutputStream dataOS = null;
		try {
			FileOutputStream filein = new FileOutputStream(temporal);
			dataOS = new ObjectOutputStream(filein);

			for (Empleado emp : listaEmpleados) {
				dataOS.writeObject(emp);
			}
		} catch (IOException ioe) {
			System.err.println("Error en E/S en fichero BIN");
		} finally {
			try {
				dataOS.close();
			} catch (IOException e) {
				System.err.println("No se ha podido cerrar el archivo BIN");
			}
		}
		fichero.delete();
		temporal.renameTo(fichero);
	}

	/**
	 * Lee los objetos empleado de un fichero binario
	 */
	public void leerFicheroBin() {
		ObjectInputStream objectIS = null;
		try {
			FileInputStream filein = new FileInputStream(fichero);
			objectIS = new ObjectInputStream(filein);

			Empleado emp = null;

			while (true) {
				try {
					emp = (Empleado) objectIS.readObject();
					listaEmpleados.add(emp);
				} catch (ClassNotFoundException e) {
					System.out.println("Empleado.class no existe ");
				}
			}
		} catch (EOFException ioe) {
			System.err.println("Fin de lectura en fichero BIN");
		} catch (IOException ioe) {
			System.err.println("Error en E/S en lectura de fichero BIN");
		} finally {
			try {
				objectIS.close();
			} catch (IOException e) {
				System.err.println("No se ha podido cerrar la lectura del fichero BIN");
			}
		}
	}
	
	/**
	 * Devuelve la lista de tipo Empleado
	 * @return listaEmpleados
	 */
	public ArrayList<Empleado> getEmpleados() {

		return listaEmpleados;
	}

	/**
	 * Busca un empleado concreto a través del ID
	 * 
	 * @return Empleado empleado
	 */
	public Empleado buscarEmpleado(int id) {
		for (Empleado empleado : listaEmpleados) {
			if (id == empleado.getEmp_no()) {
				return empleado;
			}
		}
		return null;
	}
}
