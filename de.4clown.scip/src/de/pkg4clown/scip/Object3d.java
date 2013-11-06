/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pkg4clown.scip;

/**
 *
 * @author nf
 */
public abstract class Object3d {

   //Position und Positionsänderung
   private Vector3d m_position;
   private Vector3d m_velocity;
   private Vector3d m_acceleration;
   //Ausrichtung und Moment
   private Vector3d m_angles;
   private Vector3d m_rotationvelocity;
   private Vector3d m_rotationacceleration;

   public Object3d(Vector3d m_position,
           Vector3d m_velocity,
           Vector3d m_acceleration,
           Vector3d m_angles,
           Vector3d m_rotationvelocity,
           Vector3d m_rotationacceleration)
   {
      setPosition(m_position);
      setVelocity(m_velocity);
      setAcceleration(m_acceleration);
      this.m_angles = ((m_angles != null) ? m_angles : new Vector3d(0, 0, 0));
      this.m_rotationvelocity = ((m_rotationvelocity != null) ? m_rotationvelocity : new Vector3d(0, 0, 0));
      this.m_rotationacceleration = ((m_rotationacceleration != null) ? m_rotationacceleration : new Vector3d(0, 0, 0));
   }

   public void update()
   {
      updateVelocity();
      updatePosition();
      updateLookAt();
   }

   //Methoden für Position..........................................................................
   public void setPosition(double x, double y, double z)
   {
      m_position.x = x;
      m_position.y = y;
      m_position.z = z;
   }
   
   public void setPosition(Vector3d m_position)
   {
      this.m_position = ((m_position != null) ? m_position : new Vector3d(0, 0, 0));
   }

   public void setPositionX(double x){
      this.m_position.x = x;
   }
   
   public void setPositionY(double y){
      this.m_position.y = y;
   }
   
   public void setPositionZ(double z){
      this.m_position.z = z;
   }
   
   public Vector3d getPosition()
   {
      return m_position;
   }
   
   public void updatePosition()
   {
      m_position.x += m_velocity.x;
      m_position.y += m_velocity.y;
      m_position.z += m_velocity.z;
   }
   
   //Methoden für Velocity..........................................................................
   
   public void setVelocity(double x, double y, double z)
   {
      m_velocity.x = x;
      m_velocity.y = y;
      m_velocity.z = z;
   }
   
   public void setVelocity(Vector3d m_velocity)
   {
      this.m_velocity = ((m_velocity != null) ? m_velocity : new Vector3d(0, 0, 0));
   }

   public void setVelocity(double geschwindigkeit, double x, double y, double z)
   {
      //Erhöht geschwindigkeit in richtung
   }
   
   public double getVelocityX()
   {
      return this.m_velocity.x;
   }
   
   public double getVelocityY()
   {
      return this.m_velocity.y;
   }
   
   public double getVelocityZ()
   {
      return this.m_velocity.z;
   }
   
   public void setVelocityX(double d)
   {
      this.m_velocity.x = d;
   }
   
   public void setVelocityY(double d)
   {
      this.m_velocity.y = d;
   }
   
   public void setVelocityZ(double d)
   {
      this.m_velocity.z = d;
   }
   
   public void updateVelocity()
   {
      m_velocity.x += m_acceleration.x;
      m_velocity.y += m_acceleration.y;
      m_velocity.z += m_acceleration.z;
   }

   //Methoden für Acceleration..........................................................................
   
   public void setAcceleration(double x, double y, double z)
   {
      m_acceleration.x = x;
      m_acceleration.y = y;
      m_acceleration.z = z;
   }

   public void setAcceleration(Vector3d m_acceleration)
   {
      this.m_acceleration = ((m_acceleration != null) ? m_acceleration : new Vector3d(0.0, 0.0, 0.0));
   }

   public void setAcceleration(double geschwindigkeit, double x, double y, double z)
   {
      m_acceleration.x += (Math.sin(Math.toRadians(x))) * geschwindigkeit;
      m_acceleration.y += (Math.sin(Math.toRadians(y))) * geschwindigkeit;
      m_acceleration.z += (Math.cos(Math.toRadians(z))) * geschwindigkeit;
   }
   
   public void accelerateX(double keks)
   {
      m_velocity.x += keks;
   }

   public void accelerateY(double keks)
   {
      m_velocity.y += keks;
   }

   public void accelerateZ(double keks)
   {
      m_velocity.z += keks;
   }

   //Methoden für Winkel............................................................................
   public void updateLookAt()
   {
      m_angles.x += m_rotationvelocity.x;
      m_angles.y += m_rotationvelocity.y;
      m_angles.z += m_rotationvelocity.z;

      m_angles.x = cureAngel(m_angles.x);
      m_angles.y = cureAngel(m_angles.y);
      m_angles.z = cureAngel(m_angles.z);
   }

   public void setAngelX(double p_keks)
   {
      m_angles.x = cureAngel(p_keks);
   }

   public void setAngelY(double p_keks)
   {
      m_angles.y = cureAngel(p_keks);
   }

   public void setAngelZ(double p_keks)
   {
      m_angles.z = cureAngel(p_keks);
   }

   public double cureAngel(double p_angel)
   {
      if (p_angel < 0)
      {
         p_angel += 360;
      } else if (p_angel > 360)
      {
         p_angel -= 360;
      }
      return p_angel;
   }

   public Vector3d getAngles()
   {
      return m_angles;
   }
   
   public Vector3d getAnglesForEngine(){
       return new Vector3d(
              this.m_angles.x/360, 
              this.m_angles.y/360, 
              this.m_angles.z/360);
   }
   
   public void setAngles(double x, double y, double z)
   {
      m_angles.x = x;
      m_angles.y = y;
      m_angles.z = z;
   }

   public void accelerateFront(double keks)
   {
      m_velocity.x += (Math.sin(Math.toRadians(m_angles.y)) * Math.cos(Math.toRadians(m_angles.z))) * keks;
      m_velocity.y += (Math.sin(Math.toRadians(m_angles.x)) * Math.cos(Math.toRadians(m_angles.z))) * keks;
      m_velocity.z += (Math.cos(Math.toRadians(m_angles.x)) * Math.cos(Math.toRadians(m_angles.y))) * keks;
   }

   public void accelerateRotationX(double keks)
   {
      m_rotationvelocity.x += keks;
   }

   public void accelerateRotationY(double keks)
   {
      m_rotationvelocity.y += keks;

   }

   public void accelerateRotationZ(double keks)
   {
      m_rotationvelocity.z += keks;
   }
   
   public abstract void render();
   //------------------------------------------------------------------
   // Movement for Character or KI, No Physics
}
