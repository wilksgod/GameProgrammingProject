import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BuffTankP2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuffTankP2 extends Player2
{
    /**
     * Act - do whatever the BuffTankP2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int duration = 12;
    private boolean enterDown;
    
    public void act() 
    {
        super.act();
        shoot();
        /*revertBack();*/
        /*takeDamage();*/
        gameOver();
    }    
    
    public void shoot()
    {
       if (!enterDown && Greenfoot.isKeyDown("space"))
       {
           enterDown = true;
       
           this.setImage("BlueTank1CannonFire.png");
           Greenfoot.playSound("Tank Shot Sound.wav");
           BuffTankCannonBall buffTankCannonBall = new BuffTankCannonBall();
           getSimulationWorld().addObject(buffTankCannonBall, getX(), getY()); // add the shot to the world
           buffTankCannonBall.setRotation(getRotation()); // set rotation of the shot
        }
       if (enterDown && !Greenfoot.isKeyDown("space"))
        {
            enterDown = false;
             this.setImage("BlueTank1Cannon.png");
        }
    }
    
     public void revertBack()
    {
        duration--;
        Player2 p2 = new Player2();
        if (duration == 0)
        {
            getWorld().addObject(p2, this.getX(), this.getY());
            getSimulationWorld().removeObject(this);
            Greenfoot.playSound("Poof.wav");
        }
    }
    
    public void gameOver()
    {
        int health = getP2Health();
        
        if (health == 0)
        {
            getSimulationWorld().transitionToWorld(new EndScreenP2Win());
        }
    }
}
