package constructors;
class Test{

    private int length;
    private int breadth;

    public Test(){
        length=1;
        breadth=1;
    }
    public Test(int l, int b){
        length=l;
        breadth=b;
    }

    public Test(int s){
        length=breadth=s;
    }

    public int getLength(){
        return length;
    }


    public void setLength(int length){
        this.length=length;
//        breadth=2;
    }
    public int getBreadth(){
        return breadth;
    }

    public void setBreadth(int breadth){
        this.breadth=breadth;
    }

}
public class Reactangle {
    public static void main(String[] args) {
        Test t=new Test(5);
        System.out.println(t.getLength());
    }

}
