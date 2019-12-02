import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerControls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerControls extends SimulationWorld
{

    /**
     * Constructor for objects of class PlayerControls.
     * 
     */
    public PlayerControls()
    {
        super("Start Menu Song.wav", 1240, 768, new Point2D(0.0, 0.0), 16);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Next next = new Next();
        addObject(next,1152,688);
        next.setLocation(1170,705);
        next.setLocation(1173,686);
    }
}
