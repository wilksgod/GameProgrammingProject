import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next extends Text
{
    /**
     * Act - do whatever the Next wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Click Sound.wav");
            getSimulationWorld().transitionToWorld(new GameRules());
        }
    }    
}
