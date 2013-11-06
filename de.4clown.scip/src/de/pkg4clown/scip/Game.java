/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pkg4clown.scip;

import de.pkg4clown.scip.logic.Logic;
import de.pkg4clown.scip.video.Render;

/**
 *
 * @author nf
 */
public class Game {
    public static Game game;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        game = new Game();
        game.start();
        //Timing muss mit Nano gemessen werden.
    }
    
        private Logic m_logic;
    private Render m_render;

    public Game(){ 
    }

    public void start(){
        m_render = new Render();
        m_logic = new Logic();
        m_render.start();
        m_logic.start();
    }

    public Render getRender(){
        return m_render;
    }

    public Logic getLogic(){
        return m_logic;
    }
}
