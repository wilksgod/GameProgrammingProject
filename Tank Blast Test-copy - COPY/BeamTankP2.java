import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeamTankP2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeamTankP2 extends Player2
{
    /**
     * Act - do whatever the BeamTankP2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int duration = 12;
    private boolean enterDown;
    public void act() 
    {
        super.act();
        shoot();
        takeDamage(getP2Health());
        /*revertBack();*/
        /*takeDamage();*/
        gameOver();
    }    
    
    public int getMoveSpeed()
    {
        return 5;
    }

    
    public void shoot()
    {
        if (!enterDown && Greenfoot.isKeyDown("enter"))
        {
            enterDown = true;
        
            Greenfoot.playSound("Beam Shot Sound.wav");
            this.setImage("RedTankShoot.png");
            Beam beam = new Beam();
            getSimulationWorld().addObject(beam, getX(), getY()); // add the shot to the world
            beam.setRotation(getRotation()); // set rotation of the shot
        }
        
        if (enterDown && !Greenfoot.isKeyDown("enter"))
        {
            enterDown = false;
            this.setImage("RedTank.png");
        }
    }
    
     public void revertBack()
    {
        duration--;
        Player2 p2 = new Player2();
        if (duration == 0)
        {
            getWorld().addObject(p2, this.getX(), this.getY());
            getSimulationWorld().removeObject(this);
            Greenfoot.playSound("Poof.wav");
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

