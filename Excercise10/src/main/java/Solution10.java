import java.util.Scanner;

public class Solution10 {

    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 10
     *  Copyright 2021 Jared Reich
     */



    public static void main(String[] args) {
        double subtotal = new Solution10().calculateSubtotal(); //call calculate subtotal function
        double tax = new Solution10().calculateTax(subtotal); // call calculate tax function
        double Total = new Solution10().CalculateTotal(subtotal, tax);  // call calculate total
        new Solution10().Display(subtotal, tax, Total);


    }

    public double calculateSubtotal() {
        Scanner input = new Scanner(System.in); //declare scanner
        String[] cost = new String[3]; //declare string input array for taking in string
        double[] costi = new double[3]; // declare array for parsing spring
        int[] quantityi = new int[3];
        String[] quantity = new String[3];
        double subtotal = 0;
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter the price of item " +(i+1)+ ": "); //prompt user for cost
            cost[i] = input.next(); //take in string
            costi[i] = Integer.parseInt(cost[i]); //convert to int and store in array
            System.out.println("Enter the quantity of item " +(i+1)+ ": "); //prompt user for quantity
            quantity[i] = input.next(); //takes in string
            quantityi[i] = Integer.parseInt(quantity[i]); //convert string to int
            subtotal += costi[i] * quantityi[i]; // each iteration adds the item total to subtotal
        }
        return subtotal;
    }

    public double calculateTax(double subtotal) {
        final double taxRate = 0.055;
        double finalTax = taxRate * subtotal; //calculate tax
        return finalTax;
    }

    public double CalculateTotal(double subtotal, double Tax) {
        return subtotal + Tax;
    }

    public void Display(double Subtotal, double Tax, double Total) {
        System.out.printf("Subtotal: $%.2f%n", Subtotal);
        System.out.println("Tax: $" +Tax);
        System.out.println("Total: $" +Total);
    }
}
