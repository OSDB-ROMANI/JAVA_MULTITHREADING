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
public class Produttore implements Runnable{
    private Risorsa ris;
    private String name;
    
    public Produttore(Risorsa ris, String name){
        this.ris = ris;
        this.name = name;
    }
    
    @Override
    public void run(){
        for(int i=1;i<11;i++){
            try {
                Thread.sleep((int) (Math.random()*500));
            } catch (InterruptedException ex) {
                Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
            }
            ris.push(i);
            System.out.println("Produttore "+name+" aggiunge: "+i);
        }
        ris.ferma();
    }
}
