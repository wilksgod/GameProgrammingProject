import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorldTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazeWorldTwo extends SimulationWorld
{

    /**
     * Constructor for objects of class MazeWorldTwo.
     *
     */
    public MazeWorldTwo()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super("Gameplay Song.wav", 1241, 685, new Point2D(0.0, 0.0), 16);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        VerticalWall verticalWall = new VerticalWall();
        addObject(verticalWall,4,39);
        VerticalWall verticalWall2 = new VerticalWall();
        addObject(verticalWall2,4,117);
        VerticalWall verticalWall3 = new VerticalWall();
        addObject(verticalWall3,4,195);
        VerticalWall verticalWall4 = new VerticalWall();
        addObject(verticalWall4,4,272);
        VerticalWall verticalWall5 = new VerticalWall();
        addObject(verticalWall5,4,348);
        VerticalWall verticalWall6 = new VerticalWall();
        addObject(verticalWall6,4,425);
        VerticalWall verticalWall7 = new VerticalWall();
        addObject(verticalWall7,4,502);
        VerticalWall verticalWall8 = new VerticalWall();
        addObject(verticalWall8,4,580);
        HorizontalWall horizontalWall = new HorizontalWall();
        addObject(horizontalWall,39,624);
        HorizontalWall horizontalWall2 = new HorizontalWall();
        addObject(horizontalWall2,118,624);
        HorizontalWall horizontalWall3 = new HorizontalWall();
        addObject(horizontalWall3,196,624);
        HorizontalWall horizontalWall4 = new HorizontalWall();
        addObject(horizontalWall4,274,624);
        HorizontalWall horizontalWall5 = new HorizontalWall();
        addObject(horizontalWall5,353,623);
        horizontalWall5.setLocation(362,620);
        horizontalWall5.setLocation(354,624);
        HorizontalWall horizontalWall6 = new HorizontalWall();
        addObject(horizontalWall6,434,624);
        horizontalWall6.setLocation(475,623);
        horizontalWall6.setLocation(433,623);
        HorizontalWall horizontalWall7 = new HorizontalWall();
        addObject(horizontalWall7,512,624);
        HorizontalWall horizontalWall8 = new HorizontalWall();
        addObject(horizontalWall8,592,624);
        HorizontalWall horizontalWall9 = new HorizontalWall();
        addObject(horizontalWall9,670,624);
        HorizontalWall horizontalWall10 = new HorizontalWall();
        addObject(horizontalWall10,748,624);
        HorizontalWall horizontalWall11 = new HorizontalWall();
        addObject(horizontalWall11,828,624);
        HorizontalWall horizontalWall12 = new HorizontalWall();
        addObject(horizontalWall12,907,622);
        horizontalWall12.setLocation(907,624);
        HorizontalWall horizontalWall13 = new HorizontalWall();
        addObject(horizontalWall13,984,624);
        HorizontalWall horizontalWall14 = new HorizontalWall();
        addObject(horizontalWall14,1064,622);
        horizontalWall14.setLocation(1064,624);
        HorizontalWall horizontalWall15 = new HorizontalWall();
        addObject(horizontalWall15,1143,621);
        horizontalWall15.setLocation(1143,624);
        HorizontalWall horizontalWall16 = new HorizontalWall();
        addObject(horizontalWall16,1199,623);
        horizontalWall16.setLocation(1224,620);
        horizontalWall16.setLocation(1160,634);
        horizontalWall16.setLocation(1163,628);
        horizontalWall16.setLocation(1214,624);
        HorizontalWall horizontalWall17 = new HorizontalWall();
        addObject(horizontalWall17,48,4);
        HorizontalWall horizontalWall18 = new HorizontalWall();
        addObject(horizontalWall18,127,2);
        horizontalWall18.setLocation(128,7);
        horizontalWall6.setLocation(404,621);
        horizontalWall6.setLocation(449,626);
        horizontalWall6.setLocation(468,624);
        HorizontalWall horizontalWall19 = new HorizontalWall();
        addObject(horizontalWall19,408,624);
        horizontalWall18.setLocation(157,5);
        HorizontalWall horizontalWall20 = new HorizontalWall();
        addObject(horizontalWall20,103,3);
        horizontalWall20.setLocation(105,5);
        horizontalWall20.setLocation(108,4);
        horizontalWall20.setLocation(107,5);
        HorizontalWall horizontalWall21 = new HorizontalWall();
        addObject(horizontalWall21,235,4);
        horizontalWall21.setLocation(269,4);
        HorizontalWall horizontalWall22 = new HorizontalWall();
        addObject(horizontalWall22,314,4);
        horizontalWall22.setLocation(316,6);
        HorizontalWall horizontalWall23 = new HorizontalWall();
        addObject(horizontalWall23,395,4);
        horizontalWall23.setLocation(396,5);
        HorizontalWall horizontalWall24 = new HorizontalWall();
        addObject(horizontalWall24,473,4);
        horizontalWall24.setLocation(472,5);
        HorizontalWall horizontalWall25 = new HorizontalWall();
        addObject(horizontalWall25,552,4);
        horizontalWall25.setLocation(552,5);
        HorizontalWall horizontalWall26 = new HorizontalWall();
        addObject(horizontalWall26,631,4);
        horizontalWall26.setLocation(632,5);
        HorizontalWall horizontalWall27 = new HorizontalWall();
        addObject(horizontalWall27,710,4);
        horizontalWall27.setLocation(712,5);
        HorizontalWall horizontalWall28 = new HorizontalWall();
        addObject(horizontalWall28,792,4);
        horizontalWall28.setLocation(769,2);
        horizontalWall21.setLocation(209,2);
        horizontalWall22.setLocation(290,4);
        horizontalWall22.setLocation(286,4);
        horizontalWall22.setLocation(298,4);
        horizontalWall21.setLocation(274,4);
        horizontalWall21.setLocation(270,3);
        horizontalWall21.setLocation(244,4);
        HorizontalWall horizontalWall29 = new HorizontalWall();
        addObject(horizontalWall29,347,4);
        horizontalWall29.setLocation(348,2);
        horizontalWall29.setLocation(349,6);
        horizontalWall29.setLocation(349,8);
        horizontalWall29.setLocation(347,10);
        horizontalWall29.setLocation(348,4);
        horizontalWall18.setLocation(195,4);
        HorizontalWall horizontalWall30 = new HorizontalWall();
        addObject(horizontalWall30,149,4);
        horizontalWall28.setLocation(832,31);
        removeObject(horizontalWall28);
        addObject(horizontalWall28,792,4);
        horizontalWall28.setLocation(781,6);
        horizontalWall28.setLocation(782,4);
        HorizontalWall horizontalWall31 = new HorizontalWall();
        addObject(horizontalWall31,861,4);
        HorizontalWall horizontalWall32 = new HorizontalWall();
        addObject(horizontalWall32,940,4);
        HorizontalWall horizontalWall33 = new HorizontalWall();
        addObject(horizontalWall33,1017,4);
        HorizontalWall horizontalWall34 = new HorizontalWall();
        addObject(horizontalWall34,1096,4);
        HorizontalWall horizontalWall35 = new HorizontalWall();
        addObject(horizontalWall35,1176,4);
        horizontalWall35.setLocation(1200,4);
        HorizontalWall horizontalWall36 = new HorizontalWall();
        addObject(horizontalWall36,1175,4);
        VerticalWall verticalWall9 = new VerticalWall();
        addObject(verticalWall9,1236,44);
        VerticalWall verticalWall10 = new VerticalWall();
        addObject(verticalWall10,1236,120);
        VerticalWall verticalWall11 = new VerticalWall();
        addObject(verticalWall11,1236,195);
        VerticalWall verticalWall12 = new VerticalWall();
        addObject(verticalWall12,1236,272);
        VerticalWall verticalWall13 = new VerticalWall();
        addObject(verticalWall13,1236,350);
        VerticalWall verticalWall14 = new VerticalWall();
        addObject(verticalWall14,1236,427);
        VerticalWall verticalWall15 = new VerticalWall();
        addObject(verticalWall15,1236,503);
        VerticalWall verticalWall16 = new VerticalWall();
        addObject(verticalWall16,1236,580);
        VerticalWall verticalWall17 = new VerticalWall();
        addObject(verticalWall17,916,184);
        verticalWall17.setLocation(916,217);
        verticalWall17.setLocation(916,184);
        VerticalWall verticalWall18 = new VerticalWall();
        addObject(verticalWall18,916,184);
        VerticalWall verticalWall19 = new VerticalWall();
        addObject(verticalWall19,916,261);
        VerticalWall verticalWall20 = new VerticalWall();
        addObject(verticalWall20,916,337);
        VerticalWall verticalWall21 = new VerticalWall();
        addObject(verticalWall21,916,414);
        VerticalWall verticalWall22 = new VerticalWall();
        addObject(verticalWall22,916,492);
        verticalWall22.setLocation(916,516);
        VerticalWall verticalWall23 = new VerticalWall();
        addObject(verticalWall23,916,490);
        VerticalWall verticalWall24 = new VerticalWall();
        addObject(verticalWall24,1086,184);
        verticalWall24.setLocation(1086,185);
        VerticalWall verticalWall25 = new VerticalWall();
        addObject(verticalWall25,1025,382);
        VerticalWall verticalWall26 = new VerticalWall();
        addObject(verticalWall26,1108,515);
        HorizontalWall horizontalWall37 = new HorizontalWall();
        addObject(horizontalWall37,960,338);
        HorizontalWall horizontalWall38 = new HorizontalWall();
        addObject(horizontalWall38,1040,337);
        horizontalWall38.setLocation(1040,338);
        HorizontalWall horizontalWall39 = new HorizontalWall();
        addObject(horizontalWall39,1120,338);
        HorizontalWall horizontalWall40 = new HorizontalWall();
        addObject(horizontalWall40,960,150);
        HorizontalWall horizontalWall41 = new HorizontalWall();
        addObject(horizontalWall41,1040,150);
        horizontalWall41.setLocation(1078,151);
        horizontalWall41.setLocation(1050,149);
        HorizontalWall horizontalWall42 = new HorizontalWall();
        addObject(horizontalWall42,1050,149);
        horizontalWall42.setLocation(1077,146);
        horizontalWall41.setLocation(1074,148);
        horizontalWall41.setLocation(1011,147);
        horizontalWall41.setLocation(1084,151);
        horizontalWall42.setLocation(1061,149);
        horizontalWall41.setLocation(1078,151);
        horizontalWall42.setLocation(1044,145);
        horizontalWall41.setLocation(1076,149);
        horizontalWall42.setLocation(1022,216);
        horizontalWall41.setLocation(989,189);
        removeObject(horizontalWall41);
        removeObject(horizontalWall42);
        HorizontalWall horizontalWall43 = new HorizontalWall();
        addObject(horizontalWall43,1017,148);
        horizontalWall43.setLocation(1016,150);
        horizontalWall43.setLocation(1018,150);
        horizontalWall43.setLocation(1050,149);
        HorizontalWall horizontalWall44 = new HorizontalWall();
        addObject(horizontalWall44,1050,149);
        horizontalWall44.setLocation(1040,150);
        HorizontalWall horizontalWall45 = new HorizontalWall();
        addObject(horizontalWall45,960,470);
        HorizontalWall horizontalWall46 = new HorizontalWall();
        addObject(horizontalWall46,1038,470);
        HorizontalWall horizontalWall47 = new HorizontalWall();
        addObject(horizontalWall47,1116,470);
        HorizontalWall horizontalWall48 = new HorizontalWall();
        addObject(horizontalWall48,1192,470);
        verticalWall26.setLocation(1108,505);
        VerticalWall verticalWall27 = new VerticalWall();
        addObject(verticalWall27,1108,525);
        HorizontalWall horizontalWall49 = new HorizontalWall();
        addObject(horizontalWall49,47,233);
        HorizontalWall horizontalWall50 = new HorizontalWall();
        addObject(horizontalWall50,125,232);
        horizontalWall50.setLocation(124,233);
        VerticalWall verticalWall28 = new VerticalWall();
        addObject(verticalWall28,169,230);
        VerticalWall verticalWall29 = new VerticalWall();
        addObject(verticalWall29,168,186);
        verticalWall29.setLocation(169,186);
        VerticalWall verticalWall30 = new VerticalWall();
        addObject(verticalWall30,169,308);
        VerticalWall verticalWall31 = new VerticalWall();
        addObject(verticalWall31,169,383);
        VerticalWall verticalWall32 = new VerticalWall();
        addObject(verticalWall32,169,438);
        HorizontalWall horizontalWall51 = new HorizontalWall();
        addObject(horizontalWall51,212,472);
        VerticalWall verticalWall33 = new VerticalWall();
        addObject(verticalWall33,247,427);
        HorizontalWall horizontalWall52 = new HorizontalWall();
        addObject(horizontalWall52,290,472);
        HorizontalWall horizontalWall53 = new HorizontalWall();
        addObject(horizontalWall53,369,472);
        HorizontalWall horizontalWall54 = new HorizontalWall();
        addObject(horizontalWall54,447,470);
        horizontalWall54.setLocation(447,472);
        HorizontalWall horizontalWall55 = new HorizontalWall();
        addObject(horizontalWall55,527,472);
        HorizontalWall horizontalWall56 = new HorizontalWall();
        addObject(horizontalWall56,607,472);
        VerticalWall verticalWall34 = new VerticalWall();
        addObject(verticalWall34,460,426);
        verticalWall34.setLocation(460,427);
        HorizontalWall horizontalWall57 = new HorizontalWall();
        addObject(horizontalWall57,686,472);
        horizontalWall57.setLocation(704,472);
        HorizontalWall horizontalWall58 = new HorizontalWall();
        addObject(horizontalWall58,704,472);
        horizontalWall58.setLocation(704,472);
        HorizontalWall horizontalWall59 = new HorizontalWall();
        addObject(horizontalWall59,656,471);
        horizontalWall59.setLocation(658,472);
        VerticalWall verticalWall35 = new VerticalWall();
        addObject(verticalWall35,739,428);
        verticalWall35.setLocation(740,435);
        VerticalWall verticalWall36 = new VerticalWall();
        addObject(verticalWall36,740,356);
        verticalWall36.setLocation(740,356);
        HorizontalWall horizontalWall60 = new HorizontalWall();
        addObject(horizontalWall60,695,388);
        VerticalWall verticalWall37 = new VerticalWall();
        addObject(verticalWall37,599,507);
        HorizontalWall horizontalWall61 = new HorizontalWall();
        addObject(horizontalWall61,555,552);
        verticalWall37.setLocation(599,517);
        VerticalWall verticalWall38 = new VerticalWall();
        addObject(verticalWall38,599,517);
        verticalWall37.setLocation(599,506);
        VerticalWall verticalWall39 = new VerticalWall();
        addObject(verticalWall39,599,506);
        HorizontalWall horizontalWall62 = new HorizontalWall();
        addObject(horizontalWall62,208,152);
        HorizontalWall horizontalWall63 = new HorizontalWall();
        addObject(horizontalWall63,273,152);
        HorizontalWall horizontalWall64 = new HorizontalWall();
        addObject(horizontalWall64,343,152);
        HorizontalWall horizontalWall65 = new HorizontalWall();
        addObject(horizontalWall65,415,152);
        HorizontalWall horizontalWall66 = new HorizontalWall();
        addObject(horizontalWall66,485,150);
        horizontalWall66.setLocation(485,152);
        HorizontalWall horizontalWall67 = new HorizontalWall();
        addObject(horizontalWall67,534,152);
        HorizontalWall horizontalWall68 = new HorizontalWall();
        addObject(horizontalWall68,535,312);
        VerticalWall verticalWall40 = new VerticalWall();
        addObject(verticalWall40,569,194);
        VerticalWall verticalWall41 = new VerticalWall();
        addObject(verticalWall41,568,271);
        verticalWall41.setLocation(568,280);
        verticalWall41.setLocation(569,273);
        VerticalWall verticalWall42 = new VerticalWall();
        addObject(verticalWall42,357,194);
        VerticalWall verticalWall43 = new VerticalWall();
        addObject(verticalWall43,356,272);
        verticalWall43.setLocation(360,253);
        verticalWall43.setLocation(357,253);
        verticalWall43.setLocation(356,277);
        VerticalWall verticalWall44 = new VerticalWall();
        addObject(verticalWall44,356,277);
        verticalWall43.setLocation(357,272); //fasgasgag;
        Player1 player1 = new Player1(Player.INITIAL_HEALTH);
        addObject(player1,68,300);
        player1.setLocation(62,315);
        Player2 player2 = new Player2(Player.INITIAL_HEALTH);
        addObject(player2,1119,401);
        player2.setLocation(1116,404);
        P1hp p1hp = new P1hp();
        addObject(p1hp,251,664);
        p1hp.setLocation(293,660);
        P1NumberOfHealth p1NumberOfHealth = new P1NumberOfHealth(player1);
        addObject(p1NumberOfHealth,345,660);
        P2hp p2hp = new P2hp();
        addObject(p2hp,738,658);
        p2hp.setLocation(885,660);
        P2NumberOfHealth p2NumberOfHealth = new P2NumberOfHealth(player2);
        addObject(p2NumberOfHealth,937,660);
        TimeElapsed timeElapsed = new TimeElapsed();
        addObject(timeElapsed,615,664);
        timeElapsed.setLocation(599,665);
        timeElapsed.setLocation(594,665);
        timeElapsed.setLocation(594,660);
        timeElapsed.setLocation(586,661);
        player2.setLocation(967,394);
        player2.setLocation(967,389);
        BuffUp buff = new BuffUp();
        addObject(buff,getRandomNumber(10, 1239), getRandomNumber(1, 600));
        DoubleCannon doubleCannon = new DoubleCannon();
        addObject(doubleCannon,getRandomNumber(10, 1239), getRandomNumber(1, 600));
        LaserBeam laser = new LaserBeam();
        addObject(laser,getRandomNumber(10, 1239), getRandomNumber(1, 600));
    }
}
