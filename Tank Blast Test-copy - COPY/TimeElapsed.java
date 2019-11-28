import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TimeElapsed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeElapsed extends Text
{
    private double timeElapsed = 120;
    
    public void act() 
    {
        SimulationWorld world = (SimulationWorld) getWorld();
        timeElapsed -= world.getTimeStepDuration();
        
        if (timeElapsed > 110 && timeElapsed <= 120)
        {
            setImage(new GreenfootImage("1:" + (int) (getTimeElapsed() - 60), 40, Color.RED, new Color(0,0,0,0)));
        }
        else if  (getTimeElapsed() < 70 && getTimeElapsed() > 60)
        {
            setImage(new GreenfootImage("1:0" + (int) (getTimeElapsed() - 60), 40, Color.RED, new Color(0,0,0,0)));
        }
        else if  (getTimeElapsed() < 10 && getTimeElapsed() > 0)
        {
            setImage(new GreenfootImage("0:0" + (int) (getTimeElapsed()), 40, Color.RED, new Color(0,0,0,0)));
        }
        else
        {
            setImage(new GreenfootImage("0:" + (int) getTimeElapsed(), 40, Color.RED, new Color(0,0,0,0)));
        }
        
        if (timeElapsed < 0)
        {
            getSimulationWorld().transitionToWorld(new SuddenDeathWorld());
        }
   }    
    
    public double getTimeElapsed()
    {
        return timeElapsed;
    }
}
