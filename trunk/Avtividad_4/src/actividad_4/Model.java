package actividad_4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Model {

	private String[] provincias = { "Ávila", "Burgos", "León", "Palencia",
			"Salamanca", "Segovia", "Soria", "Valladolid", "Zamora" };

	public void almacenarProvincias() {

		Scanner reader = new Scanner(System.in);

		FileWriter f = null; // declaro FileWrtiter fuera para hacer el cierre
								// en el finally
		try {
			File fichero = new File("C:\\provincias.txt");
			if (fichero.exists() == true) {
				System.out.println("El fichero ya existe. ¿Qué desea hacer? \n"
								+ "1.- Borrarlo\n"
								+ "2.- Añadir caracteres al final\n");
				int n = reader.nextInt();
				if (n == 1) {
					f = new FileWriter(fichero);

					for (String prov : provincias) {
						f.write(prov);
					}
				}
				else if(n ==2){
					
				}
			}
		} catch (IOException ioe) {
			System.out.println("El disco no se puede grabar");
		} finally {
			try {
				f.close();
			} catch (IOException ioe) {
				System.out.println("");
			}
		}
	}

	// ///////////////getters y setters

	public String[] getProvincias() {
		return provincias;
	}

	public void setProvincias(String[] provincias) {
		this.provincias = provincias;
	}

}
