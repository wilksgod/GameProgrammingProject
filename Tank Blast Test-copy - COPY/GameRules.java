import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameRules here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameRules extends SimulationWorld
{
    private double time = 12;
    
    /**
     * Constructor for objects of class GameRules.
     * 
     */
    public GameRules()
    {
        super("", 1240, 768, new Point2D(0.0, 0.0), 16);
    }
    
    public void act()
    {
        super.act();
        
        time -= getTimeStepDuration();
        
        if (time < 0)
        {
            Greenfoot.playSound("Click Sound.wav");
            transitionToWorld(new ChooseMap());
        }
    }
}
