package DemoInterface;

import java.sql.SQLOutput;

public interface A {
    int age=44;
    String area="Mumbai";
    void show();
    void config();
}
 interface X extends A{
    void run();
 }
 class Y implements X{
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In config");
    }
    public void run(){
        System.out.println("In run");
    }
 }
// public class Demo{
//     public static void main(String[] args) {
//         A onb;
//          onb=new Y();
//          onb.show();
//          onb.config();
//         System.out.println(A.age);
//         System.out.println(A.area);
//
//         X on;
//         on=new

//
//     }
// }
