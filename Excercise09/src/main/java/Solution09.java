import java.util.Scanner;

public class Solution09 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution 09
     *  Copyright 2021 Jared Reich
     */
    public static void main(String[] args) {

        new Solution09().paintCalculator();
    }

    public void paintCalculator() {
        Scanner input = new Scanner(System.in);
        final float paint = 350;
        System.out.println("What is the Length and Width of the Room?");
        float Length, Width;
        Length = input.nextInt();
        Width = input.nextInt();
        float Area = Length * Width;
        float paintBucket = Area / paint;
        int totalBuckets = Math.ceil(paintBucket);
        System.out.println(Math.ceil(paintBucket));



    }

}
