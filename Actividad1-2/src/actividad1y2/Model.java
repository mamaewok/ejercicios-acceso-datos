package actividad1y2;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Model {

	private File dirección = new File("C:\\");
	
	public Model(ArrayList<Double>contenedorDouble){
		
		try {
			
			FileOutputStream filein = new FileOutputStream(dirección);
			DataOutputStream datos = new DataOutputStream(filein);
			
			//for(int i = 0; contenedorDouble.size(); i++){
			//	datos.write();
			//}  TODO recorrer arraylist
		}
		catch (IOException ioe) {
			System.out.println("Error de E/S");
		}
	}
	
	public void leerFichero(){
		
	}

	public File getDirección() {
		return dirección;
	}

	public void setDirección(File dirección) {
		this.dirección = dirección;
	}

	
}
