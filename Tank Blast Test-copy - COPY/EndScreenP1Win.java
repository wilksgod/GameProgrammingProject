import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreenP1Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreenP1Win extends SimulationWorld
{

    /**
     * Constructor for objects of class EndScreenP1Win.
     * 
     */
    public EndScreenP1Win()
    {
        super("Children Yay! Sound Effect.wav", 1240, 768, new Point2D(0.0, 0.0), 16);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player1 player1 = new Player1(Player.INITIAL_HEALTH);
        addObject(player1,614,517);
        BeamTankP1 beamTankP1 = new BeamTankP1();
        addObject(beamTankP1,506,516);
        beamTankP1.setLocation(506,520);
        BuffTankP1 buffTankP1 = new BuffTankP1();
        addObject(buffTankP1,806,525);
        buffTankP1.setLocation(804,516);
        DoubleCannonTankP1 doubleCannonTankP1 = new DoubleCannonTankP1();
        addObject(doubleCannonTankP1,331,515);
        doubleCannonTankP1.setLocation(336,518);
        doubleCannonTankP1.setLocation(357,524);
        buffTankP1.setLocation(834,521);
        buffTankP1.setLocation(836,511);
        player1.setLocation(673,518);
        buffTankP1.setLocation(847,528);
        player1.setLocation(678,521);
        beamTankP1.setLocation(528,516);
        doubleCannonTankP1.setLocation(339,512);
        buffTankP1.setLocation(865,521);
        player1.setLocation(690,522);
        beamTankP1.setLocation(525,522);
        DoubleCannonTankP1 doubleCannonTankP12 = new DoubleCannonTankP1();
        addObject(doubleCannonTankP12,861,284);
        doubleCannonTankP12.setLocation(864,248);
        doubleCannonTankP12.setLocation(867,248);
        doubleCannonTankP12.setLocation(867,248);
        doubleCannonTankP12.setLocation(865,248);
        BeamTankP1 beamTankP12 = new BeamTankP1();
        addObject(beamTankP12,703,251);
        beamTankP12.setLocation(702,250);
        beamTankP12.setLocation(702,255);
        Player1 player12 = new Player1(Player.INITIAL_HEALTH);
        addObject(player12,513,257);
        player12.setLocation(531,260);
        player12.setLocation(528,260);
        BuffTankP1 buffTankP12 = new BuffTankP1();
        addObject(buffTankP12,338,289);
        buffTankP12.setLocation(351,250);
    }
}
