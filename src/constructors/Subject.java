package constructors;

public class Subject {

    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subId,String name,int maxMarks) {
    this.subId=subId;
    this.name=name;
    this.maxMarks=maxMarks;}

    public String getSubID(){
        return subId;
    }

    public String name(){
        return name;
    }

    public int getMaxMarks(){
        return maxMarks;
    }

    public int getMarksObtain(){
        return marksObtain;
    }

    public void setMaxMarks(int mm){
        maxMarks=mm;
    }
    public void setMarksObtain(int m){
        marksObtain=m;
    }
    boolean isQualified(int m){
        return marksObtain>=maxMarks/10*4;
    }

    public String toString(){
        return "\nSubject ID:"+subId+"\nName:"+name+"\nMarks Obtained:"+marksObtain;
    }
}

class SScope3{
    public static void main(String[] args) {
        Subject[] sub=new Subject[3];
        sub[0]=new Subject("V101","Vikas",100);
        sub[1]=new Subject("101","Shubhangi",100);
        sub[2]=new Subject("103","Shreya",103);

        for(Subject s: sub){
            System.out.println(s);
        }
    }
}

