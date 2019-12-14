
/*
*
* A program that reads one line of input text and breaks it up into its individual words.
* The words are output one per line. A word is defined to be a sequence of letters.
* Any characters in the input that are not letters are discarded.
*
* */

import textio.TextIO;

public class ListWordsInString {

    public static void main(String[] args) {

        String sentence;
        char word;

        System.out.println("Enter a Sentence to break it down into its individual words.");
        sentence = TextIO.getln();

        boolean didCarriageReturn = true;

        for (int i = 0; i < sentence.length(); i++) {
            word = sentence.charAt(i);
            if ( Character.isLetter(word) ) {
                System.out.print(word);
                didCarriageReturn = false;
            }
            else {
                if (!didCarriageReturn) {
                    System.out.println();
                    didCarriageReturn = true;
                }
            }
        }
        System.out.println();
    }

}

