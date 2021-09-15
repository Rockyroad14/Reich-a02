import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 07
 *  Copyright 2021 first_name last_name
 */

public class Solution07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double conversion = 0.09290304; //declare a constant
        System.out.println("What is the length of the room in feet?");
        int length = input.nextInt(); //take in length
        System.out.println("What is the width of the room in feet?");
        int width = input.nextInt(); // take in width
        System.out.println("You entered dimensions of " +length+ " feet by " +width+ " feet."); //display dimensions taken
        int area = length * width;  // calculate total area in ft
        System.out.println("The area is\n" +area+ " square feet.");
        double metric = conversion * area; // calculate total area in metric
        System.out.println(metric+ " square meters"); //display metric amount

    }
}
