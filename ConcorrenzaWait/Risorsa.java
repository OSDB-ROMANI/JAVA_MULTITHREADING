/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcorrenzaWait;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paolo
 */
public class Risorsa {
    private int valore;
    private boolean disponibile = false;
    private boolean ferma = false;
    
    public synchronized int pop(String name){
        while(!disponibile){
            if(ferma)
                return -1;
            System.out.println("Consumatore "+name+" aspetta");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Risorsa.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        disponibile = false;
        notifyAll();
        return valore;
    }
    
    public synchronized void push(int i){
        while(disponibile){
            System.out.println("Produttore aspetta");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Risorsa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        valore = i;
        disponibile = true;
        notifyAll();
    }
    public synchronized void ferma(){
        ferma = true;
    }
}
