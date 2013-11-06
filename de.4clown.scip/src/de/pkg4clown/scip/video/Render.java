/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pkg4clown.scip.video;

import de.pkg4clown.scip.Game;
import de.pkg4clown.scip.Object3d;
import de.pkg4clown.scip.logic.Logic;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import static org.lwjgl.util.glu.GLU.gluPerspective;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author nf
 */
public class Render extends Thread
{

    /** Intended deiplay mode */
    private DisplayMode m_mode;
    private Logic logic;
    double mat_solid[] =
    {
        0.75, 0.75, 0.0, 1.0
    };
    double mat_zero[] =
    {
        0.0, 0.0, 0.0, 1.0
    };
    double mat_transparent[] =
    {
        0.0, 0.8, 0.8, 0.6
    };
    double mat_emission[] =
    {
        0.0, 0.3, 0.3, 0.6
    };

    double solidZ = 8;
    double transparentZ = -8;


    float TEST1 = 0, TEST2 = 0;

    public Render()
    {
        //
        try
        {
            switchMode();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    /**
     * Executes the test
     */
    @Override
    public void run()
    {
        try
        {
            // start of in windowed mode
            Display.create();
            reSizeGLScene();
            glInit();

        } catch (Exception e)
        {
            e.printStackTrace();
        }

     
        logic = Game.game.getLogic();

        mainLoop();

        cleanup();


    }

    private void switchMode() throws LWJGLException
    {
        m_mode = findDisplayMode(800, 600, Display.getDisplayMode().getBitsPerPixel());
        Display.setDisplayMode(m_mode);
    }

    /**
     * Runs the main loop of the "test"
     */
    private void mainLoop()
    {
        while (!Keyboard.isKeyDown(Keyboard.KEY_ESCAPE) && !Display.isCloseRequested())
        {
            if (Display.isVisible())
            {
                //render();
                drawGLScene();
                try
                {
                    Thread.sleep(30);
                } catch (InterruptedException inte)
                {
                }
            } else
            {
                // no need to render/paint if nothing has changed (ie. window
                // dragged over)

                if (Display.isDirty())
                {
                    //render();
                    drawGLScene();
                }
                // don't waste cpu time, sleep more
                try
                {
                    //Thread.sleep(14);
                    Thread.sleep(50);
                } catch (InterruptedException inte)
                {
                }
            }
            // Update window
            Display.update();
        }
    }




    /**
     * Processes keyboard input
     */
    /**
     * Cleans up the test
     */
    private void cleanup()
    {
        Display.destroy();
    }

    /**
     * Retrieves a displaymode, if one such is available
     *
     * @param width
     *            Required width
     * @param height
     *            Required height
     * @param bpp
     *            Minimum required bits per pixel
     * @return
     */
    private DisplayMode findDisplayMode(int width, int height, int bpp) throws LWJGLException
    {
        DisplayMode[] modes = Display.getAvailableDisplayModes();
        for (DisplayMode mode : modes)
        {
            if (mode.getWidth() == width && mode.getHeight() == height && mode.getBitsPerPixel() >= bpp && mode.getFrequency() <= 60)
            {
                return mode;
            }
        }
        return Display.getDesktopDisplayMode();
    }

    /**
     * Initializes OGL
     */
    private void reSizeGLScene()
    {

        glViewport(0, 0, m_mode.getWidth(), m_mode.getHeight());

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        gluPerspective(45.0f, ((float) 1280) / ((float) 1024), 0.1f, 3000.0f);
        //glFrustum(1024f, 1024f, 1280f, 1280f, 100f, 500f);
        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
        
    }

    private void glInit(){
       
        glShadeModel(GL_SMOOTH);
        glClearColor(0.2f, 0.2f, 0.2f, 0.2f);

        glClearDepth(1.0f);							// Depth Buffer Setup
	glEnable(GL_DEPTH_TEST);						// Enables Depth Testing
	glDepthFunc(GL_LEQUAL);							// The Type Of Depth Test To Do

        glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);			// Really Nice Perspective Calculations

        
    }

    private void drawGLScene()                                                // Here's Where We Do All The Drawing
    {
	glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);			// Clear The Screen And The Depth Buffer
	glLoadIdentity();                                                        // Reset The Current Modelview Matrix
        logic.getCamera().glCam();

        for(Object3d o : logic.getModels()){
           o.render();
        }

    }

    public DisplayMode getMode()
    {
        return m_mode;
    }
}
