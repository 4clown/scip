/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pkg4clown.scip.logic;

import de.pkg4clown.scip.Game;
import de.pkg4clown.scip.Object3d;
import de.pkg4clown.scip.Vector3d;
import de.pkg4clown.scip.model.Map;
import de.pkg4clown.scip.model.Ship;
import de.pkg4clown.scip.video.cam.Cam;
import de.pkg4clown.scip.video.cam.ThirdPersonCam;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.DisplayMode;

/**
 *
 * @author nf
 */
public class Logic extends Thread {

    DisplayMode m_mode;
    private Ship ship1;
    private Cam cam;
    private Map map;
    List<Object3d> models;

    public Logic() {
        models = new ArrayList<Object3d>();
        cam = new ThirdPersonCam(
                1280.0f,
                1024.0f,
                1000.0f,
                new Vector3d(0, -30, 20),
                new Vector3d(0, 0, 0),
                new Vector3d(0, 0, 0));
        map = new Map(
                new Vector3d(-10, -10, 0),
                new Vector3d(0, 0, 0),
                new Vector3d(0, 0, 0),
                new Vector3d(0, 0, 0), null, null);


        ship1 = new Ship(15000,
                new Vector3d(10, 0, 5),
                new Vector3d(0, 0, 0),
                new Vector3d(0, 0, 0),
                new Vector3d(0, 0, 0), null, null);

        models.add(ship1);
        models.add(map);
    }

    @Override
    public void run() {
        m_mode = Game.game.getRender().getMode();
        try {
            mainLoop();
        } catch (LWJGLException ex) {
            Logger.getLogger(Logic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void processMouse() {


        ((ThirdPersonCam) cam).rotateX(Mouse.getDX());
        ((ThirdPersonCam) cam).rotateY(Mouse.getDY());

//        if (Mouse.getX() >= 1260){
//            cam.moveCamX(2);
//        }
//        if (Mouse.getY() <= 20){
//            cam.moveCamY(-2);
//        }
//        if (Mouse.getY() >= 1004){
//            cam.moveCamY(+2);
//        }
//        
//
//        
//        this.cam.zoomOut(Mouse.getDWheel()/40);
    }

    private void processKeyboard() throws LWJGLException {

        Keyboard.create();
        //STONERIGHT_KEY
        if (Keyboard.isKeyDown(Keyboard.KEY_H)) {
            //ship1.accelerateRotationX(0.01);
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_G)) {
            //ship1.accelerateRotationX(-0.01);
        }

//        if (Keyboard.isKeyDown(Keyboard.KEY_DOWN))
//        {
//            this.cam.zoomOut(1);
//        }
//        
//        if (Keyboard.isKeyDown(Keyboard.KEY_UP))
//        {
//            this.cam.zoomIn(1);
//        }

        double left = 0;
        double right = 0;
        double up = 0;
        double down = 0;

        //OTHER_KEY

        if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
            //ship1.accelerateRotationY(-0.01);
            //ship1
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
            //ship1.accelerateRotationY(0.01);
            left = -1;
        }

        if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
            //ship1.accelerateFront(0.001);
            up = 1;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
            //ship1.accelerateFront(-0.001);
            down = -1;
        }
        //while (Mouse.next());
        ship1.setVelocity(new Vector3d(right + left, up + down, 0));
    }

    private void mainLoop() throws LWJGLException {
        while (true) {
            ship1.update();
            processMouse();
            processKeyboard();
            try {
                Thread.sleep(5);

            } catch (InterruptedException inte) {
            }
        }
    }

    public List<Object3d> getModels() {
        return models;
    }

    public Cam getCamera() {
        return cam;
    }
}
