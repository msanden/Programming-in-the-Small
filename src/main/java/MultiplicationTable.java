
/*
This program prints out a 12 by 12 multiplication table.
 */

public class MultiplicationTable {

    public static void main(String[] args) {

        int rowIndex;
        int N;

        for(rowIndex=1; rowIndex<=12; rowIndex++) {
            for(N=1; N<=12; N++)
                System.out.printf("%4d", N*rowIndex);
            System.out.println();
        }

    }

}
