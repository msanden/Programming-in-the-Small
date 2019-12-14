
/**
 * ---------------------------------------------------------------
 * This program finds an integer between 1 and 10000 that has
 * the largest number of divisors.  It prints out the maximum
 * number of divisors and the integer that has that many divisors.
 *
 * ---------------------------------------------------------------
 * Discussion - Pseudocode
 *
 * Let maxDivisors = 1  // number of divisors for number 1
 * Let numWithMax = 1
 * for each integer N from 2 to 10000:
 *    Count the number of divisors of N
 *    If that number is greater than maxDivisors:
 *        Let maxDivisors = the number of divisors of N
 *        Let numWithMax = N
 * Output maxDivisors and numWithMax
 *
 * --------------------------------------------------------------
 */

public class MostDivisors {

    public static void main(String[] args) {

        int maxDivisors = 1;
        int[] numWithMax;
        int N;

        numWithMax = new int[10001];
        numWithMax[1] = 1;


        for ( N=2; N <= 10000; N++ ) {
            int D;
            int divisorCount = 0;

            for(D = 1; D <= 10000; D++) {
                if(N % D == 0){
                    divisorCount++;
                }
            numWithMax[N] = divisorCount;
            }
            if (divisorCount > maxDivisors) {
                maxDivisors = divisorCount;
            }
        }

        System.out.println();
        System.out.print("The maximum number of divisors was " + maxDivisors + ".");
        System.out.print("  Numbers with that many divisors include:");
        for ( N = 1; N <= 10000; N++ ) {
            if (numWithMax[N] == maxDivisors) {
                System.out.print("  " + N);
            }
        }
        System.out.println();
    }

}
