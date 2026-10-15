public class A5_Square extends World {

    public void go() {
        plane.trailWidth = 5;
        plane.pausetime = 3;
        //loop that starts with 50, adds 50 everytime and goe stop 250
        for(int size= 50; size<= 250; size+= 50){

            //make random x and y
            int randomX = 50+(int)(Math.random()*550);
            int randomY = 50+(int)(Math.random()*550);

            plane.hasTrail= false;
            plane.teleport(randomX, randomY);




            //three brand-new random colors
            int r= (int)(Math.random()*255);
            int g= (int)(Math.random()*255);
            int b= (int)(Math.random()*255);

            plane.setTrailColor(r,g,b);

            square(size);
            star(size);

        }


        // square();
    }

    //parameter: type of variable that live in the parenthesis of methods
    //they can only be used inside of that method
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

    //line one
    public void star(int size) {
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

    public void bigSquare() {
        plane.setAngle(90);
        plane.hasTrail = true;
        plane.trailWidth = 10;
        plane.move(400);
        plane.turnLeft(90);
        plane.move(400);
        plane.turnLeft(90);
        plane.move(400);
        plane.turnLeft(90);
        plane.move(400);
        // notice the direction your plane is facing at this point
    }


    //todo:make another method called bigSquare that makes a square that is big
}


