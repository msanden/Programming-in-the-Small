/*
This program lists all the letters contained in a string
and also counts the number of different letters.

The built-in function str.indexOf(letter) can
be used to achieve the same result.
*/

import textio.TextIO;

public class ListLetters {

    public static void main(String[] args) {

        String inputString;
        int count;
        char letter;

        System.out.print("Enter your text:");
        inputString = TextIO.getln();
        inputString = inputString.toLowerCase();

        System.out.println("Your input contains the following letters:");
        count=0;
        for (letter = 'a'; letter < 'z'; letter ++){
            for (int i = 0; i< inputString.length(); i++)
                if (inputString.charAt(i) == letter){
                    System.out.print(letter);
                    System.out.print(' ');
                    count++;
                break;
            }
        }

        System.out.println();
        System.out.println("It has " + count + " different letters.");

    }

}
