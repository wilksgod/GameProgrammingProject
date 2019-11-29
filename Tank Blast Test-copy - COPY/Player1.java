
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Player

{
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int p1Health;
    protected double duration;
    private double timeUntilTransition; 
    private int MOVE_SPEED = 2;
    protected double durationOfProjectile = 3.0;
    private boolean spaceDown;
    
    public Player1()
    {
        p1Health = INITIAL_HEALTH;
        timeUntilTransition = 3;
        duration = 12;
    }
    
    public int getMoveSpeed()
    {
        return MOVE_SPEED;
    }
    
    public int getP1Health()
    {
        return p1Health;
    }
    
    public void act() 
    {
        super.act();
        p1Health = takeDamage(p1Health);
        shoot();
        transform();
        gameOver();
        controlTank();
    }
    
    public void shoot()
    {
        if (!spaceDown && Greenfoot.isKeyDown("space"))
        {
            spaceDown = true;
            
            Greenfoot.playSound("Tank Shot Sound.wav");
            this.setImage("TankP1Fire.png");
            CannonBall cannonBall = new CannonBall();
            int shootingOffsetX = (int) (Math.cos(Math.toRadians(getRotation())) * (0.6*getImage().getWidth()));
            int shootingOffsetY = (int) (Math.sin(Math.toRadians(getRotation())) * (0.6*getImage().getWidth()));
            getSimulationWorld().addObject(cannonBall, getX() + shootingOffsetX, getY() + shootingOffsetY); // add the shot to the world
            cannonBall.setRotation(getRotation()); // set rotation of the shot
        }
        
        if (spaceDown && !Greenfoot.isKeyDown("space"))
        {
            spaceDown = false;
            this.setImage("Tank P1.png");
        }
    }
    
    public void revertBack()
    {
        duration-= getSimulationWorld().getTimeStepDuration();
        Player1 p1 = new Player1();
        if (duration < 0)
        {
            getWorld().addObject(p1, this.getX(), this.getY());
            getSimulationWorld().removeObject(this);
            Greenfoot.playSound("Poof.wav");
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
            getSimulationWorld().removeObject(buffTank1);
            getSimulationWorld().removeObject(this);
        }
        /*
        Actor doubleCannonTank = getOneIntersectingObject(DoubleCannon.class);
        DoubleCannonTankP1 doubleCannonTank1 = new DoubleCannonTankP1();
        if (doubleCannonTank != null)
        {
            getSimulationWorld().addObject(doubleCannonTank1, this.getX(), this.getY());
            getSimulationWorld().removeObject(doubleCannonTank1);
            getSimulationWorld().removeObject(this);
        }*/
    }
    
    public void gameOver()
    {
        if (getP1Health() <= 0)
        {
            timeUntilTransition -= getSimulationWorld().getTimeStepDuration();
            
            if (timeUntilTransition < 0)
            {
                getSimulationWorld().transitionToWorld(new EndScreenP2Win());
            }
        }
    }
    
    public void controlTank()
    {   
        MOVE_SPEED = getMoveSpeed();
        
        if (Greenfoot.isKeyDown("w"))
        {
            speed = MOVE_SPEED;
        }        
        else if (Greenfoot.isKeyDown("s"))
        {
            speed = -MOVE_SPEED;
        }
        else
        {
            speed = 0;
        }
        
        System.out.println(speed);
        
        if (Greenfoot.isKeyDown("d"))
        {
            turn(2);
        }
        
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-2);
        }
    }
}