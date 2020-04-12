package ch4;

import java.util.Scanner;

//class contains method to perform calculations
class Fibonacci {
    // method to find nth fibonocci number
    public int calculate(int n) {
        // initialize variables required
        int fold1 = 1;
        int fold2 = 1;
        int fnew = 0;
        // loop started at 3 since first three numbers are
        // initialized
        for (int i = 3; i < n; i++) {
            fnew = fold1 + fold2;
            fold1 = fold2;
            fold2 = fnew;
        }
        // check value of n and return corresponding value
        // based on value of n
        if (n == 1)
            return 0;
        else if (n == 2 || n == 3)
            return 1;
        else
            return fnew;
    }
}

class testFibonacci {
    public static void main(String[] args) {
        // creating object for Fibonacci class
        Fibonacci fib = new Fibonacci();
        int n;
        // creating scanner object to read input
        Scanner in = new Scanner(System.in);
        // prompt and read input from user
        System.out.print("Enter the number of Fibonacci series to find : ");
        n = in.nextInt();
        // call method to calculate nth Fibonocci number and display it
        System.out.println("The " + n + "th Fibonacci number is " + fib.calculate(n) + ".");
        in.close();
    }
}