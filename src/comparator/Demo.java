package comparator;

import java.util.*;
class Vikas{

    int age;
    String name;

    public Vikas(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vikas{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Demo {
    public static void main(String[] args) {
        Comparator<Vikas>com= new Comparator<Vikas>() {
            public int compare(Vikas i, Vikas j) {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };
        List<Vikas> nums= new ArrayList<>();
        nums.add(new Vikas(20,"Vikas"));
        nums.add(new Vikas(31,"Ramesh"));
        nums.add(new Vikas(72,"Shubhangi"));
        nums.add(new Vikas(29,"Papa"));
        Collections.sort(nums,com);
        System.out.println(nums);
    }
}
