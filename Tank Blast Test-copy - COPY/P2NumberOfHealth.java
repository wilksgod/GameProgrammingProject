import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class P2NumberOfHealth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P2NumberOfHealth extends HP
{
    public P2NumberOfHealth(Player player)
    {
        super(player);
    }

    /**
     * Act - do whatever the P2NumberOfHealth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        List<Player2> players = getWorld().getObjects(Player2.class);
        int hp = players.get(0).getP2Health();
        
        setImage(new GreenfootImage("X " + hp, 35, Color.BLACK, new Color(0,0,0,0)));
    }    
}
