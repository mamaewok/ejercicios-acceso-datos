package actividad1y2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		Model m;
		int n;
		ArrayList<Double> contenedorDouble = new ArrayList<Double>();

		do {
			System.out.println("Introduce el apartado a realizar: \n"
					+ "1.- Crear fichero DOUBLE.bin\n"
					+ "2.- Mostrar por pantalla DOUBLE.bin\n" + "0.- Salir");
			n = reader.nextInt();

			switch (n) {
			case 1:
				System.out.println(
						"Introduce los double para crear el archivo");
						while(reader.hasNext()){
							contenedorDouble.add(reader.nextDouble());
						}
					m = new Model(contenedorDouble);
			
				break;

			case 2:

				break;
			}

		} while (n != 0);

		System.out.println("¡Hasta la vista!");
	}

}
