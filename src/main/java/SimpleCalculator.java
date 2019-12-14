
/* -----------------------------------------------------------
  This program evaluates simple expressions such as 2 + 2
  and 34.2 * 7.81, consisting of a number, an operator,
  and another number.  The operators +, -, *, / are allowed.
  The program will read and evaluate expressions until
  the user inputs a line that starts with the number 0.

  -----------------------------------------------------------
  Discussion -- Pseudocode

  while (true):
   Let firstNum = TextIO.getDouble()
   if firstNum is 0:
       Break out of the loop
   Let operator = TextIO.getChar()
   Let secondNum = TextIO.getlnDouble()
   Find the value of the expression
   Display the value.

  --------------------------------------------------------------
 */

import textio.TextIO;

public class SimpleCalculator {

    public static void main(String[] args) {

        while(true) {

            System.out.print("Enter the first number, or 0 to exit program: ");
            double firstNumber = TextIO.getlnDouble();
            if (firstNumber == 0) {
                System.out.println("You have exited the program.");
                System.out.println();
                break;
            }
            System.out.print("Enter an operator. Any of +, -, *, /.");
            char operator = TextIO.getChar();
            System.out.print("Enter your second number: ");
            double secondNumber = TextIO.getlnDouble();

            double value;
            switch (operator) {
                case '+':
                    value = firstNumber + secondNumber;
                    break;
                case '-':
                    value = firstNumber - secondNumber;
                    break;
                case '*':
                    value = firstNumber * secondNumber;
                    break;
                case '/':
                    value = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Unknown operator " + operator);
                    continue;
            }
            System.out.println("Your answer is " + value);
            System.out.println();
        }

    }

}


