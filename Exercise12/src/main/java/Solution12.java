import java.util.Scanner;

public class Solution12 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 12
     *  Copyright 2021 Jared Reich
     */
    Scanner input = new Scanner(System.in);
    static double principal;
    static double rate;
    static double time;

    public static void main(String[] args) {
        new Solution12().takeInput(); // call to take input
        double Answer = new Solution12().calculateInterest(principal, rate, time);
        new Solution12().output(Answer); // call to output answer
    }
    public void takeInput() {
        System.out.print("Enter the principal: ");
        principal = input.nextDouble();
        System.out.print("Enter the rate of interest: ");
        rate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        time = input.nextDouble();
    }

    public double calculateInterest(double P, double r, double t) {
         r = r / 100; //convert rate into decimal percent
         double A = P * (1 + r * t); // calculate the Interest
         A = Math.ceil(A * 100.0) / 100.0; // Round to the nearest cent
         return A; // return answer
    }
    public void output(double answer) {
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f.", (int) time, rate, answer);
    }

}
