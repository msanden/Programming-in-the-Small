import textio.TextIO;

/**
 * A program that reads an integer typed in by the user and
 * computes and returns the square of that integer.
 */

public class PrintSquare {

    public static void main(String[] args){

        double userInput;
        double square;

        System.out.print("Enter a number: ");
        userInput = TextIO.getlnDouble();

        square = userInput * userInput;

        System.out.println();
        System.out.print("The square of " + userInput);
        System.out.print(" is " + square);
        System.out.println();

    }

}
