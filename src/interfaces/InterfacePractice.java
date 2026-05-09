package interfaces;

interface Test {
    void meth1();
    void meth2();
}

class My implements Test{
    @Override
    public void meth1(){
        System.out.println("My meth1");
    }
    @Override
    public void meth2(){
        System.out.println("My meth2");
    }
    public void meth3(){
        System.out.println("My meth3");
    }
}

public class InterfacePractice{
    public static void main(String[] args) {
       My t=new My();
       t.meth1();
       t.meth2();
       t.meth3();

    }
}
