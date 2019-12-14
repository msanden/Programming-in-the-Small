/*
This program simulates rolling a pair of dice.
The number showing on each die is output as well as the total of the two dice rolls.
For example:
    The first die comes up 3
    The second die comes up 5
    Your total roll is 8
 */

public class RollTheDie {

    public static void main(String[] args){

        int roll1 = (int)(Math.random()*6) + 1;
        int roll2 = (int)(Math.random()*6) + 1;

        System.out.println("The first die comes up " + roll1);
        System.out.println("The first die comes up " + roll2);

        int totalRoll = roll1 + roll2;

        System.out.println("Your total roll is " + totalRoll);
    }

}
