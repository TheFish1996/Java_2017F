/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vec3d;

/**
 *
 * @author jojob
 */
public class Vec3D {
 private double x , y , z;
 
 
 public Vec3D(int a, int b, int c){
     x = a;
     y = b;
     z = c;    
 }
 
 public Vec3D(double a, double b, double c){
     x = a;
     y = b;
     z = c;   
 }
 
 public String tostring(){
     return x + "," + y  + "," + z;
 }

  public static void main(String[]args){
      Vec3D a = new Vec3D(1,2,3);
      Vec3D b = new Vec3D(1.5,2.5,-3.2);
      System.out.println(a): //1.0, 2.0, 3.0
      Vec3D c  = a.add(b);
      Vec3D e  = a.sub(b);
      System.out.println(e);
      System.out.println(c); // 2.5, 4.5, -0.2
      // dot(a,b) = a.x*b.x + a.y*b.y + a.z*b.z
      double d = c.dot(a);
      System.out.println("dot=" + d);
      Vec3D f = a.neg(); // -1, -2, -3
      System.out.println(f);
      
      
  }
    
}
