public class Bikini_Bottom extends World{
public int r;
public int g;
public int b1;
public int randnum;

    public void go(){
        plane.pausetime=0;
        randnum = plane.random(0,2);
        //kirby
        if (randnum == 0) {
            body();
            right_arm();
            left_arm();
            shoe_right();
            shoe_left();
        }

        //rows of stars
        if (randnum == 1) {
            for (int z = 0; z < 10; z++) {

                for (int y = 0; y < 5; y++) {
                    plane.teleport(y * 150, (z * 30) + (y * 10));
                    plane.setTrailColor((z * 20) + (y * 10), z * 25, z * 25);
                    star();
                }
            }
        }


    }//end of go

    public void body(){
        //kirbys body
        plane.teleport(500,500);
        r=plane.random(0,255);
        g=plane.random(0,255);
        b1=plane.random(0,255);
        for(int x=0; x<360; x++) {
            plane.setTrailColor(r,g,b1);
            plane.turnLeft(1);
            plane.hasTrail= true;
            plane.move(2);
        } //end of loop
    }

    public void right_arm(){
        //kirbys arms
        plane.teleport(650, 400);
        r=plane.random(0,255);
        g=plane.random(0,255);
        b1=plane.random(0,255);
        for(int x=0; x<90; x++) {
            plane.setTrailColor(r, g, b1);
            plane.turnLeft(2);
            plane.hasTrail= true;
            plane.move(1);
        } //end of loop
    }

    public void left_arm(){
        //kirbys other arm
        plane.teleport(350, 300);
        for(int x=0; x<90; x++) {
            plane.setTrailColor(r, g, b1);
            plane.turnLeft(2);
            plane.hasTrail= true;
            plane.move(1);
        } //end of loop
    }

    public void shoe_right(){
        plane.teleport(590, 500);
        plane.circle(60);
        plane.fillCircle(60);
    }

    public void shoe_left(){
        plane.teleport(410, 500);
       plane.circle(60);
       plane.fillCircle(60);

    }

    public void star() {
        r=plane.random(0,255);
        g=plane.random(0,255);
        b1=plane.random(0,255);

        plane.setTrailColor(r,g,b1);

        plane.setAngle(290);
        plane.hasTrail = true;
        plane.move(400);

        //line two
        plane.setAngle(74);
        plane.hasTrail = true;
        plane.move(400);

        //line three
        plane.setAngle(218);
        plane.hasTrail = true;
        plane.move(400);

        //line four
        plane.setAngle(2);
        plane.hasTrail = true;
        plane.move(400);

        //line five
        plane.setAngle(146);
        plane.hasTrail = true;
        plane.move(400);
    }

}//end of file


