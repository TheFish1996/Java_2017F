package session09;

/**
 *
 * @author dkruger
 */
public class Sphere implements Shape3d {
    public Vec3d center;
    public double r;

    public Sphere() {
        this(new Vec3d(0,0,0), 0);
    }

    public Sphere(Vec3d center, double r) {
        this.center = center;
        this.r = r;
    }    

  
    public Sphere boundingSphere() {
        return this;
    }

   
    public boolean contains(Vec3d v) {
        return center.distSq(v) < r*r;
    }

}
