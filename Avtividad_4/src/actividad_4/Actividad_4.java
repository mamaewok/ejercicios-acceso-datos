package actividad_4;

import java.util.Scanner;

public class Actividad_4 {

	

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		String sTexto;
		
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
	                        sTexto = reader.next();
	                        

	                        break;

	                    case 3:
	                        System.out.println(
	                                "Introduce la direccion del archivo o fichero: ");
	                        sTexto = reader.next();
	                        
	                        System.out.println(
	                                "Introduce el número de caracteres a leer: ");
	                        n = reader.nextInt();
	                       
	                        
	                        break;
	                        
	                }
	        } while (n != 0);
	            System.out.println("¡Hasta pronto!");
		
	}

}
