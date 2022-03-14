import java.lang.Thread;

public class RunnableLambda
{
  public static void main (String[]args)
  {
    Thread t1 = new Thread(()->{
        for(int i = 0; i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.err.println (e);
            }
        }
    });
    
    Thread t2 = new Thread(()->{
        for(int i = 0; i<10;i++){
            System.out.println("         "+i);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.err.println (e);
            }
        }
    });
      
    t1.start();
    t2.start();
      
  }
}
