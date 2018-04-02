/**
 *
 * @author Jonathan
 */

package session09;

// Static classes are basically a way of grouping classes together in Java. Java doesn't allow you to create top-level static classes; only nested (inner) static classes.
// Static classes dont need to reference outer class, they are there own class
// Nested static classes are able to access static data members of the top-level class (and call static methods), but they are unable to access non-static data members since you 
// can create an instance of a static inner class without creating any instance of the outer class.
public class Quiz1 {
    private static String h; // has to be static for it to see it

  public static class StaticClass {
     private int a, b; 
     
     public StaticClass(int x,int y){
         
         a = x;
         b = y;       
     } 
      
     public void hello (){
         h = "the variable a : ";
         System.out.println("this is the value of " + h + " "  + a);  
         
     }
     
  }

    public static void main (String [] args){
        
        Quiz1.StaticClass a = new Quiz1.StaticClass(1, 2);
        a.hello();
 
    }
  
}

