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
public class Consumatore implements Runnable{
    private Risorsa ris;
    private String name;
    
    public Consumatore(Risorsa ris, String name){
        this.ris = ris;
        this.name = name;
    }
    
    @Override
    public void run(){
        int valore =0;
        for(int i=0;i<10;i++){
            try {
                Thread.sleep((int) (Math.random()*1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
            }            
            valore=ris.pop(name);
            if(valore == -1){
                System.out.println("Consumatore "+name+" termina");
                break;
            }
            System.out.println("Consumatore "+name+" prende: "+valore);
        }
    }
}
