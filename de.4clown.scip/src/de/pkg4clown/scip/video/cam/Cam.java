/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pkg4clown.scip.video.cam;

import de.pkg4clown.scip.Vector3d;

/**
 *
 * @author nf
 */
public abstract class Cam{

    float m_screenWidth;
    float m_screenHeight;
    float m_screenRange;
    Vector3d m_lookat;
    Vector3d m_position;
    Vector3d m_angels;

   public Cam(
           float m_screenWidth, 
           float m_screenHeight, 
           float m_screenRange, 
           Vector3d m_position,
           Vector3d m_angles,
           Vector3d m_lookat)
   {
      this.m_screenWidth = m_screenWidth;
      this.m_screenHeight = m_screenHeight;
      this.m_screenRange = m_screenRange;
      this.m_angels = m_angles;
      this.m_lookat = m_lookat;
      this.m_position = m_position;
   }

   public Vector3d getPosition()
   {
      return m_position;
   }

   public Vector3d getAngels()
   {
      return m_angels;
   }

   public Vector3d getLookat()
   {
      return m_lookat;
   }
   
   
   
//
//    void updateCameraFollowObject(Object3d p_object){
//         setPosition(p_object.getPosition().x, p_object.getPosition().y, p_object.getPosition().z+100);
//         setAngles(p_object.getAngles().x, p_object.getAngles().y, p_object.getAngles().z+100);
//    }

//    Vector3d translatePosition(Object3d p_object){
//        
//        return new Vector3d(p_object.getPosition().x-getPosition().x
//                , p_object.getPosition().y-getPosition().y
//                , p_object.getPosition().z-getPosition().z);
//    }

//    void moveCamX(double d)
//    {
//        getLookat().x += d;
//        getPosition().x +=d;
//    }
//
//    void moveCamY(double d)
//    {
//        getLookat().y += d;
//        getPosition().y +=d;
//    }
    
//    void zoomOut(double d){
//       if(d != 0){
//          if((getPosition().z+(d*2)) < 5){
//            d= ((getPosition().z-5)*(-1))/2;
//         }
//
//         getPosition().y -=d;
//         getPosition().z +=d*2;
//       }
       
    
//    void zoomIn(double d){
//       getPosition().y +=d;
//       getPosition().z -=d*2;
//    }
//
//   public Vector3d getLookat()
//   {
//      return m_lookat;
//   }

   
   public abstract void glCam();
}

