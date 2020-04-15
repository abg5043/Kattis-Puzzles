import static java.lang.Long.parseLong;
import java.util.Scanner;


/** This class determines the absolute value of the difference between two numbers
 *
 */


public class A_Different_Problem {

	/** The following method calculates the absolute value of the difference between two numbers
	 * given an unknown number of number pairs inputted through standard input and formatted with
	 * a space between the two numbers.
	 *
	 * Return: This method prints the absolute value of the difference between each number pair.
	 */

    public static void main(String[] args) {
		var in = new Scanner(System.in);
		while (in.hasNextLine()) {
			var currentLine = in.nextLine();
			if (currentLine.equals("")) {
				System.exit(0);
			}
			var numArr = currentLine.split(" ");
			System.out.println(Math.abs(parseLong(numArr[0]) - parseLong(numArr[1])));
		}
	}

}
