/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pkg4clown.scip.video.cam;


import de.pkg4clown.scip.Vector3d;
import static org.lwjgl.util.glu.GLU.*;
/**
 *
 * @author nf
 */
public class ThirdPersonCam extends Cam{

   double xvector;
   double yvector;
   private final double sensivity = 3;
   
   public ThirdPersonCam(float m_screenWidth, float m_screenHeight, float m_screenRange, Vector3d m_position, Vector3d m_angles, Vector3d m_lookat)
   {
      super(m_screenWidth, m_screenHeight, m_screenRange, m_position, m_angles, m_lookat);
      xvector = 0;
      yvector = 0;
   }

   //doppelte Vectoren für blickrichtung
   
   
   @Override
   public void glCam()
   {
//      System.out.print("X: "+(Math.cos(xvector)+Math.cos(yvector)));
//      System.out.print(" Y: "+(Math.sin(xvector)+Math.cos(yvector)));
//      System.out.println(" Z: "+(Math.sin(xvector)+Math.sin(yvector)));
//      
//      gluLookAt((float)getPosition().x
//                , (float)getPosition().y
//                , (float)getPosition().z
//                , (float)(Math.cos(xvector)+Math.cos(yvector))
//                , (float)(Math.sin(xvector)+Math.cos(yvector))
//                , (float)(Math.sin(xvector)+Math.sin(yvector))
//                , (float)getAngels().x
//                , (float)getAngels().y
//                , (float)getAngels().z);
      
      System.out.print("X: "+(Math.cos(xvector)));
      System.out.print(" Y: "+(Math.sin(xvector)));
      System.out.println(" Z: ");
      
      gluLookAt((float)getPosition().x
                , (float)getPosition().y
                , (float)getPosition().z
                , (float)(Math.cos(xvector))//+Math.cos(yvector))
                , (float)(Math.sin(xvector))//+Math.cos(yvector))
                , (float)0
                , (float)getAngels().x
                , (float)getAngels().y
                , (float)getAngels().z);
   }
   
   public void rotateX(double x){
      if(x != 0){
         this.xvector +=(x/10)*sensivity;
         if(this.xvector >360){
            this.xvector  %= 360;
         }
      }
      
   }
   public void rotateY(double y){
      if(y != 0){
         this.yvector +=(y/10)*sensivity;
         if(this.yvector >360){
            this.yvector  %= 360;
         }
      }
   }
   

   
}