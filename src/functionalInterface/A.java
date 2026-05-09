package functionalInterface;
@FunctionalInterface
public interface A {
    void show(int i,int j);
}

class Demo{
    public static void main(String[] args) {

//        A obj=new A() {
//            public void show() {
//                System.out.println("In show");
//            }
//        };
//        A obj=(i) ->
//                System.out.println("In show"+i);
        A obj=(i,j) ->
                System.out.println("In show"+i);
        obj.show(5,6);
    }
}