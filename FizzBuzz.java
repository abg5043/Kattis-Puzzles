import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class FizzBuzz {

    public static void main(String[] args) {
    //scan in numbers as array
        var in = new Scanner(System.in);
        var nums = in.nextLine();
        String[] numArr = nums.split(" ");

	//iterate through nums 1 through args[2]
        for (int i = 1; i <= parseInt(numArr[2]); i++) {
    //check if each num is divisible by args[0] or args[1] and replace with the specified word
            if (isDivisible(i, parseInt(numArr[0])) && isDivisible(i, parseInt(numArr[1]))) {
                System.out.println("FizzBuzz");
            } else if (isDivisible(i, parseInt(numArr[1]))) {
                System.out.println("Buzz");
            } else if (isDivisible(i, parseInt(numArr[0]))) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }

    public static Boolean isDivisible(int num, int factor) {
        return num % factor == 0;
    }
}
