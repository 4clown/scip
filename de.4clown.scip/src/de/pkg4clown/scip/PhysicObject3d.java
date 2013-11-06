/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pkg4clown.scip;

/**
 * Beschreibt die Wechselwirkung zwischen Objekten und hinzugefügten Kräften.
 * @author nf
 */
public abstract class PhysicObject3d extends Object3d{

    private int m_mass;

   public PhysicObject3d(int m_mass, Vector3d m_position, Vector3d m_velocity, Vector3d m_acceleration, Vector3d m_lookat, Vector3d m_rotationvelocity, Vector3d m_rotationacceleration)
   {
      super(m_position, m_velocity, m_acceleration, m_lookat, m_rotationvelocity, m_rotationacceleration);
      this.m_mass = m_mass;
   }

    void forceX(float keks){
        accelerateX(keks/m_mass);
    }

    void forceY(float keks){
        accelerateY(keks/m_mass);
    }

    void forceZ(float keks){
        accelerateZ(keks/m_mass);
    }

}
