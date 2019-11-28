import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoubleCannonTankP1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleCannonTankP1 extends Player1
{
    /**
     * Act - do whatever the DoubleCannonTankP1 wants to do. This method is called whenever
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
       if (Greenfoot.isKeyDown("space"))
       {
            this.setImage("BlueTank2CannonFire.png");
            Greenfoot.playSound("Tank Shot Sound.wav");
            
            DoubleCannonBall doubleCannonBall = new DoubleCannonBall();
            getSimulationWorld().addObject(doubleCannonBall, getX(), getY()); // add the shot to the world
            doubleCannonBall.setRotation(getRotation()); // set rotation of the shot
       }
       else 
       {
            this.setImage("BlueTank2Cannon.png");
       }
        
       if (!spaceDown && Greenfoot.isKeyDown("space"))
       {
            spaceDown = true;
        
            this.setImage("BlueTank2CannonFire.png");
            Greenfoot.playSound("Tank Shot Sound.wav");
            DoubleCannonBall doubleCannonBall = new DoubleCannonBall();
            getSimulationWorld().addObject(doubleCannonBall, getX(), getY()); // add the shot to the world
            doubleCannonBall.setRotation(getRotation()); // set rotation of the shot
       }
       if (spaceDown && !Greenfoot.isKeyDown("space"))
       {
            spaceDown = false;
            this.setImage("BlueTank2Cannon.png");
       }
    }
}
