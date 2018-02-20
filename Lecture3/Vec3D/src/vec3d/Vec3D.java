/**
 *
 * Author : Jonathan Fishkin
 * Cite: Suhail Mansuri
 */

package vec3d;

public class Vec3D {

private double x, y, z;

public Vec3D (int a, int b, int c){
    x = a;
    y = b;
    z = c;
    
}

public Vec3D (double a, double b, double c){
    x = a;
    y = b;
    z = c;   
}

public String toString(){
    return x + "," + y + "," + z;   
}

public Vec3D add (Vec3D b){
    Vec3D result = new Vec3D (x + b.x, y + b.y, z + b.z);
    return result;
    
}

public Vec3D sub (Vec3D b){
    Vec3D result = new Vec3D (x - b.x, y - b.y, z - b.z);
    return result;   
}

public static double dot (Vec3D left, Vec3D right){
    double result = left.x*right.x + left.y*right.y + left.z*right.z;
    return result;
    
}

public double dot (Vec3D b){
    double result = x*b.x + y*b.y + z*b.z;
    return result;   
}

public Vec3D neg () {
    Vec3D result = new Vec3D (-x, -y, -z);
    return result;
    
    
}
 
  public static void main(String[]args){
      Vec3D a = new Vec3D(1,2,3);
      Vec3D b = new Vec3D(1.5,2.5,-3.2);
      System.out.println(a);  //1.0, 2.0, 3.0
      System.out.println(b);  //1.5, 2.5, -3.2
      Vec3D c  = a.add(b);
      Vec3D e  = a.sub(b);
      System.out.println(c); // 2.5, 4.5, -0.2
      System.out.println(e);
      double x = dot(a,b);
      double d = a.dot(b);
      System.out.println("dot=" + d);
      System.out.println(x);
      Vec3D f = a.neg(); // -1, -2, -3
      System.out.println(f);
      
      
  }
    
}
