/**
 *
 * @author Jonathan
 */

package test3;


public class ThisExample {

    double x,y;

    public ThisExample(double a, double b){
        
        x = a;
        y = b;
        System.out.println("Hello im gay");
        
    }
    
    public ThisExample(double z){
        
        this(z,z);
        x = x + z;
        
        
    }
    
    public double Returna(){
        
        return x;
        
    }
    
    public static void main (String [] args){
        ThisExample test1 = new ThisExample(3);
        ThisExample test2 = new ThisExample(3,6);
        System.out.println(test1.Returna());
        System.out.println(test2.Returna());
        
        
        
    }
    
    
    
}
