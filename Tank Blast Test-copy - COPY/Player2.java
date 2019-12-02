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
    private int MOVE_SPEED = 2;
    private boolean enterDown;
    
    public Player2(int health)
    {
        p2Health = health;
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
        try {
            shoot();
            p2Health = takeDamage(p2Health);
            gameOver();
            transform();
            controlTank();
        }
        catch (Exception e)
        {
        }
    }
    
    public void shoot()
    {
        if (!enterDown && Greenfoot.isKeyDown("enter"))
        {
            enterDown = true;
        
            Greenfoot.playSound("Tank Shot Sound.wav");
            this.setImage("TankP2Fire.png");
            CannonBall cannonBall = new CannonBall();
            int shootingOffsetX = (int) (Math.cos(Math.toRadians(getRotation())) * (0.6*getImage().getWidth()));
            int shootingOffsetY = (int) (Math.sin(Math.toRadians(getRotation())) * (0.6*getImage().getWidth()));
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
            speed = MOVE_SPEED;
        }        
        else if (Greenfoot.isKeyDown("down"))
        {
            speed = -MOVE_SPEED;
        }
        else
        {
            speed = 0;
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            turn(2);
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-2);
        }
    }
    
    public void transform()
    {
        Actor laserBeam = getOneIntersectingObject(LaserBeam.class);
        Actor buffTank = getOneIntersectingObject(BuffUp.class);

        if (laserBeam != null)
        {
            BeamTankP1 beamTank1 = new BeamTankP1();
            getSimulationWorld().addObject(beamTank1, this.getX(), this.getY());
            getSimulationWorld().removeObject(laserBeam);
            getSimulationWorld().removeObject(this);
        }
        
        if (buffTank != null)
        {
            BuffTankP1 buffTank1 = new BuffTankP1();
            getSimulationWorld().addObject(buffTank1, this.getX(), this.getY());
            getSimulationWorld().removeObject(buffTank);
            getSimulationWorld().removeObject(this);
        }
        
        Actor doubleCannonTank = getOneIntersectingObject(DoubleCannon.class);
        if (doubleCannonTank != null)
        {
            DoubleCannonTankP1 doubleCannonTank1 = new DoubleCannonTankP1();
            getSimulationWorld().addObject(doubleCannonTank1, this.getX(), this.getY());
            getSimulationWorld().removeObject(doubleCannonTank);
            getSimulationWorld().removeObject(this);
        }
    }
    
}
