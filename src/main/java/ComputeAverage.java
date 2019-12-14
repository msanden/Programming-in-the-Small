/**
 * This program reads a sequence of positive integers input
 * by the user, and it will print out the average of those
 * integers.  The user is prompted to enter one integer at a
 * time.  The user must enter a 0 to mark the end of the
 * data.  (The zero is not counted as part of the data to
 * be averaged.)  The program does not check whether the
 * user's input is positive, so it will actually add up
 * both positive and negative input values.
 */

import textio.TextIO;

public class ComputeAverage {

    public static void main(String[] args){

        /* Read the user's input. */
        System.out.print("Enter your number: ");
        int inputInteger = TextIO.getlnInt();

        /* Initialize the summation and counting variables. */
        int sum = 0;
        int count = 0;
        double average;

        /* Process the user's input. */
        while(inputInteger != 0 ){
            count ++;
            sum = sum + inputInteger;
            System.out.print("Enter your next number to be averaged, or 0 to end: ");
            inputInteger = TextIO.getlnInt();
        }

        /* Display the result. */
        if (count == 0)
            System.out.println("No data entered. Exiting.");
        else {
            average = (double) sum / count;
            System.out.println("You entered " + count + " integers.");
            System.out.printf("The average of these numbers is %1.3f \n", average);
        }
    }
}
