import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Sort_Of_Sorting {

    public static void main(String[] args) {
        var in = new Scanner(System.in);

        //Determine how many names to read;
        int numFirstNames = parseInt(in.nextLine());
        //Put all names in firstNameArr
        String[] firstNameArr = new String[numFirstNames];
        for (int i = 0; i < numFirstNames; i++) {
            firstNameArr[i] = in.nextLine();
        }

        //Do it again for last names
        int numLastNames = parseInt(in.nextLine());
        String[] lastNameArr = new String[numLastNames];
        for (int i = 0; i < numLastNames; i++) {
            lastNameArr[i] = in.nextLine();
        }
        String end = in.nextLine();

        //Sort first names into a new arr
        String[] fixedFirstNames = sortNames(firstNameArr);
        //Sort last names into a new arr
        String[] fixedLastNames = sortNames(lastNameArr);

        for (String name : fixedFirstNames) {
            System.out.println(name);
        }
        System.out.println("");
        for (String name : fixedLastNames) {
            System.out.println(name);
        }

    }

    public static String[] sortNames(String[] arr) {
        String temp;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++) {
                if ((int)arr[i].charAt(0) - (int)arr[j].charAt(0)  > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if ((int)arr[i].charAt(0) - (int)arr[j].charAt(0) == 0 && ((int)arr[i].charAt(1) - (int)arr[j].charAt(1)) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        return arr;
    }
}
