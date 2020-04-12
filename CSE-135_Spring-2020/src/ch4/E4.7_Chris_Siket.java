package ch4;

import java.util.Scanner;

class permuteString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        char[] chars = s.toCharArray();
        int i, j;
        char temp;
        for (int itr = 0; itr < s.length(); itr++) {
            i = (int) (Math.random() * (s.length() - 1));
            j = (int) (i + 1 + (Math.random() * (s.length() - i - 1)));

            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        String result = "";
        for (int itr = 0; itr < chars.length; itr++) {
            result += chars[itr];
        }
        System.out.println(result);
        in.close();
    }
}