/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pkg4clown.scip.model;

import org.lwjgl.opengl.GL11;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author nf
 */
public class Stone {

   public static void render(float x, float y, float z, byte texture)
   {
      glPushMatrix();
      {
         glBegin(GL_QUADS);
         {
            //Grün NOT UNTEN
            glColor3f(0.0f, 1.0f, 0.0f);                                  // Red
            glVertex3f(x, y, z);			// Top Of Triangle (Front)
            glColor3f(0.0f, 1.0f, 0.0f);                                  // Green
            glVertex3f(x + 1, y, z);			// Left Of Triangle (Front)
            glColor3f(0.0f, 1.0f, 0.0f);                                   // Blue
            glVertex3f(x, y + 1, z);			// Right Of Triangle (Front)
            glColor3f(0.0f, 1.0f, 0.0f);                                   // Blue
            glVertex3f(x + 1, y + 1, z);		// Right Of Triangle (Front)

            //Schwarz
            glColor3f(0.0f, 0.0f, 0.0f);                                  // Red
            glVertex3f(x, y, z);			// Top Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.0f);                                 // Green
            glVertex3f(x + 1, y, z);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.0f);                                 // Blue
            glVertex3f(x, y, z + 1);			// Right Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.0f);                                 // Blue
            glVertex3f(x + 1, y, z + 1);		// Right Of Triangle (Front)

            //blau
            glColor3f(0.0f, 0.0f, 1.0f);                                   // Red
            glVertex3f(x, y, z);			// Top Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 1.0f);                                   // Green
            glVertex3f(x, y + 1, z);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 1.0f);                                  // Blue
            glVertex3f(x, y, z + 1);			// Right Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 1.0f);                                   // Blue
            glVertex3f(x, y + 1, z + 1);		// Right Of Triangle (Front)


            glColor3f(0.5f, 0.0f, 0.0f);                                  // Red
            glVertex3f(x, y + 1, z);			// Top Of Triangle (Front)
            glColor3f(0.5f, 0.0f, 0.0f);                                  // Green
            glVertex3f(x, y + 1, z + 1);			// Left Of Triangle (Front)
            glColor3f(0.5f, 0.0f, 0.0f);                                 // Blue
            glVertex3f(x + 1, y + 1, z + 1);			// Right Of Triangle (Front)
            glColor3f(0.5f, 0.0f, 0.0f);                                 // Blue
            glVertex3f(x + 1, y + 1, z);		// Right Of Triangle (Front)

            //DunkelGrün Funktioniert Oben
            glColor3f(0.0f, 0.5f, 0.0f);                                  // Red
            glVertex3f(x, y, z + 1);			// Top Of Triangle (Front)
            glColor3f(0.0f, 0.5f, 0.0f);                                 // Green
            glVertex3f(x, y + 1, z + 1);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.5f, 0.0f);                                // Blue
            glVertex3f(x + 1, y + 1, z + 1);			// Right Of Triangle (Front)
            glColor3f(0.0f, 0.5f, 0.0f);                                 // Blue
            glVertex3f(x + 1, y, z + 1);		// Right Of Triangle (Front)


            glColor3f(0.0f, 0.0f, 0.5f);                                  // Red
            glVertex3f(x + 1, y + 1, z);			// Top Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.5f);                                 // Green
            glVertex3f(x + 1, y + 1, z + 1);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.5f);                                 // Blue
            glVertex3f(x + 1, y, z + 1);			// Right Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.5f);                                 // Blue
            glVertex3f(x + 1, y, z);		// Right Of Triangle (Front)
         }
         glEnd();
      }
      glPopMatrix();
   }
}

