package ch4;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        int sum = 0;
        for (int n = 2; n <= 100; n = n + 2)
            sum += n;
        System.out.print("Sum = " + sum);
    }
}