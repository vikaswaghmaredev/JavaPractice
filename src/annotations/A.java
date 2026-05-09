package annotations;

class A {
    public void showTheDateWhichBelongToThisClass(){

        System.out.println("In a Show");
    }
}
class B extends A{
    @Override
    public void showTheDateWhichBelongToThisClass(){
        System.out.println("in b show");
    }
}

class Demo{
    public static void main(String[] args){
        B b=new B();
        b.showTheDateWhichBelongToThisClass();
    }
}
