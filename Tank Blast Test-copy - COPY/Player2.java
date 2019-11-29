import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Player
{
    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int p2Health;
    private double timeUntilTransition = 1.0;
    private boolean enterDown;
    
    public Player2()
    {
        p2Health = INITIAL_HEALTH;
    }
    
    public int getP2Health()
    {
        return p2Health;
    }
    
    public int getMoveSpeed()
    {
        return 2;
    }

    
    public void act() 
    {
        super.act();
        shoot();
        p2Health = takeDamage(p2Health);
        gameOver();
        controlTank();
    }
    
    public void shoot()
    {
        if (!enterDown && Greenfoot.isKeyDown("enter"))
        {
            enterDown = true;
        
            Greenfoot.playSound("Tank Shot Sound.wav");
            this.setImage("TankP2Fire.png");
            CannonBall cannonBall = new CannonBall();
            int shootingOffsetX = (int) (Math.cos(Math.toRadians(getRotation())) * (0.5*getImage().getWidth()));
            int shootingOffsetY = (int) (Math.sin(Math.toRadians(getRotation())) * (0.5*getImage().getWidth()));
            getSimulationWorld().addObject(cannonBall, getX() + shootingOffsetX, getY() + shootingOffsetY); // add the shot to the world
            cannonBall.setRotation(getRotation()); // set rotation of the shot
        }
        
        if (enterDown && !Greenfoot.isKeyDown("enter"))
        {
            enterDown = false;
            this.setImage("Tank P2.png");
        }
    }
    
    public void gameOver()
    {
        if (getP2Health() <= 0)
        {
            timeUntilTransition -= getSimulationWorld().getTimeStepDuration();
            if (timeUntilTransition < 0)
            {
                getSimulationWorld().transitionToWorld(new EndScreenP1Win());
            }
        }
    }
    
    public void controlTank()
    {   
        if (Greenfoot.isKeyDown("up"))
        {
            speed = 1;
        }        
        else if (Greenfoot.isKeyDown("down"))
        {
            speed = -1;
        }
        else
        {
            speed = 0;
        }
        
        System.out.println(speed);
        
        if (Greenfoot.isKeyDown("right"))
        {
            turn(2);
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-2);
        }
    }
}
