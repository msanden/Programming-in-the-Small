/*
* Taking a file that contains information about sales figures for a company in various cities,
* this program computes and prints the total sales from all the cities together.
* It also reports the number of cities for which data was not available.
*  The name of the file is "sales.dat", which which has the following format:
*     San Francisco:  19887.32
*     Chicago:  no report received
*     New York: 298734.12
* */

import textio.TextIO;


public class SalesFigures {

    public static void main(String[] args) {

        /* Read from the file or end program if the file can't be found */

        try {
            TextIO.readFile("sales.dat");
        } catch (IllegalArgumentException e) {
            System.out.print("Can't open file \"sales.dat\" for reading.");
            System.out.print(" Please make sure the file is present before running the program.");
            System.exit(1);
        }

        /* Keep track of the two main quantities: total amount of sales and
           the number of cities for which data is missing. */

        double totalSales = 0;
        int numberOfCitiesMissing = 0;

        while( !TextIO.eof() ) {
            char character;
            String numberString;
            double sale;

            do {
                character = TextIO.getChar();
            } while ( character != ':' );

            numberString = TextIO.getln();

            try {
                sale = Double.parseDouble(numberString);
                totalSales = totalSales + sale;
            } catch (NumberFormatException e) {
                numberOfCitiesMissing++;
            }
        }

        System.out.printf("The total sales recorded was: $%1.2f \n", totalSales);

        if (numberOfCitiesMissing == 0)
            System.out.println("Data was received from all cities.");
        else if(numberOfCitiesMissing == 1)
            System.out.println("Data was missing from 1 city.");
        else
            System.out.printf("Data was missing from %d cities \n\n", numberOfCitiesMissing);

    }
}
