package chedkedExceptions;


class LowBalanceException extends Exception{
    public String toString(){
        return "Balance should not be less than 5000";
    }
}
public class CheckedUnchecked {
    static void fun1(){
        try{
            throw new LowBalanceException();
        }catch(LowBalanceException e){
            System.out.println(e.getMessage());
        }
    }
    static void fun2(){

    }
    static void fun3(){

    }
}
