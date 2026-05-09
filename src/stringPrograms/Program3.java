package stringPrograms;

public class Program3 {
    public static void main(String[] args) {
        String str="Java Programming";
        char c[]={'H','e','l','l','o'};
        byte b[]={65,66,67,68};
        String str2=new String(b,2,2);
        String str1=new String(c);
        System.out.println(str1);
    }
}
