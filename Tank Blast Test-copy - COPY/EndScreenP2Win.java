import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreenP2Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreenP2Win extends SimulationWorld
{

    /**
     * Constructor for objects of class EndScreenP2Win.
     * 
     */
    public EndScreenP2Win()
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
        Player2 player2 = new Player2(Player.INITIAL_HEALTH);
        addObject(player2,693,496);
        player2.setLocation(695,504);
        BuffTankP2 buffTankP2 = new BuffTankP2();
        addObject(buffTankP2,346,498);
        BeamTankP2 beamTankP2 = new BeamTankP2();
        addObject(beamTankP2,546,509);
        player2.setLocation(691,507);
        beamTankP2.setLocation(548,503);
        player2.setLocation(663,500);
        buffTankP2.setLocation(376,503);
        beamTankP2.setLocation(513,504);
        player2.setLocation(648,507);
        beamTankP2.setLocation(508,505);
        buffTankP2.setLocation(370,505);
        beamTankP2.setLocation(515,508);
        player2.setLocation(646,506);
        player2.setLocation(658,499);
        beamTankP2.setLocation(513,503);
        buffTankP2.setLocation(367,509);
        DoubleCannonTankP2 doubleCannonTankP2 = new DoubleCannonTankP2();
        addObject(doubleCannonTankP2,823,506);
        doubleCannonTankP2.setLocation(874,509);
        player2.setLocation(693,511);
        beamTankP2.setLocation(536,508);
        buffTankP2.setLocation(359,508);
        beamTankP2.setLocation(519,509);
        BuffTankP2 buffTankP22 = new BuffTankP2();
        addObject(buffTankP22,885,298);
        buffTankP22.setLocation(868,274);
        buffTankP22.setLocation(882,270);
        buffTankP22.setLocation(889,269);
        buffTankP22.setLocation(896,275);
        BeamTankP2 beamTankP22 = new BeamTankP2();
        addObject(beamTankP22,683,277);
        beamTankP22.setLocation(695,273);
        beamTankP22.setLocation(698,265);
        Player2 player22 = new Player2(Player.INITIAL_HEALTH);
        addObject(player22,542,274);
        player22.setLocation(526,272);
        player22.setLocation(541,273);
        DoubleCannonTankP2 doubleCannonTankP22 = new DoubleCannonTankP2();
        addObject(doubleCannonTankP22,362,272);
        doubleCannonTankP22.setLocation(352,268);
        doubleCannonTankP22.setLocation(364,268);
        doubleCannonTankP22.setLocation(383,279);
        doubleCannonTankP22.setLocation(372,270);
        player22.setLocation(542,267);
        player22.setLocation(538,267);
        beamTankP22.setLocation(695,262);
        buffTankP22.setLocation(866,259);
        doubleCannonTankP22.setLocation(372,260);
    }
}
