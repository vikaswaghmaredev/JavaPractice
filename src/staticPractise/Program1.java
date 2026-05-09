package staticPractise;

public class Program1 {
    static int x=10;
    int y=5;

    void show(){
        System.out.println(x+" "+y);
    }
    static void display(){
        System.out.println(x+"");
    }
}

class Demo{
    public static void main(String[] args) {
        Program1 one=new Program1();
        one.show();
        one.x=30;

        Program1 two=new Program1();
        two.show();
        Program1.display();
    }
}