import java.util.Scanner;

/**
 * Created by A777971 on 10/26/15.
 */
public class LotteryDriver {

    public static void main(String[] args) {
        // Init lottery class. Creates lottery numbers.
        Lottery lottery = new Lottery();
        int[] lotteryNumbers = lottery.getLotteryNumbers();
        int[] lotteryPicks = new int[5];
        int counter = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Pick your winning five numbers to win the lottery! ");
        System.out.println("Picks must be numbers between 0 and 9.");

        for (int i = 0; i < lotteryNumbers.length; i++) {
            System.out.println("Enter pick #" + (i + 1) + ": ");
            lotteryPicks[i] = keyboard.nextInt();
        }

        counter = lottery.checkNumbers(lotteryPicks);

        if (counter == 5) {
            System.out.println("You're the grand prize winner!");
        } else {
            System.out.println("Sorry, you're not a winner today. You correctly matched " + counter + " lottery numbers.");
            System.out.println("The lottery numbers were: ");
            for (int i = 0; i < lotteryNumbers.length; i++) {
                System.out.print(lotteryNumbers[i] + " ");
            }
        }

    }


}
