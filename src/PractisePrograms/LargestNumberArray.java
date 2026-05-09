package PractisePrograms;

public class LargestNumberArray {
    public static void main(String...args) {
        int a[]={45,56,776,453,43};
        int max=a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
