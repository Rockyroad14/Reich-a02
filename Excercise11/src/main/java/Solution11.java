import java.util.Scanner;

public class Solution11 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 11
     *  Copyright 2021 Jared Reich
     */
    Scanner input = new Scanner(System.in); // declare a scanner
    static double rate; // declare class for rate
    static double euros; // declare class variable for euros
    static double dollars;

    public static void main(String[] args) {
        new Solution11().getValues(); // call getvalue function to get values
        new Solution11().calculateDollars(); //call calculate dollars
        new Solution11().outputExchange(); // call the output function
    }
    public void getValues() {
        System.out.println("How many euros are you exchanging? ");
        euros = input.nextDouble(); //take double for euros being exchanged
        System.out.println("What is the exchange rate? ");
        rate = input.nextDouble(); //take in exchange rate
    }
    public void calculateDollars() {
        dollars = euros * rate; // calculate conversion to dollars
        dollars = Math.ceil(dollars * 100.0) / 100.0; //round to the nearest cent


    }
    public void outputExchange() {
        System.out.printf("%d euros at an exchange rate of %.4f is%n%.2f U.S. dollars.", (int)euros, rate, dollars);
    }
}
