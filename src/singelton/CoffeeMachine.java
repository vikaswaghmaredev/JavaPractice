package singelton;

public class CoffeeMachine {
    private float coffeOty;
    private float milkOty;
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine m=null;

    private CoffeeMachine(){
        coffeOty=1;
        milkOty=1;
        waterQty=1;
        sugarQty=1;
    }
    public void filterWater(float qty){
        waterQty=qty;
    }
    public void fillSugar(float qty){
        sugarQty=qty;
    }
    public float getCoffee(){
        return 0.23f;
    }

    static CoffeeMachine getInstance(){
        if(m==null)
            m=new CoffeeMachine();
        return m;
    }
}
class Test{
    public static void main(String[] args) {

        CoffeeMachine c1=CoffeeMachine.getInstance();
        CoffeeMachine c2=CoffeeMachine.getInstance();
        CoffeeMachine c3=CoffeeMachine.getInstance();

        System.out.println(c1+" "+c2+" "+c3);
        if(c1==c2 && c1==c3 ){
            System.out.println("Same");
        }
    }
}
