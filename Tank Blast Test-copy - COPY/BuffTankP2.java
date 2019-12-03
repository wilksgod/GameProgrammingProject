import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BuffTankP2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuffTankP2 extends Player2
{
    /**
     * Act - do whatever the BuffTankP2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int duration = 12;
    private boolean enterDown;
    
    public BuffTankP2(int health)
    {
        super(health);
    }
    
    public void act() 
    {
        super.act();
        shoot();
        /*revertBack();*/
        /*takeDamage();*/
        gameOver();
    }    
    
    public int getMoveSpeed()
    {
        return 1;
    }
    
    public void shoot()
    {
       if (!enterDown && Greenfoot.isKeyDown("enter"))
       {
           enterDown = true;
       
           this.setImage("RedTank1CannonFire.png");
           Greenfoot.playSound("Tank Shot Sound.wav");
           BuffTankCannonBall buffTankCannonBall = new BuffTankCannonBall();
           int shootingOffsetX = (int) (Math.cos(Math.toRadians(getRotation())) * (0.6*getImage().getWidth()));
           int shootingOffsetY = (int) (Math.sin(Math.toRadians(getRotation())) * (0.6*getImage().getWidth()));
           getSimulationWorld().addObject(buffTankCannonBall, getX() + shootingOffsetX, getY() + shootingOffsetY); // add the shot to the world // add the shot to the world
           buffTankCannonBall.setRotation(getRotation()); // set rotation of the shot
        }
       if (enterDown && !Greenfoot.isKeyDown("enter"))
        {
            enterDown = false;
             this.setImage("RedTank1Cannon.png");
        }
    }
    
     public void revertBack()
    {
        duration--;
        int oldHealth = p2Health;
        if (duration == 0)
        {
            Player2 p2 = new Player2(oldHealth);
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
