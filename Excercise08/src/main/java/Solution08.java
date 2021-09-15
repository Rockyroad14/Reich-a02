import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 08
 *  Copyright 2021 first_name last_name
 */

public class Solution08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many people?");
        int people = input.nextInt(); //take in input for amount of people
        System.out.print("How many pizzas do you have?");
        int pizza = input.nextInt(); //take in input for amount of pizzas
        System.out.print("How many slices per pizza?");
        int slices = input.nextInt(); //take in slices per pizza
        int totalSlices = slices * pizza; // calculate total number of slices
        System.out.println(people+ " people with " +pizza+ " pizzas (" +totalSlices+ " slices)");
        int distribute = totalSlices / people; // calculate the distribution of pizzas
        int remainder = slices % people; //
        System.out.println("Each person gets " +distribute+ " pieces of pizza.");
        System.out.println("There are " +remainder+ " leftover pieces.");

    }
}
