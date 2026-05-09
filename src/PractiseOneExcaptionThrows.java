import java.lang.reflect.ParameterizedType;

public class PractiseOneExcaptionThrows {

    void show() throws ClassNotFoundException {

        Class.forName("PractiseOneExcaptionThrows");
    }
}

class Demo{
    static {
        System.out.println("Class Loaded");
    }

    public static void main(String [] args)  {
        PractiseOneExcaptionThrows p=new PractiseOneExcaptionThrows();
        try {
            p.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
