package euclidean;

import java.util.Scanner;

/*
 * @author Aaron, Adrian
 * @description Euclidean Divsion Project
 */
public class EuclideanDivision {
    
    public static void main(String[] args) {
        // Scanner object to receive keyboard input
        Scanner input = new Scanner(System.in);

        int dividend;
        int divisor;
        int quotient;
        int remainder;

        // Prompt the user to enter an dividend
        System.err.println("Euclidean Division");
        System.out.print("Enter an dividend: ");
        dividend = input.nextInt();

        // Prompt the user to enter the divisor
        System.out.print("Enter the divisor: ");
        divisor = input.nextInt();

        // Finds the quotient 
        quotient = (dividend/divisor);

        // Finds the remainder
        remainder = (dividend%divisor);

        test test1 = new Test
        // Display the quotient and remainder in the form a = bq + r.
        System.out.println(dividend + " = " + quotient + " * " + divisor + " + " + remainder);
    }


}