public class A3_Color extends World {

    //variables
    public int random1, random2, random3;
    public void go() {

        System.out.println("Change the color of the trail behind the plane");
        plane.setAngle(45);
        plane.hasTrail = true;
        plane.trailWidth = 10;

        //add value to the variable
        random1=plane.random(0,255);
        random2=plane.random(0,255);
        random3=plane.random(0,255);

        //r=red, g=green, b=blue
        //values have to be between 0-255
        plane.setTrailColor(random1, random2, random3);
        plane.move(100);
        square();

    }//end of go


    public int random4, random5, random6;
    public void square(){
        plane.setPosition(500,400);
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

    }//end of square


}//end of the file

//practice loop