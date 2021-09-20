import java.util.Objects;
import java.util.Scanner;

public class Solution14 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
     *  Copyright 2021 Jared Reich
     */
    Scanner input = new Scanner(System.in);
    static double order;
    static String state;
    static double orderTotal;
    static double tax;

    public static void main(String[] args) {
        new Solution14().input();
        orderTotal = new Solution14().calculateOrder(order, state);
        new Solution14().displayOutput(orderTotal);
    }

    public void input() {
        System.out.print("What is the order amount? ");
        order = input.nextDouble();
        System.out.print("What is the state? ");
        state = input.next();
    }
    public double calculateOrder(double order, String state) {
        final double stateTax = 0.055;
        if(Objects.equals(state, "WI")) {
            tax = stateTax * order;
            order = tax + order;
        }

        return order;
    }
    public void displayOutput(double orderTotal) {
        System.out.printf("The subtotal is $%.2f%n", order);
        System.out.printf("The tax is $%.2f%n", tax);
        System.out.printf("The total is $%.2f", orderTotal);

    }


}
