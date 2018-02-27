/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session6;

/**
 *
 * @author jojob
 */
public interface Shape3d_2 {
    public Sphere boundingSphere();  // abstract is understood only if its an INTERFACE
    public double volume();
    public Shape3d_2 inverse();
    
}
