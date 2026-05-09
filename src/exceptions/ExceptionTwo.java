package exceptions;

public class ExceptionTwo {
    public static void main(String[] args) {


        int a[] = {30, 20, 10, 40, 0};
            try {
               int c = a[0] / a[2];
               System.out.println(c);
               try{
                   System.out.println(a[5]);
               }catch (ArrayIndexOutOfBoundsException e){
//                   e.printStackTrace();
                   System.out.println("Invalid Syntax");
               }
            }catch(ArithmeticException e){
               System.out.println("Denominotor should not be divided by zero");
        }

        System.out.println("Bye");
    }
}
