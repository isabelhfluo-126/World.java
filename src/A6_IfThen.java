public class A6_IfThen extends World {

    public int randNum;
    public int r;
    public int g;
    public int b;
    public int X;
    public int Y;


    public void go() {
        plane.hasTrail= true;
        plane.pausetime = 2 ;

        plane.hasTrail= false;
        X = plane.random(0,400);
        Y = plane.random(0,400);
        plane.teleport(X, Y);

        plane.hasTrail= true;
        //three brand-new random colors
        r = plane.random(0,255);
        g = plane.random(0,255);
        b = plane.random(0,255);

        plane.setTrailColor(r,g,b);

        randNum = plane.random(0, 4);
        if (randNum == 0) {
            square();
        }
        if (randNum == 1) {
            rectangle(200, 100);
        }
        if (randNum == 2) {
            rectangle(60, 100);
        }
        if (randNum == 3) {
            star();
        }
    }

    public void square() {
        plane.setAngle(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
        plane.move(100);
        plane.turnLeft(90);
    }

    public void rectangle(int a, int b) {
        plane.setAngle(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
        plane.move(a);
        plane.turnLeft(90);
        plane.move(b);
        plane.turnLeft(90);
    }

    public void star() {

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
    }
    //todo:add a method to the file. you can copy and paste an old one or a new one.}
// todo: write an if that asks the question if random Num is 3


