
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Text
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 3;
    private int time = 0;
    
    public void act() 
    {
        super.act();
        /*moveText();*/
        changeImage();
    }    
    
    /*public void moveText()
    {
        if (this != null)
        {
            if (this.isAtEdge() && this.getPosition().getX() >= 0)
            {
                this.setVelocity(new Vector2D(0, 4));
            }
            
            if (this.isAtEdge() && this.getPosition().getX() < 0)
            {
                move(-3);
            }
        }
    }*/
    
    public void changeImage()
    {
        SimulationWorld world = (SimulationWorld) getWorld();
        time += (int) world.getTimeStepDuration();
        
        if (this != null) 
        {
            if (time == 0 && time == 2 && time == 4 && time == 6 && time == 8)
            {
                this.setImage("PRESS SPACE TO PLAY.png");
            }
            
            if (time == 1 && time == 3 && time == 5 && time == 7 && time == 9)
            {
                this.setImage("PRESS SPACE TO PLAY (2).png");
            }
        }
    }
}
