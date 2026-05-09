package inheritance;

class Circle {
    protected double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double cirumference(){
        return perimeter();
    }
}

class Cylinder extends Circle{
    private double height;

    Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }

    public double volume(){
        return area()*height;
    }
}
public class Testt{
    public static void main(String[] args) {
        Cylinder c=new Cylinder(5,10);
        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(c.volume());

    }
}