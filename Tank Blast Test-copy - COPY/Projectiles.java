
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectiles extends SimulationActor
{
    /**
     * Act - do whatever the Projectiles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected boolean onWalls;  
    protected double duration = 5.0;
    
    public Projectiles()
    {
        super();
    }
    
    
    public void act() 
    {
        super.act();
        movementOfProjectile(3);
        reflectOffWall();
        
        duration -= getSimulationWorld().getTimeStepDuration();
        if (duration < 0)
        {
            getSimulationWorld().removeObject(this);
        }
    }    
    
    public void movementOfProjectile(int speed)
    {
        // shoots the projectile in the direction the player is facing
        double rotationAngle = Math.toRadians(getRotation());
        velocity.setX(speed * Math.cos(rotationAngle));
        velocity.setY(speed * -Math.sin(rotationAngle));
    }
    
    public void reflectOffWall()
    {
        Walls wUnder = (Walls) getOneObjectAtOffset(0, getRadius() + 1, Walls.class);
        
        if (wUnder != null  && velocity.getY() < 0.0)
        {
            velocity.setY(-velocity.getY());
        }

        Walls wOver = (Walls) getOneObjectAtOffset(0, -getRadius() - 1, Walls.class);

        if (wOver != null  && velocity.getY() > 0.0)
        {
            velocity.setY(-velocity.getY());
        }
        
        Walls wLeft = (Walls) getOneObjectAtOffset(-getRadius() - 1, 0, Walls.class);

        if (wLeft != null && velocity.getX() < 0.0)
        {
            velocity.setX(-velocity.getX());
        }
        
        Walls wRight = (Walls) getOneObjectAtOffset(getRadius() + 1, 0, Walls.class);
        
        if (wRight != null && velocity.getX() > 0.0)
        {
            velocity.setX(-velocity.getX());
        }

        setRotation((int)Math.toDegrees(Math.atan2(-velocity.getY(), velocity.getX())));
    }    
    
    public void collideWithWalls()
    {   
        Point2D newPosition = null;
        
        // Intersectec with Walls below/above/left/right
        // Update position to lie exactly outside the Walls
        // Update velocity to match the Walls intersecting

        
        Walls below = (Walls) getOneObjectAtOffset(0,  getRadius() + 1, Walls.class);        
        Walls above = (Walls) getOneObjectAtOffset(0, -getRadius() - 1, Walls.class);    
        Walls right = (Walls) getOneObjectAtOffset( getRadius() + 1, 0, Walls.class);    
        Walls left  = (Walls) getOneObjectAtOffset(-getRadius() - 1, 0, Walls.class);    
        
        if (below != null  && velocity.getY() <= below.getVelocity().getY())
        {
            newPosition = new Point2D(getX(), below.getY() - below.getHeight() / 2 - getRadius());
            velocity.setY(-velocity.getY());

            onWalls = true;
        }
        else
        {
            onWalls = false;
        }
    
        if (above != null  && velocity.getY() > above.getVelocity().getY())
        {
            newPosition = new Point2D(getX(), above.getY() + above.getHeight() / 2 + getRadius());
            velocity.setY(-velocity.getY());
        }
        
        if (right != null  && velocity.getX() > right.getVelocity().getX())
        {
            newPosition = new Point2D(right.getX() - right.getWidth() / 2 - getRadius(), getY());
            velocity.setX(-velocity.getX());
        }
    
        if (left != null  && velocity.getX() <= left.getVelocity().getX())
        {
            newPosition = new Point2D(left.getX() + left.getWidth() / 2 + getRadius(), getY());
            velocity.setX(-velocity.getX());
        }
        
        if (newPosition != null)
        {
            position = windowToWorld(newPosition);
        }
    
    }
}
