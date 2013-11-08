package actividad7_3y2;

public class Actividad7_3y2 {

	public static void main(String[] args) {

		String direccionTxt = "C:\\ENTEROS.csv";
		String direccionBin = "C:\\ENTEROS.bin";
		// ArrayList<Integer> lista;

		Modelo m = new Modelo();
		m.crearFicheroBin(direccionBin, m.LeerFicheroTxt(direccionTxt));
		m.leerFicheroBin(direccionBin);
		

	}

}
