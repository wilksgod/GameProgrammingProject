import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class P1NumberOfHealth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P1NumberOfHealth extends HP
{
    public P1NumberOfHealth(Player player)
    {
        super(player);
    }
    
    /**
     * Act - do whatever the P1NumberOfHealth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        List<Player1> players = getWorld().getObjects(Player1.class);
        int hp = players.get(0).getP1Health();
        
        setImage(new GreenfootImage("X " + hp, 35, Color.BLACK, new Color(0,0,0,0)));
    }    
}
