package PractisePrograms;

public class FindSubString {
    public static boolean isSubstring(String main, String sub){
        return main.matches("(.*)"+sub+"(.*)");
    }


    public static void main(String[] args) {
        System.out.println(isSubstring("Vikas Waghmare","Vikas"));
        System.out.println(isSubstring("Vikas Ramesh Waghmare","Ramesh"));
        System.out.println(isSubstring("Vikas Waghmare","Vikas"));
        System.out.println(isSubstring("Vikas Waghmare","Vikas"));
        System.out.println(isSubstring("Vikas Waghmare","Vikas"));
    }
}
