/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiRunnable;

/**
 *
 * @author Paolo
 */
public class MultiRunneble {
    public static void main(String[] args) {    
        for(int i=0;i<5;i++)
            new Thread(new MyRunnable(i,10)).start();
    }    
}
