/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioconcurrencia_1;

/**
 *
 * @author Mañana
 */
public class EjercicioConcurrencia_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Thread h1 = new HiloSumaPares();
            h1.start();
        Thread h2 = new HiloSumaImpares();
            h2.start();
        Thread h3 = new HiloSumaTerminan();
            h3.start();
        
        
        }
}
