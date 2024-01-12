import java.util.Arrays;
public class Yahtzee
{
    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;
    Die6[] dice;
    /**
     * Constructor for objects of class Dice
     */
    public Yahtzee()
    {
        // initialise instance variables
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();

        dice = new Die6[] {die1, die2, die3, die4, die5}; //array of dice (5)
    }

    public void roll() { 
        for (Die6 die : dice) { //rolls all dice
            die.roll();
        }
    }

}