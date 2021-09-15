import java.util.Scanner;
import java.time.LocalDate;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 06
 *  Copyright 2021 first_name last_name
 */

public class Solution06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, retirement;
        System.out.println("What is your current age?");
        age = input.nextInt();
        System.out.println("At what age would you like to retire?");
        retirement = input.nextInt();
        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();
        int left = retirement - age;
        System.out.println("You have " +left+ " years left until you can retire.");
        int retirementYear = current_Year + left;
        System.out.println("It's " +current_Year+ ", so you can retire in " +retirementYear);


    }
}
