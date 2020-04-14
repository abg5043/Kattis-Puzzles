import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Math.max;
import java.util.Arrays;

/** This class determines who won the "Dinner for Five" contest based on the sum of each contestant's 4 scores.
 */

public class Pet {

    /** The following method determines who won the contest.

     @input the scores are inputted through standard input. Each line represents a contestant in the order in which
     the grades are given, and each line contains a contestant's 4 scores.

     @output the number of the winning contestant {@code maxPosition} and their score sum {@code maxScore}.
     */

    public static void main(String[] args) {
        var in = new Scanner(System.in);

        //read in the five sets of scores from standard input and assign sums to array
        int[] scoreSums = new int[] {findSum(in.nextLine()), findSum(in.nextLine()), findSum(in.nextLine()), findSum(in.nextLine()), findSum(in.nextLine())};

        //find max of the five
        int maxScore = Arrays.stream(scoreSums).max().getAsInt();

        //find the index of that array
        int maxPosition = 0;
        for (int i = 0; i< scoreSums.length; i++) {
            if (maxScore == scoreSums[i]) {
                maxPosition = i + 1;
            }
        }

        //return max score
        System.out.println(maxPosition + " " + maxScore);

    }

    /** The following method determines the sum of each contestant's scores given a string {@code str} of integers
     separated by spaces.

     @param str is a string of 4 scores separated by spaces.

     @return sum is the sum of the 4 scores.
     */

    public static int findSum(String str) {
        //Split each data string into an array
        String[] scoreArr = str.split(" ");

        //iterate over the array and sum
        int sum = 0;
        for (String score : scoreArr) {
            sum += parseInt(score);
        }
        //return sum
        return sum;
    }
}
