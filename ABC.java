import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ABC {



    public static void main(String[] args) {
        //define low, med, and high ints
        int low = 0;
        int med = 0;
        int high = 0;

        var in = new Scanner(System.in);
        //read in  three ints
        String nums = in.nextLine();
        String[] numArr = nums.split(" ");
        int a = parseInt(numArr[0]);
        int b = parseInt(numArr[1]);
        int c = parseInt(numArr[2]);

        //read in 3 letters
        String letters = in.nextLine();

        //determine order of ints and assign variables

        if (a < b && a < c) {
            low = a;
            if (b < c) {
                med = b;
                high = c;
            } else {
                med = c;
                high = b;
            }
        }
        if (b < c && b < a) {
            low = b;
            if (a < c) {
                med = a;
                high = c;
            } else {
                med = c;
                high = a;
            }
        }
        if (c < b && c < a) {
            low = c;
            if (b < a) {
                med = b;
                high = a;
            } else {
                med = a;
                high = b;
            }
        }

        //convert letters to numbers
        String fixedOrder = "";
        for (int i = 0; i<letters.length(); i++) {
            switch (letters.charAt(i)) {
                case 'A':
                    fixedOrder += low + " ";
                    break;
                case 'B':
                    fixedOrder += med + " ";
                    break;
                case 'C':
                    fixedOrder += high + " ";
                    break;
            }
        }
        System.out.println(fixedOrder.substring(0, fixedOrder.length()-1));
    }

}
