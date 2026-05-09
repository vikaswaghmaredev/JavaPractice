package ProgramForArrays;

public class FirstProgram {
    public static void main(String[] args) {

        int a[] ={22,23,24,25,26,32,33,34};
        int evenSum=0;
        int oddSum=0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                evenSum =evenSum+a[i];
            }else{
                oddSum+=a[i];
            }
        }
        System.out.println("Sum of even numbers"+evenSum);
        System.out.println("Sum of odd number"+oddSum);

//        int b[]={23,45,29};
//        int sum=0;

        int b[] = {23, 45, 29};
        int sumOne = 0;

        for (int i = 0; i < b.length; i++) {
            int num = a[i];
            while (num > 0) {
                sumOne += num % 10;
                num /= 10;
            }
        }

        System.out.println("Sum of all digits: " + sumOne);

    }
}
