/**
 *
 * @author Jonathan
 */

package session09;


public class Quiz {

    //anonymous inner class are delcared without any name at all. Created in two ways, either as a subclass or implementer of a specific method
    //always written as static type a = new type () { };
    //used to override a certain subclass
    static Demo d = new Demo(){
     void test(){                  // overrided the main class name test
        System.out.println("This worked and i created an anonymous inner class");       
     }
   };
     
    static test b = new test (){
        
      public void h(){
       int x= 1;
       System.out.println("This is x" + x);
      }  
        
    };
    
    public static void main (String [] args){
       
        Quiz a = new Quiz();
        a.d.test();
        d.test();    // static reference
        
        a.b.h();
        b.h();    //static reference
        
        
    }

}


 class Demo {
   void test() {
      System.out.println("i am in show method of super class");
   }
}

 interface test {
     
  public void h();   
     
 }