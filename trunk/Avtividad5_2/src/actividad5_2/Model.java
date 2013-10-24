package actividad5_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Model {

	public boolean esCaracterMinuscula(char i){
		
		return ( (i >= 'a' && i <= 'z' ) );
	}
	
	public void esLetras(String direccion){
		FileReader f = null;
		try{
			File fichero = new File(direccion);
				f = new FileReader(fichero);
				int i;
				int contadorLetra = 0;
				while((i = f.read()) != -1 ){
					
					if(esCaracterMinuscula((char)i)){
						contadorLetra++;
					}
				}
				System.out.println(
						"Tiene "+contadorLetra+" letras minúsculas puras");
				
		}catch(FileNotFoundException fnfe){
			System.out.println("");
		}catch(IOException ioe){
			System.out.println("");
		}finally{
			try{
				f.close();
			}catch(IOException ioe){
				System.out.println("");
			}
			
		}
	}
	
	
	
}
