/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread_Join;

import Multithread2.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paolo
 */
public class Persona extends Thread{
    /**
     * diamo un nome al thread
     * @param nome 
     */
    public Persona(String nome){
        super(nome);
    }
    public void run(){
        for(int i=0; i<10;i++){
            System.out.println(getName()+" : "+i);
            try {
                //sleep((int) (Math.random()*100));
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(getName()+" : FINITO");
    }
    
    
}
