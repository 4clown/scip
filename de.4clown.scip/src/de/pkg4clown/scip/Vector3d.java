/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.pkg4clown.scip;

/**
 *
 * @author nf
 */
public class Vector3d {

    public double x;
    public double y;
    public double z;

    public Vector3d(){
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector3d(double p_x, double p_y, double p_z){
        x = p_x;
        y = p_y;
        z = p_z;
    }

   @Override
   public String toString()
   {
      return "x: "+x+" y: "+y+" z: "+z+";";
   }
}
