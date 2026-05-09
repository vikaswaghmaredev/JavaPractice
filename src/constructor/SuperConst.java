package constructor;

class Reactngle {
    int length;
    int breadth;

    public Reactngle(){
        length=1;
    }

    public Reactngle(int l, int b){
        length=l;
        breadth=b;
    }
}
class Cuboid extends Reactngle {
    int height;

    public Cuboid(){
       height=1;
    }
    public Cuboid(int h){
        height=h;
    }
    public Cuboid(int l,int b,int h){
        super(l,b);
        height=h;
    }
    int volume(){
        return length*breadth*height;
    }
}

public class SuperConst {
    public static void main(String[] args) {
      Cuboid c=new Cuboid(10,10,10);
        System.out.println(c.volume());

    }
}
