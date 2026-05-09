package collections;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

//        Set<Integer> nums=new HashSet<>();
//        nums.add(12);
//        nums.add(5);
//        nums.add(8);
//        nums.add(2);
//        nums.add(6);
//        nums.add(2);
//
//
//        Iterator i=nums.iterator();
//        while(i.hasNext())
//            System.out.println(i.next());
////        System.out.println(nums.get(3));
//
////        for(int n:nums){
////            System.out.println(n);
////        }
        Map<String, Integer>student=new HashMap<>();
        student.put("Vikas",90);
        student.put("Ramesh",80);
        student.put("Shubhangi",120);

        for(String key:student.keySet()){
            System.out.println(key+" : "+student.get(key));
        }
    }
}
