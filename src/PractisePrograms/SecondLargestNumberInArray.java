package PractisePrograms;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {

        int a[]={3,4,5,6,7};
        int b=a.length;
        System.out.println("length of an array:"+b);
        int largest=a[0];
        int secondLargest=a[0];

        for(int i=0; i<a.length; i++){
            if(a[i]>largest){
                secondLargest=largest;
                largest=a[i];
            }else if(a[i]>secondLargest &&a[i]!=largest){
                secondLargest=a[i];
            }
            }
        System.out.println(secondLargest);
        }
    }

