
/**
 *
 * @author jojob
 */

package session6;
import static java.lang.Math.*;

public class Rect extends Shape2D {
    private int x2,y2;
    
    public Rect(int x, int y, int w, int h){
        super(x,y);
        x2 = x + w; y2 = y + h;
    }
    
    public double area(){
        return abs((x2 - getX())*(y2 - getY()));   
    }
    public String toString(){ return super.toString() + ", w=" + (x2 - getX()) + " , h=" + (y2 - getY());
    
    }
    
    public int getL(){ return x2 - getX();}
    public int getW(){ return y2 - getY();}
    

}
