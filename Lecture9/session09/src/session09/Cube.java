package session09;

/**
 *
 * @author dkruger
 */
public class Cube implements Shape3d {
    private Vec3d corner1, corner2;
    public Cube(Vec3d corner1, Vec3d corner2) {
        this.corner1 = corner1; this.corner2 = corner2;
    }
    public boolean contains(Vec3d v) {
        boolean x = true;
        return x;
    }
    
    public Sphere boundingSphere() {
       return new Sphere();
    }
}
