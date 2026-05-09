package constructor;

import constructor.Parent;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class ParentN{
    public ParentN(){
        System.out.println("Parent constructor");
    }
    public ParentN(int x){
        System.out.println("Param of Parent"+x);
    }
}
class ChildO extends ParentN {
    public ChildO(){
        System.out.println("Child Constructor");
    }
    public ChildO(int y){
        System.out.println("Param of Child"+y);
    }
    public ChildO(int x,int y){
        super(x);
        System.out.println("2 Param of child"+y);
    }
}
class MainO {
    public static void main(String[] args) {
        ChildO gC=new ChildO(10,20);

    }
}