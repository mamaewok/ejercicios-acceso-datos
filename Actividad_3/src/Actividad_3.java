import java.util.Scanner;

public class Actividad_3 {

	private static Scanner reader;

	public static void main(String[] args) {

		reader = new Scanner(System.in);
		int n;
		String sTexto;

		do {
			System.out.println("Introduce el apartado a realizar: \n"
					+ "1.- Leer readme.txt\n"
					+ "2.- Leer fichero desde linea de comando de 20 en 20\n"
					+ "3.- Indicar cantidad de carácteres a leer\n"
					+ "0.- Salir");
			n = reader.nextInt();
			Model m = new Model();

			switch (n) {
			case 1:
				m.mostrarReadme();

				break;

			case 2:
				System.out.println(
						"Introduce la direccion del archivo o fichero: ");
				sTexto = reader.next();
				m.verContenidoDirectorio(sTexto);

				break;

			case 3:
				System.out
						.println("Introduce la direccion del archivo o fichero: ");
				sTexto = reader.next();

				System.out
						.println("Introduce el número de caracteres a leer: ");
				n = reader.nextInt();
				m.verContenidoDirectorio(sTexto, n);

				break;

			}
		} while (n != 0);
		System.out.println("¡Hasta pronto!");
	}
}
