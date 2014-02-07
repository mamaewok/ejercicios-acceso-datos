package actividad6_1;

import java.io.File;
import java.util.Scanner;
/**
 * 
 * @author Ainhoa Suárez Sánchez
 *
 */
public class Actividad6_1 {

	public static void main(String[] args) {
		String rutaCSV = "C:\\Users\\MAMAEWOK\\Documents\\empleados.csv";
		String rutaBin = "C:\\Users\\MAMAEWOK\\Documents\\empleados.bin";
		Scanner reader = new Scanner(System.in);
		
		Empleado emp;
		int n = -1;
		Model modelo = null;
		File rutaAux = new File(rutaBin);
		
		if(rutaAux.exists())
			modelo = new Model(rutaCSV, rutaBin);
		else
			modelo = new Model(rutaBin);
		
		do {
			System.out.println("Introduce opción: \n"
					+ "1.- Ver todos los empleados\n"
					+ "2.- Buscar un empleado\n" 
					+ "0.- Salir");
			n = reader.nextInt();
			
			switch (n) {
			case 1:
				for (Empleado empleadoAux : modelo.getEmpleados()) {
					System.out.println(empleadoAux.toString());
				}
				break;

			case 2:
				System.out.println("Introduzca id de empleado: ");
				
				emp = modelo.buscarEmpleado(reader.nextInt());
				
				System.out.println(emp.toString());
				break;
			}
					
		} while (n != 0);
			
		System.out.println("Hasta pronto!");
		}
	}