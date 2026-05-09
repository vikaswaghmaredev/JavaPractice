package methodOverriding;


import constructors.Subject;

class SuperOne{
    public void meth1(){
        System.out.println("Super meth1");
    }
}
class Sub extends SuperOne{
    public void meth1(){
        System.out.println("Sub from meth1");
    }

    public void meth2(){
        System.out.println("Sub from meth2");
    }
    public void meth3(){
        System.out.println("Sub from meth3");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
//        SuperOne s=new SuperOne();
//        s.meth1();
//        Sub s=new Sub();
//        s.meth1();
//        s.meth2();
//        s.meth3();
        SuperOne s1=new Sub();
        s1.meth1();
    }
}
