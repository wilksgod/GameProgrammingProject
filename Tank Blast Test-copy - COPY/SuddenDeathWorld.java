import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SuddenDeathWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SuddenDeathWorld extends SimulationWorld
{

    /**
     * Constructor for objects of class SuddenDeathWorld.
     * 
     */
    public SuddenDeathWorld()
    {
        super("muzon.mp3", 1242, 690, new Point2D(0.0, 0.0), 16);
        prepare();
    }

    public void act()
    {
        super.act();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        VerticalWall verticalWall = new VerticalWall();
        addObject(verticalWall,1236,588);
        VerticalWall verticalWall2 = new VerticalWall();
        addObject(verticalWall2,1236,512);
        VerticalWall verticalWall3 = new VerticalWall();
        addObject(verticalWall3,1236,433);
        VerticalWall verticalWall4 = new VerticalWall();
        addObject(verticalWall4,1236,357);
        VerticalWall verticalWall5 = new VerticalWall();
        addObject(verticalWall5,1236,279);
        VerticalWall verticalWall6 = new VerticalWall();
        addObject(verticalWall6,1236,198);
        verticalWall6.setLocation(1236,229);
        VerticalWall verticalWall7 = new VerticalWall();
        addObject(verticalWall7,1236,153);
        VerticalWall verticalWall8 = new VerticalWall();
        addObject(verticalWall8,1236,75);
        verticalWall8.setLocation(1237,37);
        VerticalWall verticalWall9 = new VerticalWall();
        addObject(verticalWall9,1237,37);
        verticalWall9.setLocation(1237,17);
        VerticalWall verticalWall10 = new VerticalWall();
        addObject(verticalWall10,1236,95);
        VerticalWall verticalWall11 = new VerticalWall();
        addObject(verticalWall11,4,587);
        VerticalWall verticalWall12 = new VerticalWall();
        addObject(verticalWall12,4,508);
        VerticalWall verticalWall13 = new VerticalWall();
        addObject(verticalWall13,4,430);
        VerticalWall verticalWall14 = new VerticalWall();
        addObject(verticalWall14,4,350);
        verticalWall14.setLocation(1,373);
        verticalWall14.setLocation(4,351);
        verticalWall14.setLocation(4,367);
        VerticalWall verticalWall15 = new VerticalWall();
        addObject(verticalWall15,4,292);
        VerticalWall verticalWall16 = new VerticalWall();
        addObject(verticalWall16,1,216);
        verticalWall16.setLocation(2,229);
        verticalWall16.setLocation(2,229);
        verticalWall16.setLocation(4,229);
        verticalWall16.setLocation(6,226);
        verticalWall16.setLocation(6,228);
        verticalWall16.setLocation(1,232);
        verticalWall16.setLocation(4,230);
        VerticalWall verticalWall17 = new VerticalWall();
        addObject(verticalWall17,1,151);
        verticalWall17.setLocation(4,158);
        VerticalWall verticalWall18 = new VerticalWall();
        addObject(verticalWall18,3,79);
        verticalWall18.setLocation(2,39);
        VerticalWall verticalWall19 = new VerticalWall();
        addObject(verticalWall19,2,39);
        verticalWall19.setLocation(6,28);
        VerticalWall verticalWall20 = new VerticalWall();
        addObject(verticalWall20,4,102);
        VerticalWall verticalWall21 = new VerticalWall();
        addObject(verticalWall21,293,311);
        VerticalWall verticalWall22 = new VerticalWall();
        addObject(verticalWall22,364,309);
        HorizontalWall horizontalWall = new HorizontalWall();
        addObject(horizontalWall,328,344);
        horizontalWall.setLocation(329,348);
        HorizontalWall horizontalWall2 = new HorizontalWall();
        addObject(horizontalWall2,328,256);
        verticalWall22.setLocation(364,289);
        VerticalWall verticalWall23 = new VerticalWall();
        addObject(verticalWall23,364,289);
        verticalWall21.setLocation(293,295);
        VerticalWall verticalWall24 = new VerticalWall();
        addObject(verticalWall24,293,295);
        HorizontalWall horizontalWall3 = new HorizontalWall();
        addObject(horizontalWall3,600,352);
        removeObject(horizontalWall3);
        verticalWall22.setLocation(364,311);
        VerticalWall verticalWall25 = new VerticalWall();
        addObject(verticalWall25,364,311);
        verticalWall21.setLocation(293,309);
        VerticalWall verticalWall26 = new VerticalWall();
        addObject(verticalWall26,293,309);
        HorizontalWall horizontalWall4 = new HorizontalWall();
        addObject(horizontalWall4,898,260);
        horizontalWall4.setLocation(898,260);
        VerticalWall verticalWall27 = new VerticalWall();
        addObject(verticalWall27,933,303);
        VerticalWall verticalWall28 = new VerticalWall();
        addObject(verticalWall28,863,303);
        HorizontalWall horizontalWall5 = new HorizontalWall();
        addObject(horizontalWall5,898,348);
        HorizontalWall horizontalWall6 = new HorizontalWall();
        addObject(horizontalWall6,52,3);
        horizontalWall6.setLocation(40,4);
        horizontalWall5.setLocation(899,351);
        HorizontalWall horizontalWall7 = new HorizontalWall();
        addObject(horizontalWall7,898,348);
        HorizontalWall horizontalWall8 = new HorizontalWall();
        addObject(horizontalWall8,120,4);
        HorizontalWall horizontalWall9 = new HorizontalWall();
        addObject(horizontalWall9,200,4);
        HorizontalWall horizontalWall10 = new HorizontalWall();
        addObject(horizontalWall10,279,4);
        HorizontalWall horizontalWall11 = new HorizontalWall();
        addObject(horizontalWall11,356,4);
        HorizontalWall horizontalWall12 = new HorizontalWall();
        addObject(horizontalWall12,436,4);
        HorizontalWall horizontalWall13 = new HorizontalWall();
        addObject(horizontalWall13,516,4);
        HorizontalWall horizontalWall14 = new HorizontalWall();
        addObject(horizontalWall14,595,4);
        HorizontalWall horizontalWall15 = new HorizontalWall();
        addObject(horizontalWall15,673,4);
        HorizontalWall horizontalWall16 = new HorizontalWall();
        addObject(horizontalWall16,751,4);
        HorizontalWall horizontalWall17 = new HorizontalWall();
        addObject(horizontalWall17,828,4);
        HorizontalWall horizontalWall18 = new HorizontalWall();
        addObject(horizontalWall18,906,4);
        HorizontalWall horizontalWall19 = new HorizontalWall();
        addObject(horizontalWall19,981,4);
        HorizontalWall horizontalWall20 = new HorizontalWall();
        addObject(horizontalWall20,1060,4);
        HorizontalWall horizontalWall21 = new HorizontalWall();
        addObject(horizontalWall21,1138,3);
        horizontalWall21.setLocation(1138,4);
        HorizontalWall horizontalWall22 = new HorizontalWall();
        addObject(horizontalWall22,1199,4);
        HorizontalWall horizontalWall23 = new HorizontalWall();
        addObject(horizontalWall23,40,623);
        HorizontalWall horizontalWall24 = new HorizontalWall();
        addObject(horizontalWall24,1190,624);
        horizontalWall24.setLocation(1192,624);
        HorizontalWall horizontalWall25 = new HorizontalWall();
        addObject(horizontalWall25,119,623);
        HorizontalWall horizontalWall26 = new HorizontalWall();
        addObject(horizontalWall26,199,624);
        HorizontalWall horizontalWall27 = new HorizontalWall();
        addObject(horizontalWall27,279,624);
        HorizontalWall horizontalWall28 = new HorizontalWall();
        addObject(horizontalWall28,358,624);
        HorizontalWall horizontalWall29 = new HorizontalWall();
        addObject(horizontalWall29,435,623);
        horizontalWall29.setLocation(436,624);
        HorizontalWall horizontalWall30 = new HorizontalWall();
        addObject(horizontalWall30,515,624);
        HorizontalWall horizontalWall31 = new HorizontalWall();
        addObject(horizontalWall31,588,625);
        horizontalWall31.setLocation(592,624);
        HorizontalWall horizontalWall32 = new HorizontalWall();
        addObject(horizontalWall32,670,624);
        HorizontalWall horizontalWall33 = new HorizontalWall();
        addObject(horizontalWall33,749,624);
        HorizontalWall horizontalWall34 = new HorizontalWall();
        addObject(horizontalWall34,826,624);
        HorizontalWall horizontalWall35 = new HorizontalWall();
        addObject(horizontalWall35,904,624);
        HorizontalWall horizontalWall36 = new HorizontalWall();
        addObject(horizontalWall36,983,624);
        HorizontalWall horizontalWall37 = new HorizontalWall();
        addObject(horizontalWall37,1062,624);
        HorizontalWall horizontalWall38 = new HorizontalWall();
        addObject(horizontalWall38,1132,624);
        VerticalWall verticalWall29 = new VerticalWall();
        addObject(verticalWall29,625,580);
        VerticalWall verticalWall30 = new VerticalWall();
        addObject(verticalWall30,624,500);
        verticalWall30.setLocation(625,501);
        VerticalWall verticalWall31 = new VerticalWall();
        addObject(verticalWall31,613,44);
        VerticalWall verticalWall32 = new VerticalWall();
        addObject(verticalWall32,612,118);
        verticalWall32.setLocation(613,119);
        
        Player1 p1 = new Player1(1);
        addObject(p1, 189,300);
        Player2 p2 = new Player2(1);
        addObject(p2, 1026,300);
        p1.setLocation(189,300);
        p2.setLocation(1026,300);
        P1hp p1hp = new P1hp();
        addObject(p1hp,269,664);
        p1hp.setLocation(319,659);
        P1NumberOfHealth p1NumberOfHealth = new P1NumberOfHealth(p1);
        addObject(p1NumberOfHealth,363,659);
        P2hp p2hp = new P2hp();
        addObject(p2hp,896,663);
        p2hp.setLocation(901,657);
        P2NumberOfHealth p2NumberOfHealth = new P2NumberOfHealth(p2);
        addObject(p2NumberOfHealth,945,657);
    }
}
