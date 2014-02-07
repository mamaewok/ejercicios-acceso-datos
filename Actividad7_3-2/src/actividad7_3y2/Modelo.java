package actividad7_3y2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Clase que Crear y lee un fichero binario “ENTEROS.BIN” pasándole el contenido
 * del fichero “ENTEROS.TXT” con números separados por puntos y coma.
 * 
 * @author Ainhoa
 */
public class Modelo {
	
	/**
	 * Método que guarda al leer el fichero ENTEROS.txt en un ArrayList que a
	 * continuación devuelve
	 * 
	 * @param rutaTxt
	 * @return contenedorTxt
	 */
	public ArrayList<Integer> LeerFicheroTxt(String rutaTxt) {
		ArrayList<Integer> contenedorTxt = new ArrayList<Integer>();
		FileReader f = null;
		BufferedReader bf = null;
		String linea; 

		try {
			File fichero = new File(rutaTxt);
			f = new FileReader(fichero);
			bf = new BufferedReader(f);

			StringTokenizer tokens = null;
			while ((linea = bf.readLine()) != null) {
				tokens = new StringTokenizer(linea, ";");
				while (tokens.hasMoreTokens())
					contenedorTxt.add(Integer.parseInt(tokens.nextToken()));
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("El fichero no se encuentra");
		} catch (IOException e) {
			System.out.println("Error de E/S");
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				System.out.println("No se ha podido cerrar el archivo");
			}
		}
		return contenedorTxt;
	}

	/**
	 * Método que sirve para crear el fichero ENTEROS.bin escribiendo un
	 * ArrayList
	 * 
	 * @param rutaBin
	 * @param contenedorTxt
	 */
	
	public void crearFicheroBin(String rutaBin, ArrayList<Integer> contenedorTxt) {
		DataOutputStream dataOS = null;

		try {
			File fichero = new File(rutaBin);
			FileOutputStream filein = new FileOutputStream(fichero);
			dataOS = new DataOutputStream(filein);

			for (int i : contenedorTxt) {
				dataOS.writeInt(i);
			}
		} catch (IOException ioe) {
			System.out.println("Error en E/S");
		} finally {
			try {
				dataOS.close();
			} catch (IOException e) {
				System.out.println("No se ha podido cerrar el archivo");
			}
		}
	}

	/**
	 * Método que lee el fichero ENTEROS.bin
	 * @param rutaBin
	 */
	public void leerFicheroBin(String rutaBin) {
		DataInputStream dataIS = null;

		try {
			File fichero = new File(rutaBin);
			FileInputStream filein = new FileInputStream(fichero);
			dataIS = new DataInputStream(filein);
			
			Integer num = null;
			
			
			while(true)
			{
				num = dataIS.readInt();
				System.out.println(num);
			}
		} catch (EOFException ioe) {
			System.out.println("fin de lectura");
		} catch (IOException ioe) {
			System.out.println("Error en E/S");
		} finally {
			try {
				dataIS.close();
			} catch (IOException e) {
				System.out.println("");
			}
		}
	}
}
