import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class SumKindOfProblem {

    public static void main(String[] args) {
        var in = new Scanner(System.in);
    //determine number of data sets
        int numDataSets = parseInt(in.nextLine());
    //Create arr to hold data from data sets
        int[] data = new int[numDataSets];
	//iterate through the different lines of input using the first line to guide to create arr of all data
        for (int i = 0; i < numDataSets; i++) {
            var currentData = in.nextLine();
            var currentDataArr = currentData.split(" ");
            data[i] = parseInt(currentDataArr[1]);
        }
        //iterate through data arr print out the output using helper methods

        for (int i = 0; i < data.length; i++) {
            System.out.println((i+1) + " " + sumAll(data[i]) + " " + sumOdds(data[i]) + " " + sumEvens(data[i]));
        }
    }

    public static int sumAll(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumOdds(int num) {
        int sum = 0;
        int count = 1;
        int i = 1;
        while (count <= num) {
            if (i % 2 == 1) {
                sum += i;
                count++;
                i++;
            } else {
                i++;
            }
        }
        return sum;
    }

    public static int sumEvens(int num) {
        int sum = 0;
        int count = 1;
        int i = 1;
        while (count <= num) {
            if (i % 2 == 0) {
                sum += i;
                count++;
                i++;
            } else {
                i++;
            }
        }
        return sum;
    }
}