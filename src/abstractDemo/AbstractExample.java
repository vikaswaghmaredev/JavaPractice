package abstractDemo;

//import methodOverriding.Super;

abstract class Super {
    Super(){
        System.out.println("Super Constructor");
    }

    public void meth1(){
        System.out.println("Meth1 of Super");
    }
    abstract public void meth2();
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Sub class meth2");

    }
}

public class AbstractExample{
    public static void main(String[] args) {
        Super s;
        s=new Sub();
        s.meth2();


    }
}

