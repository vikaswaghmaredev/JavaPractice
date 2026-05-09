public class Phone {

     void call(){
         System.out.println("");
     }
    public void sms(){
        System.out.println("");
    }
}

interface Icamera{
    void click();
    void record();
}

interface  IMusicPlayer{
    void play();
    void stop();
}

class SmartPhone extends Phone implements Icamera,IMusicPlayer{

    @Override
    public void call() {
        System.out.println("Smart Phone video calling");
    }
    @Override
    public void sms(){
        System.out.println("Phome sending sms");
    }

    @Override
    public void click(){
        System.out.println("smart phone cliclking the photo");
    }
    @Override
    public void record(){
        System.out.println("Smart phone recording video");
    }
    @Override
    public void play(){
        System.out.println("Smart phone playing music");
    }

    @Override
    public void stop(){
        System.out.println("Smart phone stopped playing music");
    }

    public class InterfaceExample{
        public static void main(String[] args) {
           Icamera c=new SmartPhone();
           c.click();
           c.record();
           IMusicPlayer i=new SmartPhone();
           i.play();
           i.stop();
           Phone p=new SmartPhone();
           p.call();
           p.sms();

            System.out.println("-----");
            SmartPhone s=new SmartPhone();
            s.call();
            s.click();
            s.play();
            s.sms();
            s.record();
        s.stop();}
    }
}