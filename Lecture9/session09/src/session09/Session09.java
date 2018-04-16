/**
 *
 * @author Jonathan
 */




public class Session09 {

    public static void f(){
        B b1 = new B(3);
        A a1 = new A();
        System.out.println("+" + a1 + "+");
    }
    
    public static void main (String [] args){
       System.out.println(A.getCount());
       f();
       System.out.println(A.getCount());
         
        
    }
    
    
    

}


class A {
    
   private static int count = 5;
   public  A() {System.out.print('f'); count--;}
   public void A() {System.out.println('e');}
   public String toString(){ return "d";}
   public void f() {System.out.println('c');}
    
}
