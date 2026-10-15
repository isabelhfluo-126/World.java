public class A1_Move extends World {

    public void go() {

        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 1;
        plane.setPosition(500,400);

        //create backboard
        plane.setTrailColor(168,181,138);
        plane.fillCircle(400);

        //line one
        plane.setTrailColor(226, 115,150);
        plane.setAngle(290);
        plane.hasTrail = true;
        plane.move(400);

        //line two
        plane.setTrailColor(235, 154,178);
        plane.setAngle(74);
        plane.hasTrail = true;
        plane.move(400);

        //line three
        plane.setTrailColor(239, 207,227);
        plane.setAngle(218);
        plane.hasTrail = true;
        plane.move(400);

        //line four
        plane.setTrailColor(236, 242,216);
        plane.setAngle(2);
        plane.hasTrail = true;
        plane.move(400);

        //line five
        plane.setTrailColor(179, 222,226);
        plane.setAngle(146);
        plane.hasTrail = true;
        plane.move(400);

        //star no.2
        plane.teleport(250,650);

        plane.setTrailColor(226, 115,150);
        plane.setAngle(290);
        plane.hasTrail = true;
        plane.move(400);

        //line two
        plane.setTrailColor(235, 154,178);
        plane.setAngle(74);
        plane.hasTrail = true;
        plane.move(400);

        //line three
        plane.setTrailColor(239, 207,227);
        plane.setAngle(218);
        plane.hasTrail = true;
        plane.move(400);

        //line four
        plane.setTrailColor(236, 242,216);
        plane.setAngle(2);
        plane.hasTrail = true;
        plane.move(400);

        //line five
        plane.setTrailColor(179, 222,226);
        plane.setAngle(146);
        plane.hasTrail = true;
        plane.move(400);
        square();
        square2();

    }
    public int random1, random2, random3;
    public void square(){
        plane.setPosition(200,400);
        random1= plane.random(0,255);
        random2= plane.random(0,255);
        random3= plane.random(0,255);
        plane.setTrailColor(random1, random2, random3);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft( 90);
        plane.move(200);
        plane.turnLeft( 90);
        plane.move(200);
        plane.turnLeft( 90);
        plane.move(200);

    }

    public int random4, random5, random6;
    public void square2(){
        plane.setPosition(500,200);
        random4= plane.random(0,255);
        random5= plane.random(0,255);
        random6= plane.random(0,255);
        plane.setTrailColor(random4, random5, random6);
        plane.turnLeft(90);
        plane.move(200);
        plane.turnLeft( 90);
        plane.move(200);
        plane.turnLeft( 90);
        plane.move(200);
        plane.turnLeft( 90);
        plane.move(200);

    }

}

