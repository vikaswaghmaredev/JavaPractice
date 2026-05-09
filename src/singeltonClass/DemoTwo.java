package singeltonClass;

import abstractDemo.Demo;

public class DemoTwo {
    private float coffeQty;
    private float milkQty;
    private float sugarQty;
    static private DemoTwo my=null;

    private DemoTwo(){
        coffeQty=1;
        milkQty=1;
        sugarQty=1;
    }
    public void fillWater(float qty){
        coffeQty=qty;
    }
    public void fillSugar(float qty){
        sugarQty=qty;
    }
    public float getCoffee(){
        return 0.15f;
    }
    static DemoTwo getInstance(){
        if(my==null)
            my=new DemoTwo();
        return my;
    }
}

class TestClass{
    public static void main(String[] args) {
       DemoTwo m1=DemoTwo.getInstance();
       DemoTwo m2=DemoTwo.getInstance();
       DemoTwo m3=DemoTwo.getInstance();
        System.out.println(m1+" "+m2+" "+m3);
//       if(m1==m2 && m1==m3){
//           System.out.println("Same");
//
//       }
    }
}
