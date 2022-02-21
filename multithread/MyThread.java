/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paolo
 */
public class MyThread extends Thread{
    private int name, num;
    
    public MyThread(int name,int num){
        this.name = name; 
        this.num = num;
    }
    @Override
    public void run() {
        for(int i =0; i < num; i++){
            System.out.println("thread "+name+" - "+i);
            if(name == 1)
                throw new RuntimeException("Errore nel thread "+name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
