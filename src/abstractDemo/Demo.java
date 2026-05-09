package abstractDemo;

import constructors.Reactangle;

abstract class Shape {
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape{
    double radius;
    Circle(){
        System.out.println("Constructor of circle");
    }
    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(){
        System.out.println("Constructor of Rectangle");
    }
  @Override
  public double perimeter(){
    return 2*length*breadth;
  }
  @Override
    public double area(){
      return length*breadth;
  }
}

public class Demo{
    public static void main(String[] args) {
        Circle s=new Circle();
        s.radius=10;
        s.perimeter();
        s.area();

        System.out.println("-------------");
        Rectangle s1=new Rectangle();
        s1.length=5;
        s1.breadth=10;
        s.perimeter();
        s.area();

    }
}
