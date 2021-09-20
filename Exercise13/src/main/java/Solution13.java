import java.util.Scanner;

public class Solution13 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 13
     *  Copyright 2021 Jared Reich
     */
    Scanner input = new Scanner(System.in);
    static double principal;
    static double rate;
    static int time;
    static int n;

    public static void main(String[] args) {
        new Solution13().takeInput(); //call to take input
        double A = new Solution13().calculateCompInterest(principal, rate, time, n); // call function to find compound interest
        new Solution13().output(A); // call to create output
    }
    public void takeInput() {
        System.out.print("Enter the principal: ");
        principal = input.nextDouble();
        System.out.print("Enter the rate of interest: ");
        rate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        time = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        n = input.nextInt();

    }
    public double calculateCompInterest(double P, double r, int t, int n) {
        int Exponent = n * t; // calculate exponent
        r = r / 100; //convert rate to decimal
        double Constant = (1 + r/n); //Do order of operations to solve for compound interest
        double A = Math.pow(Constant, Exponent);
        A = A * P;
        A = Math.ceil(A * 100.0) / 100.0;
        return A;

    }

    public void output(double A) {
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.", (int)principal, rate, time, n, A);
    }


}
