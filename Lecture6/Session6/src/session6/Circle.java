
/**
 *
 * @author jojob
 */

package session6;

//this class is immutable (cant change)
public class Circle extends Shape2D {
    private int r;
    
    public Circle (int x, int y, int r){
       super(x,y); 
       this.r = r;
           
    }
    
    public int getR(){
        return r;
    }
    
    public double area(){
        return Math.PI * r * r;
        
        
    }
    
    public String toString(){
        return super.toString() + ", r=" + r;  //super is name for parent. Only can have one parent
    }

}
