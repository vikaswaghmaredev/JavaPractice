package DemoInterface;

interface Computer {
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}

class DeskTop implements Computer{
    public void code(){
        System.out.println("Code, compile, run :faster");
    }

}

class Developer{

  public void devApp(Computer lap){
  lap.code();
  }
}

class Demo{
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer desk=new DeskTop();

    Developer navin=new Developer();
    navin.devApp(lap);
    }
}
