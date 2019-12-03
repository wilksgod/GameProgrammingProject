import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BeamTankP1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeamTankP1 extends Player1
{
    /**
     * Act - do whatever the BeamTankP1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int MOVE_SPEED = 5;
    private boolean spaceDown;
    
    public BeamTankP1(int health)
    {
        super(health);
    }
    
    public void act() 
    {
        super.act();
        shoot();
        revertBack();
        move(MOVE_SPEED);
        /*takeDamage();*/
        gameOver();
    }    
    
    public int getMoveSpeed()
    {
        return 4;
    }

    public void shoot()
    {
        if (!spaceDown && Greenfoot.isKeyDown("space"))
        {
            spaceDown = true;
        
            Greenfoot.playSound("Beam Shot Sound.wav");
            this.setImage("BlueTankShoot.png");
            Beam beam = new Beam();
            int shootingOffsetX = (int) (Math.cos(Math.toRadians(getRotation())) * (0.6*getImage().getWidth()));
            int shootingOffsetY = (int) (Math.sin(Math.toRadians(getRotation())) * (0.6*getImage().getWidth()));
            getSimulationWorld().addObject(beam, getX() + shootingOffsetX, getY() + shootingOffsetY); // add the shot to the world
            beam.setRotation(getRotation()); // set rotation of the shot
        }
        
        if (spaceDown && !Greenfoot.isKeyDown("space"))
        {
            spaceDown = false;
            this.setImage("BlueTank.png");
        }
    }
}
