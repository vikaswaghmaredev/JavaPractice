package innerClasses;

public class Outer {
    int x=10;
    Inner i=new Inner();

 class Inner{
     int y=20;
     void innerDisplay(){
         System.out.println(x);
         System.out.println(y);
     }
 }
 void outerDisplay(){

     i.innerDisplay();
     System.out.println(i.y);
 }
}
class Test{
    public static void main(String[] args) {

        Outer o=new Outer();
        o.outerDisplay();
        Outer.Inner i=new Outer().new Inner();
        i.innerDisplay();

    }
}
