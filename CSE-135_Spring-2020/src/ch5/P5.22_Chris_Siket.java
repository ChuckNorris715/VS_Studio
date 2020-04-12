package ch5;

import java.util.Scanner;

class Barcode {
    // constants to represent characters for full bar and half bar
    public static final char FB = '|', HB = ':';
    // an array of Strings to represent the barcodes of digits from 0 to 9
    // (based on the given table)

    private static String[] barcode = { "" + FB + FB + HB + HB + HB,
            "" + HB + HB + HB + FB + FB, "" + HB + HB + FB + HB + FB,
            "" + HB + HB + FB + FB + HB, "" + HB + FB + HB + HB + FB,
            "" + HB + FB + HB + FB + HB, "" + HB + FB + FB + HB + HB,
            "" + FB + HB + HB + HB + FB, "" + FB + HB + HB + FB + HB,
            "" + FB + HB + FB + HB + HB };
    /**
     * 
     * method to print the bar code of a zipcode
     * 
     * @param zipCode- integer zip code
     * 
     */

    public static void printBarCode(int zipCode) {
        // printing start full frame bar
        System.out.print(FB);
        int sum = 0; // to store the sum of digits
        // converting to string, for ease of calculation
        String digits = String.valueOf(zipCode);
        // looping through all digits in the zipcode
        for (int i = 0; i < digits.length(); i++) {
            // parsing the digit
            int digit = Integer.parseInt("" + digits.charAt(i));
            // adding to total
            sum += digit;
            // printing barcode of digit
            printDigit(digit);
        }

        // finding remainder of sum when divided by 10
        int remainder = sum % 10;
        if (remainder == 0) {
            // check digit is 0
            printDigit(0);
        } else {
            // check digit is 10-remainder
            printDigit(10 - remainder);
        }

        // printing stop full frame bar
        System.out.print(FB + "\n");
    }
    /**
     * 
     * method to print the bar code of a digit between 0 and 9
     * 
     */
    public static void printDigit(int d) {
        if (d >= 0 && d <= 9) {
            System.out.print(barcode[d]);
        }
    }
    public static void main(String[] args) {
        // scanner to read user input
        Scanner sc = new Scanner(System.in);
        // promting and getting zip code
        System.out.print("Enter a zip code: ");
        String input = sc.nextLine();
        try {
            int zip = Integer.parseInt(input);
            // displaying the barcode
            printBarCode(zip);
        } catch (Exception e) {
            // invalid number
            System.out.println("Invalid input");
        }
    }
}