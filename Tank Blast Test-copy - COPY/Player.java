import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Player extends Tanks
{
    public final static int INITIAL_HEALTH = 25;
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
            newHealth -= 2;
            getSimulationWorld().removeObject(beam);
        }
        
        Actor doubleCannonBall = getOneIntersectingObject(DoubleCannonBall.class);
        
        if (doubleCannonBall != null)
        {
            newHealth -= 4;
            getSimulationWorld().removeObject(doubleCannonBall);
        }
        
        Actor buffTankCannonBall = getOneIntersectingObject(BuffTankCannonBall.class);
        
        if (buffTankCannonBall != null)
        {
            newHealth -= 3;
            getSimulationWorld().removeObject(buffTankCannonBall);
        }
        
        Actor cannonBall = getOneIntersectingObject(CannonBall.class);
        
        if (cannonBall != null)
        {
            newHealth -= 1;
            getSimulationWorld().removeObject(cannonBall);
        }
        
        Actor bomb = getOneIntersectingObject(Bomb.class);
        
        if (bomb != null)
        {
            newHealth -= 5;
            Actor explosion = new Explosion();
       
            World myWorld = getWorld();
            myWorld.addObject(explosion, this.getX(), this.getY());
            getSimulationWorld().removeObject(bomb);
        }
        
        Actor fireBall = getOneIntersectingObject(FireBall.class);
        
        if (fireBall != null)
        {
            newHealth -= 3;
            getSimulationWorld().removeObject(fireBall);
        }
        
        Actor explosion = getOneIntersectingObject(Explosion.class);
        
        
        
        if (health <= 0)
        {
            World myWorld = getWorld();
            myWorld.addObject(explosion, this.getX(), this.getY());
        }
        
        return newHealth;
    }
    
    // public void transform()
    // {
        // Actor laserBeam = getOneIntersectingObject(LaserBeam.class);
        // BeamTankP1 beamTank1 = new BeamTankP1();
        // if (laserBeam != null)
        // {
            // getSimulationWorld().addObject(beamTank1, this.getX(), this.getY());
            // getSimulationWorld().removeObject(this);
        // }
        
        // Actor buffUp = getOneIntersectingObject(BuffUp.class);
        // BuffTankP1 buffTank1 = new BuffTankP1();
        // if (buffUp != null)
        // {
            // getSimulationWorld().addObject(buffTank1, this.getX(), this.getY());
            // getSimulationWorld().removeObject(this);
        // }
        
        // Actor doubleCannon = getOneIntersectingObject(DoubleCannon.class);
        // DoubleCannonTankP1 doubleCannonTank1 = new DoubleCannonTankP1();
        // if (doubleCannon != null)
        // {
            // getSimulationWorld().addObject(doubleCannonTank1, this.getX(), this.getY());
            // getSimulationWorld().removeObject(this);
        // }
    // }

}
