import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tanks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tanks extends SimulationActor
{
    /**
     * Act - do whatever the Tanks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected boolean onWalls;    
    
    public Tanks()
    {
        super();
        onWalls = false;
    }
    
    public Tanks(Point2D position, Vector2D velocity, Vector2D acceleration)
    {
        super(position, velocity, acceleration);
        onWalls = false;
    }
    
    public void act() 
    {
        super.act();
        collideWithWalls();
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
            velocity.setY(below.getVelocity().getY());

            onWalls = true;
        }
        else
        {
            onWalls = false;
        }
    
        if (above != null  && velocity.getY() > above.getVelocity().getY())
        {
            newPosition = new Point2D(getX(), above.getY() + above.getHeight() / 2 + getRadius());
            velocity.setY(above.getVelocity().getY());
        }
        
        if (right != null  && velocity.getX() > right.getVelocity().getX())
        {
            newPosition = new Point2D(right.getX() - right.getWidth() / 2 - getRadius(), getY());
            velocity.setX(right.getVelocity().getX());
        }
    
        if (left != null  && velocity.getX() <= left.getVelocity().getX())
        {
            newPosition = new Point2D(left.getX() + left.getWidth() / 2 + getRadius(), getY());
            velocity.setX(left.getVelocity().getX());
        }
        
        if (newPosition != null)
        {
            position = windowToWorld(newPosition);
        }
    
    }
}

