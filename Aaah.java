import java.util.Scanner;


public class Aaah {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        String jonAhh = in.nextLine();
        String doctorAhh = in.nextLine();
        if (jonAhh.length() >= doctorAhh.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
