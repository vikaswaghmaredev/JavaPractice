package methodOverload;

public class FirstProgram {

    static double area(double radius){
        return Math.PI*radius*radius;
    }
    static double area(double length, double breadth){
        return length*breadth;
    }

    public static void main(String[] args) {
        System.out.println("Area of circle:"+area(15.7));
        System.out.println("Area of reactangle:"+area(13.23,24.5));
    }
}
