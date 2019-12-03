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
    protected int p2Health;
    protected double duration;
    private double timeUntilTransition;
    private int MOVE_SPEED;
    private boolean enterDown;
    
    public Player2(int health)
    {
        p2Health = health;
        duration = 20.0;
        timeUntilTransition = 3.0;
        MOVE_SPEED = 2;
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
            revertBack();
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
    
    public void revertBack()
    {
        duration -= getSimulationWorld().getTimeStepDuration();
        int oldHealth = p2Health;
        if (duration < 0)
        {
            Player2 p2 = new Player2(oldHealth);
            getWorld().addObject(p2, this.getX(), this.getY());
            getSimulationWorld().removeObject(this);
            Greenfoot.playSound("Poof.wav");
        }
    }
    
    public void gameOver()
    {
        if (getP2Health() <= 0)
        {
            //timeUntilTransition -= getSimulationWorld().getTimeStepDuration();
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
        int oldHealth = p2Health;
        
        Actor laserBeam = getOneIntersectingObject(LaserBeam.class);
        if (laserBeam != null)
        {
            BeamTankP2 beamTank2 = new BeamTankP2(oldHealth);
            getSimulationWorld().addObject(beamTank2, this.getX(), this.getY());
            getSimulationWorld().removeObject(laserBeam);
            getSimulationWorld().removeObject(this);
        }
        
        Actor buffUp = getOneIntersectingObject(BuffUp.class);
        if (buffUp != null)
        {
            BuffTankP2 buffTank2 = new BuffTankP2(oldHealth);
            getSimulationWorld().addObject(buffTank2, this.getX(), this.getY());
            getSimulationWorld().removeObject(buffUp);
            getSimulationWorld().removeObject(this);
        }
        
        Actor doubleCannon = getOneIntersectingObject(DoubleCannon.class);
        if (doubleCannon != null)
        {
            DoubleCannonTankP2 doubleCannonTank2 = new DoubleCannonTankP2(oldHealth);
            getSimulationWorld().addObject(doubleCannonTank2, this.getX(), this.getY());
            getSimulationWorld().removeObject(doubleCannon);
            getSimulationWorld().removeObject(this);
        }
    }
    
}
