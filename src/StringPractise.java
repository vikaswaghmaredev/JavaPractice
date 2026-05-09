import java.util.Locale;

public class StringPractise {
    public static void main(String[] args) {


//        float a=123.45f;
//        System.out.printf("%6f",a);

//        char c[]={'a','b','c','d'};
//        System.out.println(c);
//        String str=new String(c);
//        System.out.println(str);
//        String str1="Java Program";
//        String str2=new String("Java");
//        char c[]={'H','e','l','l','o'};
//
//        String str3=new String(c,2,2);
//
//        byte b[]={65,66,67,68};
//        String str4=new String(b);
//
//        System.out.println(str3);

//   String str1="Java";
//   String str2="Java";
//        System.out.println(str1==str2);

//        String str1="Java";
//        String str2=new String("Java");
//        System.out.println(str1==str2);

//        String str=new String("   netbeans  ");
//        System.out.println(str.length());
//        int len=str.length();
//        System.out.println(len);
//        String str2=str.toUpperCase();
//        String str3=str.toLowerCase();
//        String strOne=str.trim();
//        String strA=str.substring(3,7);
//         String str2=str.replace('e','M');
//        System.out.println(str2+" "+str);
//
//        String name="Vikas";
//        int l=name.indexOf("V");
//        int lOne=name.indexOf("i");
//        int lTwo=name.indexOf("s");
//
//        int lm=name.lastIndexOf()
//
//        System.out.println(l);
//        System.out.println();
//        String str="a8";
//        System.out.println(str.matches("a"));
//        String str=new String(" netbeans ");
//        String trim=str.trim();
//
//        int len=str.length();
//        String length=str.toUpperCase();
//        str=str.toLowerCase();
//        String str2=str.substring(1,3);
//        str.replace('e','r');
//
//        String str="Vikasi";
//        boolean v=str.startsWith("V");
//        boolean v1=str.endsWith("s");
//        char c=str.charAt(1);
//        int lf=str.indexOf('V');
//        int ls=str.lastIndexOf('i',4);
//        System.out.println(ls);

//        String str1="MR. Shah Rukh Khan";
//        System.out.println(str1.startsWith("Mr"));
//         int common=0;
//        for(int i=0; i<str1.length(); i++){
//            System.out.println(str1.charAt(i));
//        }
//        String str1="www.udemy.co.in";
//        System.out.println(str1.indexOf(".",4));
//        System.out.println(str1.lastIndexOf("."));

//        String str1="java";
//        String str2="java";
//        String str3=new String("java");
//
//        boolean l=str1.equals(str2);
//        boolean l2=str1.equals(str3);
//        boolean l3=str3.equals(str1);
//        System.out.println(l3);
//
//        int a=10;

//        String str5="china wall";
//        String str6=new String("pyramid");
//        System.out.println(str5.compareTo(str6));
//        System.out.println(str5.contains("wall"));
//        System.out.println(str5.concat(str6));
//        String.valueOf(a);
//        System.out.println(a);

//        String str="#";
//        System.out.println(str.matches("."));
//
//        String str1="a7";
//        System.out.println(str1.matches("[a-z][0-9]"));

//        String str1="$";
//        System.out.println(str1.matches("\\d"));
//        String str1="john@gmail.com";
//        System.out.println(str1.matches("\\W*"));
//        public class Factorial {
//            public static void main(String[] args) {
                // 👇 Change this value to test different inputs
//                int n = 10;
//
//                long fact = 1;
//
//                for (int i = 1; i <= n; i++) {
//                    fact = fact * i;
//                }
//
//                System.out.println("Factorial is " + fact);

//          int b=1010001;
//          String str=b+"";
//        System.out.println(str);
//        System.out.println(str.matches("[01]*"));

//        String str="a#@!bnerfw&*eG";
//        String str1=str.replaceAll("[^a-zA-Z0-9]","");
//        System.out.println(str1);

        String str="   abc  oe  WJE     WEM  ";
        System.out.println(str.replaceAll("\\s+"," ").trim());
            }
        }
