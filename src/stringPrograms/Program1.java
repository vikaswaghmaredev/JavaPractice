package stringPrograms;

public class Program1 {
    public static void main(String[] args) {

//        char c[]={'A','B','C','D'};
//        String str1=new String(c);
//        System.out.println(str1);
        String s="Vikas";
//        int count=0;
        String vowels="";

        for(char c:s.toCharArray()){
            if("aeiou".indexOf(c) !=-1 &&vowels.indexOf(c)==-1){
                vowels +=c;
//                count++;
            }
        }
        System.out.println("\nTotal vowels: "+vowels);
    }
}
