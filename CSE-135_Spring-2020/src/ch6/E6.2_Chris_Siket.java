package ch6;

class arrayOperations {
    // print array
    static void print(int[] arr) {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }

    // a. Swap the first and last elements in the array.
    static void swap(int[] arr) {
        // swap the first and last elements
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }

    // b. Shift all elements by one to the right and move the last element into the
    // first position.
    // For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16.
    static void shift(int[] arr) {
        int last = arr[arr.length - 1];
        int next = arr[0];
        arr[0] = last;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = next;
            next = temp;
        }
    }

    // c. Replace all even elements with 0.
    static void replace_even_with_zero(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0)
                arr[i] = 0;
    }

    public static void main(String[] args) {
        // initialise the array
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.print("Before swap: ");
        print(arr);
        swap(arr);
        System.out.print("After swap: ");
        print(arr);

        arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print("\nBefore Shift: ");
        print(arr);
        shift(arr);
        System.out.print("After Shift: ");
        print(arr);

        arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print("\nBefore Replace: ");
        print(arr);
        replace_even_with_zero(arr);
        System.out.print("After Replace: ");
        print(arr);

    }
}