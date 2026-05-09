package constructors;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double r, double h){
      r=10;
      h=10;
    }
    public Cylinder(double r){
        r=20;
    }



    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        radius=r;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        height=h;
    }
    double area(double r,double h){
        return r*h;

    }
}

class TestC{
    public static void main(String[] args) {
        Cylinder c=new Cylinder(12.22,14.34);
        System.out.println(c.getRadius());
        System.out.println(c.getHeight());
        System.out.println(c.area(10,10));
    }
}