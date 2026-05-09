package DemoEnum;

enum Status {
    Running, Failed, Pending, Success;
}
class Demo {
    public static void main(String[] args) {

//        int i=5;
//        Status s=Status.Success;
//        System.out.println(s.ordinal());
//        System.out.println();
//        System.out.println(s);
//        Status[] ss=Status.values();
//        for(Status x:ss){
//            System.out.println(x+" "+x.ordinal());
//        }
        Status s=Status.Pending;

        switch (s){
            case Running -> System.out.println("All ");
        }
        if(s==Status.Running)
            System.out.println("All good");
        else if(s==Status.Failed)
            System.out.println("Try again");
        else if(s==Status.Pending)
            System.out.println("Please wait");
        else System.out.println("Done");
    }
}


