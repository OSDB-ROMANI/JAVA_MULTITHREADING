/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread_Join;

import Multithread2.Multithread2;
import Multithread2.Persona;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paolo
 */
public class MultiThread_Join {
    public static void main(String[] args){
        Persona p = new Persona("Andrea");
        Persona p1 = new Persona("Laura");
        Persona p2 = new Persona("Stefy");
        try {
            p.start();
            p.join();
            p1.start();
            p2.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(Multithread2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("main è terminato");
    }
}
