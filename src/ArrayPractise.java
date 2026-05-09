import java.sql.SQLOutput;

public class ArrayPractise {
    public static void main(String[] args) {


//        int a[]={1,2,3,4,5};

//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);

//        for(int i=0; i<a.length; i++){
//            System.out.print(a[i]+" ");

//        for(int x :a){
//            System.out.println(x);

//        for(int i=a.length-1; i>=0; i--){
//            System.out.println(a[i]);
//        }

//        int a[]={23,4,56,324,56};
//        int sum=0;
//        for(int i=0; i<a.length; i++){
//            if(sum==i){
//                System.out.println("element is found:"+i);
//            }
//
//        }
//        System.out.println("Not found");


//        for(int x: a){
//            if(x==4){
//                System.out.println("Element is found");
//            }
//        }
//        System.out.println("Not found");
//        }

//        int a[]={23,45,6666};
//        int max=a[0];
//
//        for(int i=0; i<a.length; i++){
//            if(a[i]>max){
//                max=a[i];
//            }
//        }
//        System.out.println(max);
//        int max1=a[0];
//        int max2=a[0];
//        for(int i=0; i<a.length; i++){
//            if(a[i]> max1){
//                max2=max1;
//                max1=a[i];
//            }else if(a[i]> max2){
//                max2=a[i];
//            }
//        }
//        System.out.println(max2);

//        int a[] = {2, 324, 2, 34, 4, 2, 12, 7, 8, 5};
//        for (int x : a) {
//            System.out.print(x + ",");
//            System.out.println("");
//            int temp = a[0];
//            for (int i = 1; i < a.length; i++) {
//                a[i - 1] = a[i];
//            }
//            a[a.length - 1] = temp;
//            for (int y : a) {
//                System.out.print(y + ",");
//                System.out.println("");

//            }
//        }

//        int a[]=new int[10];
//        a[0]=3;a[1]=9;a[2]=7;a[3]=8;a[4]=12;a[5]=6;
//
//        int n=6;
//
//        for(int i=0; i<n; i++)
//            System.out.print(a[i]+",");
//            System.out.println("");
//
//            int x=20;
//            int index=2;
//            for(int i=n; i>index; i--)
//               a[i]=a[i-1];
//            a[index]=x;
//
//        for(int i=0; i<n; i++)
//            System.out.print(a[i]+",");
//        System.out.println("");

//        int a[]={2,3,4,5,6,7,8,9};
//        int b[]=new int[10];
//
//        for(int i=0; i<a.length; i++){
//
//            b[i]=a[i];
//        }
//        for(int x:b){
//            System.out.print(x+" ");

//        int a[]={2,3,4,5,6};
//        int b[]=new int[10];
//
//        for(int i=a.length-1,j=0;i>=0;i++,j++){
//            b[j]=a[i];
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};

//        for(int i=0; i<a.length; i++){
//
//            for(int j=0; j<a[0].length; j++){
//                System.out.println(a[i][j]);
//            }
//            System.out.println();
        for(int[] x:a){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        }

    }



