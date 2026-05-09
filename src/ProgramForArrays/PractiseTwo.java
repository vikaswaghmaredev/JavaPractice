package ProgramForArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PractiseTwo {
    public static void main(String[] args) {

        List<Integer> num= Arrays.asList(12,13,14,15);
        for(int i=0; i<num.size(); i++){
            System.out.println(num.get(i));
        }

        for(int i:num){
            System.out.println(i);
        }

        num.forEach(n-> System.out.println(n));
        int sum=0;
        for(int n:num){
            if(n%2==0){
                n=n*2;
                sum=sum+2;
            }
        }
    }
}
