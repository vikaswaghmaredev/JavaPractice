package LocalInner;
abstract class My{
    abstract public void show();
}
class Outer {
    public void display(){


        My m=new My() {
            @Override
            public void show() {
                System.out.println("HEllo");
            }
        };
        m.show();
//        class Inner{
//            void show() {
//                System.out.println("Hello");
//            }
//        }
////        Inner i=new Inner();
//        new Inner().show();
////        i.show();
    }
}
class LocalInner{
    public static void main(String[] args) {
        Outer o=new Outer();
        o.display();
    }
}