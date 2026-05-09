package chedkedExceptions;

import java.security.spec.ECFieldF2m;

class NegativeDimensionException extends Exception{
    public String toString(){
        return "Domensions of a rectangle cannot be negative";
    }
}
public class ThrowThrowsExceptionTwo {

    static int area(int a, int b) throws Exception {
        if( a<0 || b <0)
            throw new Exception();
        return a*b;
    }
    static void meth1() throws Exception {
        System.out.println(area(10,5));
    }

    public static void main(String[] args) throws Exception {
       try {
           meth1();
       }catch(Exception e){
           System.out.println();
       }
    }
}
