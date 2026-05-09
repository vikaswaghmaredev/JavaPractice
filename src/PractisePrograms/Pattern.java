package PractisePrograms;

public class Pattern {
    public static void main(String[] args) {
       int j=0;
        for(int i=0; i<=4; i++){
            for(j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<=4; i++){
            for(j=4; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
