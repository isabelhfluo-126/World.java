public class A7_BasicLoop extends World {

    public int X;
    public int Y;
    public int r;
    public int g;
    public int b;
    public int randNum;
    public void go() {
        plane.hasTrail = true;
        plane.trailWidth = 3;
        plane.pausetime=0;

        for(int z=0; z<10;z++){

            for(int y=0; y<5;y++){
//            plane.move(100);
//            plane.turnLeft(90);
                plane.teleport(y*150, (z*30)+(y*10));
                plane.setTrailColor((z*20)+(y*10), z*25, z*25);
                square11();
            }
        }



        for(int x=0;x<12;x=x+1) {
            //1st part: variable declaration
            //2nd part: if statement/ conditional question
            //3rd part: increment
            // make a row of squares using teleport

            //random color
//            r=plane.random(0,255);
//            g=plane.random(0,255);
//            b=plane.random(0,255);
//            plane.setTrailColor(r,g,b);
//
//            //random position
//            X=plane.random(100,400);
//            Y=plane.random(100,300);
//            plane.teleport(X,Y);
//
//            randNum = plane.random(0,3);
//            if (randNum == 0) {
//                square(100);
//            }
//            if (randNum == 1) {
//                bigSquare();
//            }
//
//            if (randNum == 2) {
//                star();
//            }

            //todo: make game print different shapes

        }

    }

    public void square11(){
        for(int y=0; y<4;y++){
            plane.move(100);
            plane.turnLeft(90);

        }
    }

    public void star() {
        plane.setAngle(290);
        plane.hasTrail = true;
        plane.move(150);

        //line two
        plane.setAngle(74);
        plane.hasTrail = true;
        plane.move(150);

        //line three
        plane.setAngle(218);
        plane.hasTrail = true;
        plane.move(150);

        //line four
        plane.setAngle(2);
        plane.hasTrail = true;
        plane.move(150);

        //line five
        plane.setAngle(146);
        plane.hasTrail = true;
        plane.move(150);
    }

    public void bigSquare() {
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 10;
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft(90);
        plane.move(200);
        // notice the direction your plane is facing at this point
    }

    public void square(int size) {
        plane.setAngle(90);
        //data type: boolean
        plane.hasTrail = true;
        //data type:integer
        plane.trailWidth = 10;
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        plane.turnLeft(90);
        plane.move(size);
        // notice the direction your plane is facing at this point
    }
}
