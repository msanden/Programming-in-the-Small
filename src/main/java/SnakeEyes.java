
/**
 * -----------------------------------------------------------
 * This program simulates rolling a pair of dice until they
 * come up snake eyes.  It reports how many rolls were needed.
 *
 * -----------------------------------------------------------
 * Discussion - Pseudocode
 *
 * Let countRolls = 0
 * do:
 *     roll the dice
 *     count this roll by adding 1 to countRolls
 * while the roll is not snake eyes
 * Output the value of countRolls
 *
 * -----------------------------------------------------------
 */


public class SnakeEyes {

    public static void main(String[] args) {

        int die1, die2, countRolls;

        countRolls = 0;
        do {
            die1 = (int)(Math.random()*6) + 1;
            die2 = (int)(Math.random()*6) + 1;
            countRolls++;
        } while ( !(die1 == 1 && die2 == 1) );

        System.out.println("We rolled the die " + countRolls + " times to get snake eyes.");

    }

}
