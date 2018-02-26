
/**
 *
 * @author jojob
 */

//Abstract base class for all 2d shapes
//creates shape mold
package session6;

public abstract class Shape2D {
    private int x, y;
    
    public Shape2D(int x, int y){
        this.x = x;
        this.y = y;
        
      
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public String toString(){
        return getClass().getSimpleName() + x + ", y=" + y; // gets what the simple name of the class is
    }
    
    public abstract double area ();  // require to compute area, every child should be able to compute this
    
}