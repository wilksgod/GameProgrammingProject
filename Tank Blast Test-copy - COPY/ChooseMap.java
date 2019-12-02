import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChooseMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChooseMap extends SimulationWorld
{

    /**
     * Constructor for objects of class ChooseMap.
     * 
     */
    public ChooseMap()
    {
        super("Start Menu Song.wav", 1240, 768, new Point2D(0.0, 0.0), 16);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("1"))
        {
            transitionToWorld(new MazeWorld());
        }
        
        if (Greenfoot.isKeyDown("2"))
        {
            transitionToWorld(new MazeWorldTwo());
        }
    }
}
