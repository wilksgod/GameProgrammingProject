import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends SimulationWorld
{
    private String songName = "";
    
    /**
     * Constructor for objects of class StartMenu.
     * 
     */
    public StartMenu()
    {
        super("Start Menu Song 2.wav", 1240, 768, new Point2D(0.0, 0.0), 16);
        prepare();
        
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton playButton = new PlayButton();
        addObject(playButton,599,673);
        playButton.setLocation(586,680);
        playButton.setLocation(599,667);
        playButton.setLocation(595,669);
    }
    
    public void act()
    {
        super.act();
        randomSong();
        
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.playSound("Click Sound.wav");
            this.transitionToWorld(new MazeWorld());
        }
    }
    
    public String randomSong()
    {
        if (this.getRandomNumber(1, 2) == 1)
        {
            songName += "Start Menu Song.wav";
        }
        
        else
        {
            songName += "Start Menu Song 2.wav";
        }
        
        return songName;
    }
}
