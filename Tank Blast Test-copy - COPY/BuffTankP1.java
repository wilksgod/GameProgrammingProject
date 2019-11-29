import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BuffTankP1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuffTankP1 extends Player1
{
    /**
     * Act - do whatever the BuffTankP1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean spaceDown;
    
    public void act() 
    {
        super.act();
        shoot();
        revertBack();
        /*takeDamage();*/
        gameOver();
    }    
    
    public void shoot()
    {
       if (!spaceDown && Greenfoot.isKeyDown("space"))
        {
            spaceDown = true;
        
            this.setImage("BlueTank1CannonFire.png");
            Greenfoot.playSound("Tank Shot Sound.wav");
            BuffTankCannonBall buffTankCannonBall = new BuffTankCannonBall();
            getSimulationWorld().addObject(buffTankCannonBall, getX(), getY()); // add the shot to the world
            buffTankCannonBall.setRotation(getRotation()); // set rotation of the shot
        }
       if (spaceDown && !Greenfoot.isKeyDown("space"))
        {
            spaceDown = false;
             this.setImage("BlueTank1Cannon.png");
        }
    }
}