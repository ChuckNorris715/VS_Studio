package ch7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class helloTest {
    public static void main(String[] args) {
        try {
            File file = new File("hello.txt");
            PrintWriter pw = new PrintWriter(file);
            pw.write("Hello World!");
            pw.flush();
            pw.close();
            Scanner scan = new Scanner(file);
            String msg = scan.nextLine();
            System.out.println(msg);
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }

}