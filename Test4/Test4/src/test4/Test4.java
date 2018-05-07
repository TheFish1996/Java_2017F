/**
 *
 * @author Jonathan
 */

package test4;
import java.lang.reflect.*;


class Running implements Runnable {

   private String name;
   
   public Running (String name){
       this.name = name;
   }
    
   @Override
   public void run () {
       
       for (;;){
           System.out.println(name);
           try {
              
               Thread.sleep(1000);
           } 
            catch (Exception e){
            
            System.out.println("Its not done yet");
           
       }

        }
    }
}

abstract class Human {
  protected int arm;
  protected int leg;
  
  public Human (){}

  public Human (int a, int b){
      arm = a;
      leg = b;
    
  }
  
  public abstract void surgery ();
  
  
}

public class Test4 extends Human {

    private String name;

    
    public Test4 (){}
    
    
    public Test4(int x, int y, String name){
        
        super (x,y);
        this.name = name;
     
        
    }
    
    public String getName(){
        
        return name;   
    }
    
    public String setName(String name){
        
        return this.name = name;
        
    }
    
    public void surgery (){
    
    Running t1 = new Running(name);
    t1.run();
    
    
    }
    
    public static void main (String [] args){
        
        Test4 test = new Test4(5, 6, "suneel");
        Object obj = test;
        Method[] c = obj.getClass().getMethods();
        test.surgery();
        
    }
    
}
