package actividad_4;

import java.util.Scanner;

public class Avtividad_4 {

	private static Scanner reader;
	private static String sTexto;

	public static void main(String[] args) {
		 reader = new Scanner(System.in);
	        int n;
	        do {
	            System.out.println(
	                    "Introduce el apartado a realizar: \n"
	                    + "1.- Guardar provincias\n"
	                    + "2.- Leer fichero desde linea de comando de 20 en 20\n"
	                    + "3.- Indicar cantidad de carácteres a leer\n"
	                    + "0.- Salir");
	            n = reader.nextInt();
	            Model m = new Model();
	            switch (n) {
	                    case 1:
	                        m.almacenarProvincias();

	                        break;

	                    case 2:
	                        System.out.println(
	                                "Introduce la direccion del archivo o fichero: ");
	                        setsTexto(reader.next());
	                        

	                        break;

	                    case 3:
	                        System.out.println(
	                                "Introduce la direccion del archivo o fichero: ");
	                        setsTexto(reader.next());
	                        
	                        System.out.println(
	                                "Introduce el número de caracteres a leer: ");
	                        n = reader.nextInt();
	                       
	                        
	                        break;
	                        
	                }
	        } while (n != 0);
	            System.out.println("¡Hasta pronto!");
		
	}

	public static String getsTexto() {
		return sTexto;
	}

	public static void setsTexto(String sTexto) {
		Avtividad_4.sTexto = sTexto;
	}

}
