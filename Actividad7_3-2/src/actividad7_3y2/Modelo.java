package actividad7_3y2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Modelo {
	
	private String direccion = "C:\\ENTEROS.bin";
	private String direccion2 = "C:\\ENTEROS.txt";
	
	
	public ArrayList<Integer> crearFichero(String ruta) {
		ArrayList<Integer> contenedor = new ArrayList<Integer>();
		FileReader f = null;
		try{
			File fichero = new File(ruta);
				f = new FileReader(fichero);
				int i;
				String num = "";
				while((i=f.read())!= -1){
					if(i != ';'){
						num += (char)i;
					}
					else{
						System.out.println(num);
						contenedor.add(Integer.parseInt(num));						
						num="";
					}
				}
				
				
		}
		catch(FileNotFoundException fnfe){
			
		}
		catch (IOException e) {
			System.out.println();
		}
		finally{
			try {
				f.close();
			} catch (IOException e) {
				System.out.println(
						"No se ha podido cerrar el archivo");			}
			
			return contenedor;
		}
		
		/**FileOutputStream fileout = null;
		try{
			
	        fileout = new FileOutputStream(f);

			int i;
			for (i = 1; i < 100; i++) {
				fileout.write(i);
			}
		}
		catch(IOException ioe){
			System.out.println("");
		}
		finally{
			try{
				fileout.close();
			}
			catch(IOException ioe){
				System.out.println(
						"No se a podido cerrar el fichero con éxito");
			}
		}*/
		
	}

	public void leerFichero() {
		try{
			File f = new File(getDireccion());
			BufferedReader fichero = new BufferedReader(
					new FileReader(getDireccion()));

			/**FileInputStream filein = new FileInputStream(f);

			int i;
			for (i = 1; i < 100; i++) {

			}*/
		}
		catch(FileNotFoundException fnfe){
			System.out.println("");
		}
	}

	/////////////////
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
