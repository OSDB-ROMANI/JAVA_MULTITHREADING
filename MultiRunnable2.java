import java.lang.Thread;

public class MultiRunnable2
{
  public static void main (String[]args)
  {
        Thread p1 = new Thread(new Persona ("a", "b"));
        Thread p2 = new Thread(new Persona ("c", "d"));
        Thread p3 = new Thread(new Persona ("e", "f"));
        p1.start();
        p2.start();
        p3.start();
  }
}
class Persona implements Runnable{
    private String nome;
    private String cognome;
    
    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }
    
    public void stampa(){
        System.out.println("nome " + nome+ " cognome "+cognome);
    }
    
    public void stampa(int i){
        System.out.println(nome+ " "+cognome+" "+i);
    }
    
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            stampa(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.err.println (e);
            }
        }
    }
}
