/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pkg4clown.scip.model;

import de.pkg4clown.scip.PhysicObject3d;
import de.pkg4clown.scip.Vector3d;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author nf
 */
public class Ship extends PhysicObject3d {

    public Ship(int m_mass, Vector3d m_position, Vector3d m_velocity, Vector3d m_acceleration, Vector3d m_lookat, Vector3d m_rotationvelocity, Vector3d m_rotationacceleration) {
        super(m_mass, m_position, m_velocity, m_acceleration, m_lookat, m_rotationvelocity, m_rotationacceleration);
    }

    private void model() {
        //FLÜGEL FRONT AUSSEN 1
        glBegin(GL_TRIANGLES);
        {
            glColor3f(1.0f, 0.0f, 0.0f);			// Red
            glVertex3f(1.0f, 0.0f, 4.0f);			// Top Of Triangle (Front)
            glColor3f(0.0f, 1.0f, 0.0f);			// Green
            glVertex3f(3.0f, 0.0f, 0.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 1.0f);			// Blue
            glVertex3f(1.5f, 0.5f, 0.0f);			// Right Of Triangle (Front)

            glColor3f(1.0f, 0.0f, 0.0f);			// Red
            glVertex3f(1.0f, 0.0f, 4.0f);			// Top Of Triangle (Front)
            glColor3f(0.0f, 1.0f, 0.0f);			// Green
            glVertex3f(3.0f, 0.0f, 0.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 1.0f);			// Blue
            glVertex3f(1.5f, -0.5f, 0.0f);			// Right Of Triangle (Front)

            // FLÜGEL FRONT INNEN 2

            glColor3f(0.0f, 0.0f, 0.0f);			// Red
            glVertex3f(1.0f, 0.0f, 4.0f);			// Top Of Triangle (Front)
            glColor3f(1.0f, 1.0f, 1.0f);			// Green
            glVertex3f(2.0f, 0.0f, 0.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.0f);			// Blue
            glVertex3f(1.5f, 0.5f, 0.0f);			// Right Of Triangle (Front)

            glColor3f(0.0f, 0.0f, 0.0f);			// Red
            glVertex3f(1.0f, 0.0f, 4.0f);			// Top Of Triangle (Front)
            glColor3f(1.0f, 1.0f, 1.0f);			// Green
            glVertex3f(2.0f, 0.0f, 0.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.0f);			// Blue
            glVertex3f(1.5f, -0.5f, 0.0f);			// Right Of Triangle (Front)

            //FLÜGEL BACK AUSSEN 3
            glColor3f(1.0f, 0.0f, 0.0f);			// Red
            glVertex3f(2.0f, 0.0f, -2.0f);			// Top Of Triangle (Front)
            glColor3f(0.0f, 1.0f, 0.0f);			// Green
            glVertex3f(3.0f, 0.0f, 0.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 1.0f);			// Blue
            glVertex3f(1.5f, 0.5f, 0.0f);			// Right Of Triangle (Front)

            glColor3f(1.0f, 0.0f, 0.0f);			// Red
            glVertex3f(2.0f, 0.0f, -2.0f);			// Top Of Triangle (Front)
            glColor3f(0.0f, 1.0f, 0.0f);			// Green
            glVertex3f(3.0f, 0.0f, 0.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 1.0f);			// Blue
            glVertex3f(1.5f, -0.5f, 0.0f);			// Right Of Triangle (Front)

            //TORSO DECK AUSSEN 4
            glColor3f(1.0f, 0.0f, 0.0f);			// Red
            glVertex3f(2.0f, 0.0f, -2.0f);			// Top Of Triangle (Front)
            glColor3f(0.0f, 1.0f, 0.0f);			// Green
            glVertex3f(0.0f, 0.6f, -1.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 1.0f);			// Blue
            glVertex3f(1.5f, 0.5f, 0.0f);			// Right Of Triangle (Front)

            glColor3f(1.0f, 0.0f, 0.0f);			// Red
            glVertex3f(2.0f, 0.0f, -2.0f);			// Top Of Triangle (Front)
            glColor3f(0.0f, 1.0f, 0.0f);			// Green
            glVertex3f(0.0f, -0.6f, -1.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 1.0f);			// Blue
            glVertex3f(1.5f, -0.5f, 0.0f);			// Right Of Triangle (Front)

            //TORSO DECK2 AUSSEN 5
            glColor3f(1.0f, 0.0f, 0.0f);			// Red
            glVertex3f(2.0f, 0.0f, -2.0f);			// Top Of Triangle (Front)
            glColor3f(0.0f, 1.0f, 0.0f);			// Green
            glVertex3f(0.0f, 0.6f, -1.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 1.0f);			// Blue
            glVertex3f(0.0f, 0.4f, -2.1f);			// Right Of Triangle (Front)

            glColor3f(1.0f, 0.0f, 0.0f);			// Red
            glVertex3f(2.0f, 0.0f, -2.0f);			// Top Of Triangle (Front)
            glColor3f(0.0f, 1.0f, 0.0f);			// Green
            glVertex3f(0.0f, -0.6f, -1.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 1.0f);			// Blue
            glVertex3f(0.0f, -0.4f, -2.1f);			// Right Of Triangle (Front)

            //ANTRIEB
            glColor3f(0.8f, 0.8f, 1.0f);			// Red
            glVertex3f(2.0f, 0.0f, -2.0f);			// Top Of Triangle (Front)
            glColor3f(0.8f, 0.8f, 1.0f);			// Green
            glVertex3f(0.0f, 0.4f, -2.1f);			// Right Of Triangle (Front)
            glColor3f(0.8f, 0.8f, 1.0f);			// Blue
            glVertex3f(0.0f, -0.4f, -2.1f);			// Right Of Triangle (Front)

            //TORSO FRONT Part 1
            glColor3f(1.0f, 1.0f, 1.0f);			// Red
            glVertex3f(0.0f, 0.0f, -1.2f);			// Top Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.0f);			// Green
            glVertex3f(0.0f, 0.6f, -1.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.0f);			// Blue
            glVertex3f(1.5f, 0.5f, 0.0f);			// Right Of Triangle (Front)

            glColor3f(1.0f, 1.0f, 1.0f);			// Red
            glVertex3f(0.0f, 0.0f, -1.2f);			// Top Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.0f);			// Green
            glVertex3f(0.0f, -0.6f, -1.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.0f);			// Blue
            glVertex3f(1.5f, -0.5f, 0.0f);			// Right Of Triangle (Front)

            //TORSO FRONT Part 2
            glColor3f(1.0f, 1.0f, 1.0f);			// Red
            glVertex3f(0.0f, 0.0f, -1.2f);			// Top Of Triangle (Front)
            glColor3f(1.0f, 1.0f, 1.0f);			// Green
            glVertex3f(2.0f, 0.0f, 0.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.0f);			// Blue
            glVertex3f(1.5f, 0.5f, 0.0f);			// Right Of Triangle (Front)

            glColor3f(1.0f, 1.0f, 1.0f);			// Red
            glVertex3f(0.0f, 0.0f, -1.2f);			// Top Of Triangle (Front)
            glColor3f(1.0f, 1.0f, 1.0f);			// Green
            glVertex3f(2.0f, 0.0f, 0.0f);			// Left Of Triangle (Front)
            glColor3f(0.0f, 0.0f, 0.0f);			// Blue
            glVertex3f(1.5f, -0.5f, 0.0f);			// Right Of Triangle (Front)
        }
    }

    public void push() {
        glPushMatrix();
        {

            glTranslatef((float) getPosition().x, (float) getPosition().y, (float) getPosition().z);
            glRotatef((float) getAngles().y, 0.0f, 1.0f, 0.0f);
            glRotatef((float) getAngles().z, 0.0f, 0.0f, 1.0f);
            glRotatef((float) getAngles().x, 1.0f, 0.0f, 0.0f);

            model();
            glEnd();
            glRotatef(180, 0.0f, 0.0f, 1.0f);
            model();
            glEnd();
            glLoadIdentity();
        }
        glPopMatrix();
    }

    @Override
    public void render() {
        this.push();
    }
}
