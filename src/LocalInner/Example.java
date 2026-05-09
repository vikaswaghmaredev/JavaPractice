package LocalInner;

public class Example {

    int x=10;
    static int y=20;

    static class My{
        public void show(){
            System.out.println(y);
        }
    }
}
class localinner {

    public static void main(String[] args) {

        Example.My m=new Example.My();
        m.show();
    }
}
