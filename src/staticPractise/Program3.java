package staticPractise;

public class Program3 {
    static {
        System.out.println("Block1");
    }
}
class Test{
public static void main(String[] args) {
//   Program3 p=new Program3();
    System.out.println("Main");
    Program3 p=new Program3();
}
}
