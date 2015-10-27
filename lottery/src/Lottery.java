import java.util.Random;
import java.util.Scanner;


public class Lottery
{


    public static void main(String[] args)
    {
        int[] lotteryNumbers = new int[5]; // Creates an array with 5 elements.
        int[] lotteryPicks = new int[5];   // Creates an array with 5 elements
        // for lottery picks.
        int counter = 0;
        int[] values;

        values = getArray();
        for (int num : values)
            System.out.print(num + " ");


        /**
         * Constructor
         */

        Random rand = new Random();
        for (int i = 0; i < lotteryNumbers.length; i++)
        {
            int numbers = rand.nextInt(10);
        }

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Pick your winning five numbers to win the lottery! ");
        System.out.println("Picks must be numbers between 0 and 9.");

        for (int i = 0; i < lotteryPicks.length; i++)
        {
            System.out.println("Enter pick #" + (i + 1) + ": ");
            lotteryPicks[i] = keyboard.nextInt();
            if (lotteryNumbers[i] == lotteryPicks[i])
            {
                counter+= 1;
            }
        }

        if (counter == 5)
            System.out.println("You're the grand prize winner!");
        else
            System.out.println("Sorry, you're not a winner today.");

        // I still need to display the number of matching digits in each array.  How?

        System.exit(0);


    }

    /**
     * getArray method
     * @return A reference to an array of integers
     */

    public static int[] getArray()
    {
        int[] array = lotteryNumbers;  // I want this method to return a copy of the
        // lotteryNumbers array.  How?

        return array;
    }
}
