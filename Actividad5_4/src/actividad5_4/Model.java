package actividad5_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Model {

	public void leerLinea(String direccion){
		BufferedReader fichero = null;
		try{
			fichero = new BufferedReader(
					new FileReader(direccion));
			int contadorLinea = 0;
			while((fichero.readLine())!= null){
				contadorLinea++;
			}
			System.out.println("Tiene " + contadorLinea + " lineas");
			
		}catch(FileNotFoundException fnfe){
			System.out.println("");
		}catch(IOException ioe){
			System.out.println("");
		}finally{
			
		}
	}
}
