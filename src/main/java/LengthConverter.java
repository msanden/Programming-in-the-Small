
/**
 * This program will convert measurements expressed in inches,
 * feet, yards, or miles into each of the possible units of
 * measure.  The measurement is input by the user, followed by
 * the unit of measure.  For example:  "17 feet", "1 inch", or
 * "2.73 mi".  Abbreviations in, ft, yd, and mi are accepted.
 * The program will continue to read and convert measurements
 * until the user enters an input of 0.
 */


import textio.TextIO;

public class LengthConverter {

    public static void main(String[] args) {

        System.out.println("Length Conversion Assistant.");

        double inches, feet, yards, miles;

        while (true) {
            System.out.print("Enter the value of your measurement, or 0 to exit: ");
            double measurementValue = TextIO.getDouble();

            if (measurementValue == 0) {
                System.out.println("Bye for now.");
                System.exit(0);
            }

            System.out.print("Your units of measure:");
            String unitsOfMeasure = TextIO.getWord();
            unitsOfMeasure = unitsOfMeasure.toLowerCase();

            if (unitsOfMeasure.equals("inch") || unitsOfMeasure.equals("inches") || unitsOfMeasure.equals("in")) {
                inches = measurementValue;
            } else if (unitsOfMeasure.equals("foot") || unitsOfMeasure.equals("feet") || unitsOfMeasure.equals("ft")) {
                inches = measurementValue * 12;
            } else if (unitsOfMeasure.equals("yard") || unitsOfMeasure.equals("yards") || unitsOfMeasure.equals("yd")) {
                inches = measurementValue * 36;
            } else if (unitsOfMeasure.equals("mile") || unitsOfMeasure.equals("miles") || unitsOfMeasure.equals("mi")) {
                inches = measurementValue * 12 * 5280;
            } else {
                System.out.println("Something went wrong. Check that you entered the units correctly");
                continue;
            }

            feet = inches / 12;
            yards = inches / 36;
            miles = inches / (12 * 5280);

            System.out.printf("%14.5g inches %n", inches);
            System.out.printf("%14.5g feet %n", feet);
            System.out.printf("%14.5g yards %n", yards);
            System.out.printf("%14.5g miles %n", miles);
        }

    }
}



