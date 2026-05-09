package studentClass;


class StudentTest{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float)total()/3;
    }
    public char grade(){
        if(average()>=60){
            return 'A';
        }else
            return 'B';
    }
    public String toString(){
        return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }
}
public class Student {
    public static void main(String[] args) {

        StudentTest s=new StudentTest();
        s.roll=12;
        s.name="Vikas";
        s.course="CS";
        s.m1=12;
        s.m2=13;
        s.m3=14;
        System.out.println(s.total());
        System.out.println(s);
    }
}
