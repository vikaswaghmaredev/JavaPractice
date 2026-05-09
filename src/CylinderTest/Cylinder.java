package CylinderTest;

public class Cylinder {
    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea(){
        return 2*lidArea()+circumference()*height;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double volume(){
        return lidArea()*height;
    }
}
class Demo{
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.radius=23;
        c.height=45;

        System.out.println(c.lidArea());
        System.out.println(c.circumference());
        System.out.println(c.volume());
        System.out.println(c.totalSurfaceArea());
    }
}
