package actividad1y2;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Model {

	private File direcci�n = new File("C:\\");
	
	public Model(ArrayList<Double>contenedorDouble){
		
		try {
			
			FileOutputStream filein = new FileOutputStream(direcci�n);
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

	public File getDirecci�n() {
		return direcci�n;
	}

	public void setDirecci�n(File direcci�n) {
		this.direcci�n = direcci�n;
	}

	
}
