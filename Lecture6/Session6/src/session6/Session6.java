
/**
 *
 * @author jojob
 */

package session6;

public class Session6 {
    

    public static void main (String [] args){
    A a1 = new A();
    a1.f();
    
    }
}
//concrete class
class A {
   private int x;
   public A(){
   }
   private void g(){}
   void f(){    g();       g();}  
    
    
}
//class that cant be instantiated (cannto say new B))
abstract class B{
    private int x;
    public B()   {} // may have a costructor

}


class C extends B { // class C is a kind of B
 private int y;
    
    
}



