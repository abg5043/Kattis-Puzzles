import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class TimeLoop {

    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var count = parseInt(in.nextLine());
        for(int i = 1; i< +count; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}
