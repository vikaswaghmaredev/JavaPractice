package threads;

//import annotations.B;

//public class A extends Thread {
public class A implements Runnable{
    public void run() {

    }
}
//class B extends Thread{
class B implements Runnable{
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Hello");
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            }
        }

class Demo{
    public static void main(String[] args) {
        Runnable a = () ->{
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
        Runnable b=new B();
//        a.start();
//        b.start();
//        System.out.println(a.getPriority());
//        a.setPriority(Thread.MAX_PRIORITY);

       Thread t1=new Thread(a);
       Thread t2=new Thread(b);
    }
}

