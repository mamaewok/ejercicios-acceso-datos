
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase que contiene los métodos que realizaran los ejercicios de la Actividad
 * 3
 *
 * @author MAMAEWOK
 */
public class Model {

    private Scanner reader;
	private String sTexto;
	private String sTexto2;

	/**
     * Método que lee el contenido del fichero readme.txt
     */
    public void mostrarReadme() {
        try {
            File fichero = new File("C:\\readme.txt");
            try (FileReader f = new FileReader(fichero)) {
                int i;
                while ((i = f.read()) != -1) {
                    System.out.print((char) i);
                }
            }
        } catch (IOException ioe) {
            System.out.println("Disco protegido contra lectura");
        }
    }

    /**
     * Método que recibe la dirección de un File y lee el contenido de 20 en 20
     * caracteres, necesitando la introducción a través de scanner de cualquier
     * caracter para continuar
     *
     * (No sabía cómo hacer para continuar tocando una tecla simplemente)
     */
    public void verContenidoDirectorio(String direccion) {

        try {
            setReader(new Scanner(System.in));
            File fichero = new File(direccion);
            try (FileReader f = new FileReader(fichero)) {
                int i;
                int vueltas = 0; //contador de vueltas que da el while

                while ((i = f.read()) != -1) {
                    System.out.print((char) i);
                    vueltas++; //subimos las vueltas

                    if (vueltas == 20) { //cuando llegan a 20 interrumpimos con scanner(no sabía como hacerlo)
                        /*System.out.print(
                                "\nIntroduce un caracter cualquiera y acepta para continuar");
                        String sTexto = reader.next();
                        */
                    	
                    	new java.util.Scanner(System.in).nextLine();
                    	
                        vueltas = 0; //ponemos el contador a 0 para la siguiente vuelta
                    }
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("El fichero " + direccion + " no existe ");
        } catch (IOException ioe) {
            System.out.println("El disco esta protegido contra escritura");
        }


    }

    public void verContenidoDirectorio(String direccion, int caracteresLeer) {

        try {
            setReader(new Scanner(System.in));
            File fichero = new File(direccion);
            try (FileReader f = new FileReader(fichero)) {
                int i;
                int vueltas = 0;

                while ((i = f.read()) != -1) {
                    System.out.print((char) i);
                    vueltas++;

                    if (vueltas == caracteresLeer) {
                        System.out.print(
                                "\nIntroduce un caracter cualquiera y acepta para continuar");
                        setsTexto(reader.next());
                        vueltas = 0;
                    } else if (vueltas == 20) {
                        System.out.print(
                                "\nIntroduce un caracter cualquiera y acepta para continuar");
                        setsTexto2(reader.next());
                        vueltas = 0;
                    }
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("El fichero " + direccion + " no existe ");
        } catch (IOException ioe) {
            System.out.println("El disco esta protegido contra escritura");
        }
    }

	public Scanner getReader() {
		return reader;
	}

	public void setReader(Scanner reader) {
		this.reader = reader;
	}

	public String getsTexto() {
		return sTexto;
	}

	public void setsTexto(String sTexto) {
		this.sTexto = sTexto;
	}

	public String getsTexto2() {
		return sTexto2;
	}

	public void setsTexto2(String sTexto2) {
		this.sTexto2 = sTexto2;
	}
}