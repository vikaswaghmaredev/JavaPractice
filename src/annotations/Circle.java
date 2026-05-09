package annotations;

public class Circle {
    public double radius;

    public double area(){
        return Math.PI * radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double cirucmference(){
        return perimeter();
    }

}
class CircleOne{
    public static void main(String[] args) {

        Circle c=new Circle();
        c.radius=12.4;
        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(c.cirucmference());


    }
}
