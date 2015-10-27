import java.util.Arrays;
import java.util.Random;

public class Lottery
{

    private int[] lotteryNumbers;

    /**
     * Constructor.
     */
    public Lottery() {
        // Create 5 random numbers
        lotteryNumbers = new int[5];
        Random rand = new Random();
        for (int i = 0; i < lotteryNumbers.length; i++)
        {
            lotteryNumbers[i] = rand.nextInt(10);
        }
    }

    public int checkNumbers(int[] lotteryPicks) {
        int numCorrect = 0;
        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (lotteryNumbers[i] == lotteryPicks[i]) {
                numCorrect += 1;
            }
        }

        return numCorrect;
    }

    public int[] getLotteryNumbers() {
        return Arrays.copyOf(lotteryNumbers, lotteryNumbers.length);
    }
}
