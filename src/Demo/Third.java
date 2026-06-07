package Demo;

public class Third {
    public static void main(String[] args){

        String str="Java Program";
        String str1=new String("JAVA");
        System.out.println(str1);
        char c[] ={'H','e','l','l','0'};
        String str3=new String(c);
        System.out.println(str3);
        byte b[] ={65,66,67,68};
        String str4=new String(b);
        System.out.println(str4);

        String a="Vikas";
        String d= "Vikas";
        System.out.println(a==d);
    }
}
