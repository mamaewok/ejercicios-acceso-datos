package com.example.botonpulsame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
/**
 * Crea la aplicación y cuenta la pulsación de un botón tanto en inglés como en estándar (español)
 * @author Ainhoa Suárez Sánchez
 */
public class Pulsame extends Activity {

	private Button btn;
	private int numVeces;
	
	/**
	 *Crea nuestra app y asocia el onClick(porque a través de activity_pulsame no funciona) 
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
//		Hacer boton sin xml:
//		btn = new Button(this);
//		btn.setText(R.string.pulsame);
//		setContentView(btn);
		
		setContentView(R.layout.activity_pulsame);
		
//		Establecer evento OnClick asi o en xml(*)
		btn = (Button)findViewById(R.id.btn);
		btn.setOnClickListener(new View.OnClickListener() {			
		public void onClick(View v) {
			botonPulsado();
		}
	});
	}

	/**
	 * Cuenta el número de veces que tocamos un botón y cambia el idioma y los plurales
	 * del programa según corresponda
	 */
	public void botonPulsado(){
		numVeces++;
		android.content.res.Resources res = getResources(); //gestor de recursos
		String numPulsados = res.getQuantityString(  //Nos da los Strings
				R.plurals.numPlurales, numVeces, numVeces);  //llamado numPlurales según 1 u otros
		btn.setText(numPulsados);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
