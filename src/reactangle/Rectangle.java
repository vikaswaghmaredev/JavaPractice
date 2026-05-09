package reactangle;

import java.awt.*;

public class Rectangle {
    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if(length==breadth)
            return true;
        else
            return false;
    }
}

class RectangleTest{
    public static void main(String[] args) {

        Rectangle rOne=new Rectangle();
        rOne.length=22.5;
        rOne.breadth=12.2;

        System.out.println(rOne.area());
        System.out.println(rOne.perimeter());
        System.out.println(rOne.isSquare());


    }
}
