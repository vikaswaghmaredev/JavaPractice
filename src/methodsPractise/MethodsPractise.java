package methodsPractise;

public class MethodsPractise {
//    static void show(int ...a){
//        for(int x:a){
//            System.out.println(x);
//        }
//    }
    static void showList(int start,String ...s){
        for(int i=0; i<s.length; i++){
            System.out.println(start+"."+s[i]);
        start++;
        }
    }

    public static void main(String ...args) {
//        show();
//        show(10,20,30);
//        show(new int[]{2,3,4,5,6,7});
        showList(5,"John","Smith","vikas","Ramesh");
    }
}
