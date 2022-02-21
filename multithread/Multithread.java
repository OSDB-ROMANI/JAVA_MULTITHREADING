/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

/**
 *
 * @author Paolo
 */
public class Multithread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
            new MyThread(i,10).start();
    }
    
}
