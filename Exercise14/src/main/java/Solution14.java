import java.util.Objects;
import java.util.Scanner;

public class Solution14 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
     *  Copyright 2021 Jared Reich
     */
    Scanner input = new Scanner(System.in);
    static double order; //declare necessary variables and string
    static String state;
    static double orderTotal;
    static double tax;

    public static void main(String[] args) {
        new Solution14().input();
        orderTotal = new Solution14().calculateOrder(order, state);
        new Solution14().displayOutput(orderTotal);
    }

    public void input() {
        System.out.print("What is the order amount? "); // takes in input
        order = input.nextDouble();
        System.out.print("What is the state? ");
        state = input.next();
    }
    public double calculateOrder(double order, String state) {
        final double stateTax = 0.055;
        if(Objects.equals(state, "WI")) {
            tax = stateTax * order; // calculate tax if in WI
            order = tax + order; // add tax to find total order
        }
        order = Math.ceil(order * 100.0) / 100.0; // round up to nearest cent

        return order;
    }
    public void displayOutput(double orderTotal) {
        System.out.printf("The subtotal is $%.2f%nThe tax is $%.2f%nThe total is $%.2f", order, tax, orderTotal);

    }


}
