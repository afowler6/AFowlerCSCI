import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * A bit of empty space for bubbles to float in.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    private int size;
    private int direction;
    /**
     * Create Space. Make it black.
     */
    public Space()
    {
        super(900, 600, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        setup();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void setup()
    {
        size=190;
        direction=0;
         for(int i = 0; i < 18; i++) {
        Bubble bubble = new Bubble(size, direction);
        addObject(bubble,(450),(300));
        size=size-10;
        direction=direction+20;
        }
        
    }
  }
