package constructor;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Parent{
    public Parent(){
        System.out.println("Parent constructor");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
}
class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandChild Constructor");
    }
}
class Main {
    public static void main(String[] args) {
        GrandChild gC=new GrandChild();

    }
}
