/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioconcurrencia_1;

/**
 *
 * @author Mañana
 */
public class HiloSumaPares extends Thread{
    
    @Override
    public void run(){
        
        int acumulador = 0;
        for(int i = 0; i < 1000; i++){
            if(i%2 ==0)
            acumulador += i;
            
        }
    }
}
