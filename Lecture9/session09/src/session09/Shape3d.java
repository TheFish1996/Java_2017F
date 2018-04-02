package session09;

/**
 *
 * @author dkruger
 */
public interface Shape3d {
    public boolean contains(Vec3d v);
    public  Sphere boundingSphere(); 
}
