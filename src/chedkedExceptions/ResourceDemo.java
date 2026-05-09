package chedkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ResourceDemo {
    static FileInputStream fi;

    static void Divide() throws IOException {
        try(FileInputStream fi=new FileInputStream("Test.txt");Scanner sc = new Scanner(fi);) {
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
           System.out.println(a / b);
       }
       fi.close();
    }

    public static void main(String[] args) throws IOException {
          Divide();
    }
}
