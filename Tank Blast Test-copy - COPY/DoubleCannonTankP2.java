import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoubleCannonTankP2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleCannonTankP2 extends Player2
{
    /**
     * Act - do whatever the DoubleCannonTankP2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean enterDown;
    private int MOVE_SPEED = 1;
    
    public DoubleCannonTankP2(int health)
    {
        super(health);
    }
    
    public void act() 
    {
        super.act();
        try
        {
           shoot();
           revertBack();
           /*takeDamage();*/
           gameOver();
        }
        catch(Exception e)
        {
        }
    }    
    
    public int getMoveSpeed()
    {
        return 1;
    }
    
    public void shoot()
    {
       if (!enterDown && Greenfoot.isKeyDown("enter"))
       {
            enterDown = true;
        
            this.setImage("RedTank2CannonFire.png");
            Greenfoot.playSound("Tank Shot Sound.wav");
            DoubleCannonBall doubleCannonBall = new DoubleCannonBall();
            int shootingOffsetX = (int) (Math.cos(Math.toRadians(getRotation())) * (0.6*getImage().getWidth()));
            int shootingOffsetY = (int) (Math.sin(Math.toRadians(getRotation())) * (0.6*getImage().getWidth()));
            getSimulationWorld().addObject(doubleCannonBall, getX() + shootingOffsetX, getY() + shootingOffsetY); // add the shot to the world
            doubleCannonBall.setRotation(getRotation()); // set rotation of the shot
       }
       
       if (enterDown && !Greenfoot.isKeyDown("enter"))
       {
            enterDown = false;
            this.setImage("RedTank2Cannon.png");
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

