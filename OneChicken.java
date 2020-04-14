import java.util.Scanner;

public class OneChicken {

    public static void main(String[] args) {
		var in = new Scanner(System.in);
		int need = in.nextInt();
		int cooked = in.nextInt();

		if (need < cooked) {
			int extra = cooked -need;
			if (extra == 1) {
				System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
			} else {
				System.out.println("Dr. Chaz will have " + extra + " pieces of chicken left over!");
			}
		} else if (need > cooked) {
			int needed = need - cooked;
			if (needed == 1) {
				System.out.println("Dr. Chaz needs 1 more piece of chicken!");
			} else {
				System.out.println("Dr. Chaz needs " + needed + " more pieces of chicken!");
			}
		}
	}
}
