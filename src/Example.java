public class Example {
    public static void main(String[] args) {

        String a="$@#@!!@VIKAS*&#&123";
       String s= a.replaceAll("[^a-zA-Z]","");
        System.out.println(s);
    }
}
