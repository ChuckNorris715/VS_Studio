package ch4;

import java.util.*;

class Cannonball {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double initialv, startp = 0, endp = 0, exactp = 0, time = 0.01, gravity = 9.8, deltaT = 0.01;

        System.out.print("Please enter the initial velocity: ");
        initialv = in.nextDouble();

        while (initialv >= 0) {
            endp = startp + initialv * deltaT;
            initialv = initialv - (gravity * deltaT);
            exactp = -0.5 * gravity * (time * time) + (initialv * time);
            time = +0.01;

            System.out.print("The velocity of the cannonball is: " + initialv);
            System.out.println(" m/sec.");
            System.out.print("The new position of the cannonball is: " + endp);
            System.out.println(" m.");
            System.out.print("The exact position of the cannonball is: " + exactp);
            System.out.println(" m.");
            System.out.println();
            in.close();
        }
    }
}