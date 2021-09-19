import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        double subtotal = new Solution10().calculateSubtotal();
        double tax = new Solution10().calculateTax(subtotal);
        double Total = new Solution10().CalculateTotal(subtotal, tax);
        new Solution10().Display(subtotal, tax, Total);


    }

    public double calculateSubtotal() {
        Scanner input = new Scanner(System.in);
        String[] cost = new String[3];
        double[] costi = new double[3];
        int[] quantityi = new int[3];
        String[] quantity = new String[3];
        double subtotal = 0;
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter the price of item " +(i+1)+ ": ");
            cost[i] = input.next();
            costi[i] = Integer.parseInt(cost[i]);
            System.out.println("Enter the quantity of item " +(i+1)+ ": ");
            quantity[i] = input.next();
            quantityi[i] = Integer.parseInt(quantity[i]);
            subtotal += costi[i] * quantityi[i];
        }
        return subtotal;
    }

    public double calculateTax(double subtotal) {
        final double taxRate = 0.055;
        double finalTax = taxRate * subtotal;
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
