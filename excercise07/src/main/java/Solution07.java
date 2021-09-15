import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double conversion = 0.09290304;
        System.out.println("What is the length of the room in feet?");
        int length = input.nextInt();
        System.out.println("What is the width of the room in feet?");
        int width = input.nextInt();
        System.out.println("You entered dimensions of " +length+ " feet by " +width+ " feet.");
        int area = length * width;
        System.out.println("The area is\n" +area+ " square feet.");
        double metric = conversion * area;
        System.out.println(metric+ " square meters");

    }
}
