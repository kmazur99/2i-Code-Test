package me.kacper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Get user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value A: ");
        int y = sc.nextInt();
        System.out.println("Enter value X: ");
        int x = sc.nextInt();

        if (y > 0 && x > 0) {
            // Assign values to variables for iteration
            int a = y;
            int b = a;

            // Iterate in multiples of A until X
            System.out.println("\nIterate in multiples of " + a + " until " + x);
            while (a <= x) {
                System.out.println("Value of A: " + a);
                a = a + b;
            }

            // Reset values for next iteration
            a = y;
            b = a;

            // Iterate in multiples of A + 1 until 2X
            System.out.println("\nIterate in multiples of " + a + " + 1 until 2(" + x + ")");
            while ((a = a + 1) <= 2 * x) {
                System.out.println("Value of A: " + a);
                a = a + b;
            }

            // Reset values for next iteration
            a = y;
            b = a;

            // Iterate in multiples of A + 2 until 3X
            System.out.println("\nIterate in multiples of " + a + " + 2 until 3(" + x + ")");
            while ((a = a + 2) <= 3 * x) {
                System.out.println("Value of A: " + a);
                a = a + b;
            }
        }
        else {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
}
