package actividad5_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Model {
	
	public boolean esCaracter(char c){
		char i;
		i = Character.toUpperCase(c);
		
		return ( (i >= 'A' && i <= 'Z' ) ||i == 'Á' 
				|| i == 'É'|| i == 'Í'|| i == 'Ó'
				|| i == 'Ú'|| i == 'Ü' || i == 'Ñ' );
	}
	
	public void esLetras(String direccion){
		FileReader f = null;
		try{
			File fichero = new File(direccion);
				f = new FileReader(fichero);
				int i;
				int contadorLetra = 0;
				while((i = f.read()) != -1 ){
					
					if(esCaracter((char)i)){
						contadorLetra++;
					}
				}
				System.out.println("Tiene "+contadorLetra+" letras");
				
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
