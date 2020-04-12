package ch6;

import java.util.*;

class reverseArray {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int size;
        System.out.println("Enter length of array : ");
        size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array : ");
        for (int i = 0; i < size; i++)
            arr[i] = in.nextInt();
        ReverseArray(arr);
        System.out.println("Reversed array : ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    static void ReverseArray(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}