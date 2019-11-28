
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Player extends Tanks
{
    public final static int INITIAL_HEALTH = 20;
    protected int speed = 0;
    
    public abstract int getMoveSpeed();
    
    public void act() 
    {
        super.act();
        

        double rotationAngle = Math.toRadians(getRotation());
        velocity.setX(speed * Math.cos(rotationAngle));
        velocity.setY(speed * -Math.sin(rotationAngle));

    }
    
    public int takeDamage(int health)
    {
        Actor beam = getOneIntersectingObject(Beam.class);
        int newHealth = health;
        
        if (beam != null)
        {
            newHealth -= 3;
            getSimulationWorld().removeObject(beam);
        }
        
        Actor doubleCannonBall = getOneIntersectingObject(DoubleCannonBall.class);
        
        if (doubleCannonBall != null)
        {
            newHealth -= 3;
            getSimulationWorld().removeObject(doubleCannonBall);
        }
        
        Actor buffTankCannonBall = getOneIntersectingObject(BuffTankCannonBall.class);
        
        if (buffTankCannonBall != null)
        {
            newHealth -= 2;
            getSimulationWorld().removeObject(buffTankCannonBall);
        }
        
        Actor cannonBall = getOneIntersectingObject(CannonBall.class);
        
        if (cannonBall != null)
        {
            newHealth -= 1;
            getSimulationWorld().removeObject(cannonBall);
        }
        
        if (health <= 0)
        {
            Actor explosion = new Explosion();

            World myWorld = getWorld();
            myWorld.addObject(explosion, this.getX(), this.getY());
            myWorld.removeObject(this);
        }
        
        return newHealth;
    }
    
    public void transform()
    {
        Actor beamTank = getOneIntersectingObject(LaserBeam.class);
        BeamTankP1 beamTank1 = new BeamTankP1();
        if (beamTank != null)
        {
            getSimulationWorld().addObject(beamTank1, this.getX(), this.getY());
            getSimulationWorld().removeObject(this);
        }
        
        Actor buffTank = getOneIntersectingObject(BuffUp.class);
        BuffTankP1 buffTank1 = new BuffTankP1();
        if (buffTank != null)
        {
            getSimulationWorld().addObject(buffTank1, this.getX(), this.getY());
            getSimulationWorld().removeObject(this);
        }
        
        Actor doubleCannonTank = getOneIntersectingObject(DoubleCannon.class);
        DoubleCannonTankP1 doubleCannonTank1 = new DoubleCannonTankP1();
        if (doubleCannonTank != null)
        {
            getSimulationWorld().addObject(doubleCannonTank1, this.getX(), this.getY());
            getSimulationWorld().removeObject(this);
        }
    }

}
