package ch6;

import java.util.ArrayList;
import java.util.Scanner;

class bestCustomer {
    public static String nameOfBestCustomer(ArrayList<Float> sales, ArrayList<String> customers) {
        String result = "";

        // do only if customer data is present
        if (sales.size() > 0) {
            // find the largest sales amount and corresponding customer name
            float largest = sales.get(0);
            result = customers.get(0);
            for (int i = 1; i < sales.size(); i++) {
                if (sales.get(i) > largest) {
                    largest = sales.get(i);
                    // result store best customer name
                    result = customers.get(i);
                }
            }
        }
        // return best customer name
        return result;
    }

    // main driver method
    public static void main(String[] args) {
        float amount;
        String customer;
        ArrayList<Float> sales = new ArrayList<Float>();
        ArrayList<String> customers = new ArrayList<String>();

        Scanner s = new Scanner(System.in);

        // repeat until user enter 0 as amount
        while (true) {

            // get amount from user
            System.out.print("Enter amount: ");
            amount = Float.parseFloat(s.nextLine());

            // if amount entered is 0 then print the best customer name
            if (amount == 0)
                break;
            sales.add(amount);

            // get the customer name and add it to arraylist
            System.out.print("Enter name: ");
            customer = s.nextLine();
            customers.add(customer);
        }
        // find the best customer
        String result = nameOfBestCustomer(sales, customers);

        // if no customer data present, print error message
        // else print the best customer name
        if (result.isEmpty()) {
            System.out.println("\nNo customer details present......");
        } else {
            System.out.println("\nBest customer: " + result);
        }
        s.close();
    }

}
