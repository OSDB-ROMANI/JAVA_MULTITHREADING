import java.lang.Thread;

public class MultiConInnerClass2
{
  public static void main (String[]args)
  {
    Thread t1 = new Thread (new Persona("a","b"){
        public void stampa(int i){
            System.out.println(nome+cognome+" "+i);
        }
        @Override
        public void run(){
            for(int i=0;i<15;i++){
                stampa(i);
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    System.err.println (e);
                }
            }
        }
    });

    Thread t2 = new Thread (new Persona("c","d"){

        @Override
        public void run(){
            for(int i=20;i<40;i++){
                stampa(i,"-----");
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    System.err.println (e);
                }
            }
        }
    });
      
    t1.start();
    t2.start();
    
      
  }
}

class Persona implements Runnable{
    public String nome;
    public String cognome;
    
    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    
    public void stampa(){
        System.out.println("nome " + nome+ " cognome "+cognome);
    }
    
    public void stampa(int i,String s){
        System.out.println(s+nome+cognome+" "+i);
    }
    
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            stampa(i,"");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.err.println (e);
            }
        }
    }
}
