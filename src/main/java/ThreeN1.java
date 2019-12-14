
/*
This program reads in a positive integer from the user and
prints out the 3N+1 sequence starting from that integer.
The program also counts and print out the number of terms
in the sequence.
 */

import textio.TextIO;

public class ThreeN1 {

    public static void main(String[] args) {

        System.out.println("Enter a positive integer: ");
        int userInput = TextIO.getlnInt();

        if (userInput <= 0){
            System.out.println("You MUST enter a positive integer. Please try again.");
        }

        int counter = 0;
        while (userInput != 1){
            counter = counter + 1;

            if (userInput%2 != 0) {
                userInput = (userInput * 3) + 1;
            }
            else {
                userInput = userInput / 2;
                System.out.println(userInput);
            }

        }
        System.out.println("There were " + counter + " terms in the sequence.");
    }

}
