package ch7;

import java.io.*;
import java.util.*;

class average{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter file name.");
    String file = in.next();
    try {
        Scanner inFile = new Scanner(new File(file));
        int count = 0;
        float average1 = 0;
        float average2 = 0;
        while (inFile.hasNextFloat()) {
            String str = inFile.nextLine();
            Scanner line = new Scanner(str);
            line.useDelimiter(" ");
            average1 = Float.parseFloat(line.next());
            average2 = Float.parseFloat(line.next());
            average1 += in.nextFloat();
            average2 += in.nextFloat();
        }
        System.out.println("The average of the first column: " + average1 / count);
        System.out.println("The average of the second column: " + average2 / count);
    } catch (FileNotFoundException e) {
        System.out.println("File not found.");
    }
  }
}