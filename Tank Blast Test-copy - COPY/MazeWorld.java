import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazeWorld extends SimulationWorld
{

    /**
     * Constructor for objects of class MazeWorld.
     *
     */
    public MazeWorld()
    {
        super("Gameplay Song.wav", 1240, 850, new Point2D(0.0, 0.0), 16);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        VerticalWall verticalWall = new VerticalWall();
        addObject(verticalWall,585,384);
        verticalWall.setLocation(585,384);
        HorizontalWall horizontalWall = new HorizontalWall();
        addObject(horizontalWall,621,348);
        horizontalWall.setLocation(620,349);
        HorizontalWall horizontalWall2 = new HorizontalWall();
        addObject(horizontalWall2,622,419);
        horizontalWall2.setLocation(620,420);
        VerticalWall verticalWall2 = new VerticalWall();
        addObject(verticalWall2,652,385);
        verticalWall2.setLocation(655,384);
        VerticalWall verticalWall3 = new VerticalWall();
        addObject(verticalWall3,468,389);
        verticalWall3.setLocation(465,384);
        VerticalWall verticalWall4 = new VerticalWall();
        addObject(verticalWall4,978,383);
        VerticalWall verticalWall5 = new VerticalWall();
        addObject(verticalWall5,774,385);
        verticalWall5.setLocation(775,384);
        VerticalWall verticalWall6 = new VerticalWall();
        addObject(verticalWall6,256,386);
        verticalWall6.setLocation(244,383);
        HorizontalWall horizontalWall3 = new HorizontalWall();
        addObject(horizontalWall3,1191,384);
        horizontalWall3.setLocation(1190,384);
        HorizontalWall horizontalWall4 = new HorizontalWall();
        addObject(horizontalWall4,617,578);
        horizontalWall4.setLocation(619,576);
        horizontalWall4.setLocation(620,576);
        HorizontalWall horizontalWall5 = new HorizontalWall();
        addObject(horizontalWall5,386,659);
        VerticalWall verticalWall7 = new VerticalWall();
        addObject(verticalWall7,350,592);
        verticalWall7.setLocation(351,615);
        VerticalWall verticalWall8 = new VerticalWall();
        addObject(verticalWall8,350,535);
        verticalWall8.setLocation(351,535);
        VerticalWall verticalWall9 = new VerticalWall();
        addObject(verticalWall9,888,549);
        verticalWall9.setLocation(888,536);
        VerticalWall verticalWall10 = new VerticalWall();
        addObject(verticalWall10,889,616);
        verticalWall10.setLocation(888,616);
        HorizontalWall horizontalWall6 = new HorizontalWall();
        addObject(horizontalWall6,857,660);
        horizontalWall6.setLocation(852,661);
        HorizontalWall horizontalWall7 = new HorizontalWall();
        addObject(horizontalWall7,1057,573);
        horizontalWall7.setLocation(1054,576);
        horizontalWall7.setLocation(1055,578);
        VerticalWall verticalWall11 = new VerticalWall();
        addObject(verticalWall11,1055,578);
        horizontalWall7.setLocation(1054,576);
        verticalWall11.setLocation(1054,576);
        VerticalWall verticalWall12 = new VerticalWall();
        addObject(verticalWall12,1055,193);
        verticalWall12.setLocation(1054,192);
        verticalWall12.setLocation(1054,192);
        HorizontalWall horizontalWall8 = new HorizontalWall();
        addObject(horizontalWall8,1053,192);
        horizontalWall8.setLocation(1054,192);
        VerticalWall verticalWall13 = new VerticalWall();
        addObject(verticalWall13,351,232);
        verticalWall13.setLocation(353,249);
        verticalWall13.setLocation(352,232);
        VerticalWall verticalWall14 = new VerticalWall();
        addObject(verticalWall14,352,151);
        verticalWall14.setLocation(352,152);
        HorizontalWall horizontalWall9 = new HorizontalWall();
        addObject(horizontalWall9,397,116);
        horizontalWall9.setLocation(397,117);
        VerticalWall verticalWall15 = new VerticalWall();
        addObject(verticalWall15,896,234);
        verticalWall15.setLocation(891,232);
        VerticalWall verticalWall16 = new VerticalWall();
        addObject(verticalWall16,891,138);
        verticalWall16.setLocation(891,152);
        HorizontalWall horizontalWall10 = new HorizontalWall();
        addObject(horizontalWall10,840,118);
        horizontalWall10.setLocation(846,117);
        horizontalWall10.setLocation(847,117);
        VerticalWall verticalWall17 = new VerticalWall();
        addObject(verticalWall17,620,49);
        verticalWall17.setLocation(185,192);
        HorizontalWall horizontalWall11 = new HorizontalWall();
        addObject(horizontalWall11,185,192);
        horizontalWall11.setLocation(186,192);
        HorizontalWall horizontalWall12 = new HorizontalWall();
        addObject(horizontalWall12,620,192);
        VerticalWall verticalWall18 = new VerticalWall();
        addObject(verticalWall18,185,576);
        verticalWall18.setLocation(185,576);
        HorizontalWall horizontalWall13 = new HorizontalWall();
        addObject(horizontalWall13,186,576);
        VerticalWall verticalWall19 = new VerticalWall();
        addObject(verticalWall19,620,49);
        verticalWall19.setLocation(620,49);
        VerticalWall verticalWall20 = new VerticalWall();
        addObject(verticalWall20,621,715);
        verticalWall20.setLocation(620,717);
        BigHorizontalWall bigHorizontalWall = new BigHorizontalWall();
        addObject(bigHorizontalWall,620,5);
        bigHorizontalWall.setLocation(620,5);
        BigVerticalWall bigVerticalWall = new BigVerticalWall();
        addObject(bigVerticalWall,4,393);
        bigVerticalWall.setLocation(5,393);
        BigHorizontalWall bigHorizontalWall2 = new BigHorizontalWall();
        addObject(bigHorizontalWall2,629,763);
        bigHorizontalWall2.setLocation(629,763);
        BigVerticalWall bigVerticalWall2 = new BigVerticalWall();
        addObject(bigVerticalWall2,1235,393);
        HorizontalWall horizontalWall14 = new HorizontalWall();
        addObject(horizontalWall14,52,381);
        horizontalWall14.setLocation(49,384);
        Player1 p1 = new Player1(Player.INITIAL_HEALTH);
        addObject(p1, 275,423);
        Player2 p2 = new Player2(Player.INITIAL_HEALTH);
        addObject(p2, 924,423);
        P1hp p1hp = new P1hp();
        addObject(p1hp,85,808);
        p1hp.setLocation(216,813);
        P1NumberOfHealth p1NumberOfHealth = new P1NumberOfHealth(p1);
        addObject(p1NumberOfHealth,273,814);
        p1NumberOfHealth.setLocation(273,814);
        P2hp p2hp = new P2hp();
        addObject(p2hp,873,813);
        p2hp.setLocation(928,813);
        P2NumberOfHealth p2NumberOfHealth = new P2NumberOfHealth(p2);
        addObject(p2NumberOfHealth,982,814);
        p2NumberOfHealth.setLocation(982,814);
        WhitBlockForTime whitBlockForTime = new WhitBlockForTime();
        addObject(whitBlockForTime,613,803);
        whitBlockForTime.setLocation(622,824);
        TimeElapsed timeElapsed = new TimeElapsed();
        addObject(timeElapsed,618,815);
        BuffUp buff = new BuffUp();
        addObject(buff,getRandomNumber(10, 1239), getRandomNumber(1, 600));
        DoubleCannon doubleCannon = new DoubleCannon();
        addObject(doubleCannon,getRandomNumber(10, 1239), getRandomNumber(1, 600));
        LaserBeam laser = new LaserBeam();
        addObject(laser,getRandomNumber(10, 1239), getRandomNumber(1, 600));
        
        
        Bomb bomb = new Bomb();
        addObject(bomb,getRandomNumber(10, 1239), getRandomNumber(1, 600));
        Bomb bomb2 = new Bomb();
        addObject(bomb2,getRandomNumber(10, 1239), getRandomNumber(1, 600));
        Bomb bomb3 = new Bomb();
        addObject(bomb3,getRandomNumber(10, 1239), getRandomNumber(1, 600));
        Bomb bomb4 = new Bomb();
        addObject(bomb4,getRandomNumber(10, 1239), getRandomNumber(1, 600));
    }
}
