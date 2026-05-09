
class VikasException  extends Exception{

    public VikasException(String string){
           super(string);
    }
}

public class DemoE {

    public static void main(String[] args) {
   try {
       Class.forName("DemoE");
       }
       catch(ClassNotFoundException f) {
           System.out.println("Not able to find the class");
       }
        int i=0;
        int j=0;
        int num[]=new int[5];
        try {
            j = 18 / i;
            if (j == 0)
                throw new VikasException("");

//            System.out.println(num[1]);
            System.out.println(num[5]);

        } catch (VikasException n){
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong"+e);
        } catch(IndexOutOfBoundsException x){
            System.out.println("Stay in your limit"+x);
        }

        System.out.println(j);
        System.out.println("By");
    }
}
