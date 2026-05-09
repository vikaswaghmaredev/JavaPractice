package methodOverriding;

class Super {

    void display() {
        System.out.println("Hello");
    }
}
class Child extends Super{
    @Override
    void display(){
        System.out.println("Hello Welcome");
    }
}
class Main{
    public static void main(String[] args) {
        Super s=new Super();
        s.display();

        System.out.println("---");
        Child c=new Child();
        c.display();

        Super sOne=new Child();
        sOne.display();
    }
}
