/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pkg4clown.scip.model;

import de.pkg4clown.scip.Object3d;
import de.pkg4clown.scip.Vector3d;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author nf
 */
public class Map extends Object3d {

   byte[][][] maparray = new byte[40][20][1];

   public Map(Vector3d m_position, Vector3d m_velocity, Vector3d m_acceleration, Vector3d m_lookat, Vector3d m_rotationvelocity, Vector3d m_rotationacceleration)
   {
      super(m_position, m_velocity, m_acceleration, m_lookat, m_rotationvelocity, m_rotationacceleration);
      initMap();
   }

   private void initMap()
   {
      //all 0
      for (int x = 0;
              x < 40;
              x++)
      {
         for (int y = 0;
                 y < 20;
                 y++)
         {
            for (int z = 0;
                    z < 1;
                    z++)
            {
               maparray[x][y][z] = 1;
            }
         }
      }
   }

   public void renderMap()
   {
      for (int x = 0;
              x < 40;
              x++)
      {
         for (int y = 0;
                 y < 20;
                 y++)
         {
            for (int z = 0;
                    z < 1;
                    z++)
            {
               Stone.render((float)x, (float)y, (float)z, this.maparray[x][y][z]);
            }
         }
      }
   }

   public void push()
   {
      glPushMatrix();
      {

         glTranslatef((float) getPosition().x, (float) getPosition().y, (float) getPosition().z);

         renderMap();
         glLoadIdentity();
      }
      glPopMatrix();
   }

   @Override
   public void render()
   {
      this.push();
   }
}
