/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcorrenzaWait;

/**
 *
 * @author Paolo
 */
public class Main {
    public static void main(String[] args){
       Risorsa r = new Risorsa();
       Thread produttore = new Thread(new Produttore(r,"Aldo"));
       Thread consumatore = new Thread(new Consumatore(r,"Paolo"));
       Thread consumatore2 = new Thread(new Consumatore(r,"Luigia"));
       produttore.start();
       consumatore.start();
       consumatore2.start();
    }
}
