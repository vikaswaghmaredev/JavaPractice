package singeltonClass;

class CoffeMachine {
    private float coffeQty;
    private float waterQty;

    static private CoffeMachine our = null;

    CoffeMachine() {
        coffeQty = 1;
        waterQty = 1;
    }

    static public CoffeMachine getInstance() {
        if (our == null)
            our = new CoffeMachine();
            return our;

    }

}
public class Test{
    public static void main(String[] args) {

        CoffeMachine c=new CoffeMachine();
        CoffeMachine cOne=CoffeMachine.getInstance();

    }
}
