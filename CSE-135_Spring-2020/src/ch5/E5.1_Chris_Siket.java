package ch5;

import java.util.Scanner;

class NumbersTest {
public static void main(String[] args) {

    Numbers obj = new Numbers();
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter 3 numbers:");

    double x = scan.nextDouble();
    double y = scan.nextDouble();
    double z = scan.nextDouble();

    System.out.println("Smallest: "+obj.smallest(x, y, z));
    System.out.println("Average: "+obj.average(x, y, z));

    }
}


class Numbers {
    public static void main(String[] args) {
    }
    public double smallest(double x, double y, double z) {
        if (x < y && x < z) {
            return x;
        } else if (y < z) {
            return y;
        } else {
            return z;
        }
    }
    public double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}