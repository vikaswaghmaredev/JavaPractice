package Demo;

public class FirstProgram {

    public static void main(String[] args) {


        int a[] = {23, 16, 18, 20, 34};

        int largest = a[0];
        int secondLargest = a[0];

        for (int i = 0; i < a.length; i++) {
            if(a[i]>largest){
                secondLargest=largest;
                largest=a[i];
            }else if(a[i]>secondLargest && a[i]!=largest){
                secondLargest=a[i];
            }
        }
        System.out.println(secondLargest);
    }
}