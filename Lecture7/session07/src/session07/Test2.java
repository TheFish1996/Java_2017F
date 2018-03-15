/**
 *
 * @author Jonathan
 */

package session07;


public class Test2 {

    
    
    public static void main (String [] args){
        
       A a1 = new A(); // __________________________
       B b1;           // __________________________
       B b2 = new B(5);// __________________________
       A1 a2 = new A(2);// __________________________
       C1 c1;           // __________________________
       C1 c2 = new C(); // __________________________
       D d1 = new D(); // __________________________
       E e1 = new E();  
        
        
        
        
    }
    
    

}





class A1 {
}

abstract class B {
  public B(int x) { System.out.println(x); }
}
interface C1 {
   public void f();
}
/* class D implements C1{         // if you write this then you can instantiate in the main
  private int x;
  public D() { x = 99; }

  public void f() {
        System.out.println("Hello");
    }
}

*/
abstract class D implements C1{         // if you write this you dont need to include f 
  private int x;
  public D() { x = 99; }

}





class E extends D {
  public void f() { System.out.println("testing"); }
}
