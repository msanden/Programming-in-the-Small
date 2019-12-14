
/**
 * This program reads a positive integer from the user.
 * It counts how many divisors that number has, and
 * then it prints the result.
 */

import textio.TextIO;

public class CountDivisors {

    public static void main(String[] args){

        int N;
        int divisorCount;
        int numberTestedDivisors;
        int testDivisor;

        /* Get a positive integer from the user. */
        while(true){
            System.out.print("Enter a number N, or 0 to quit: ");
            N = TextIO.getlnInt();
            if (N > 0)
                break;
            if (N == 0) {
                System.out.print("You have exited the program, goodbye. \n");
                System.exit(0);
            }
            else
                System.out.println("That number is not positive.  Please try again.");
        }

        /* Prime the loop*/
        divisorCount=0;
        numberTestedDivisors=0;

        /* Count the divisors, printing a "." after every 10000000 tests. */
        for (testDivisor=1; testDivisor<=N; testDivisor++) {
            if (N % testDivisor == 0)
                divisorCount++;
            numberTestedDivisors++;

            if (numberTestedDivisors == 10000000) {
                System.out.print('.');
                numberTestedDivisors = 0;
            }
        }

        /* Display the result. */
        System.out.print("Your number " + N + ", has " + divisorCount + " divisors" +
                " between 1 and " + N +  " \n");
    }
}
