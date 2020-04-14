import java.math.BigDecimal;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Above_Average {

    public static void main(String[] args) {
	var in = new Scanner(System.in);
	int testCases = parseInt(in.nextLine());
	String[] finalOutput = new String[testCases];

	//process each test case
        for (int i = 0; i < testCases; i++) {
            String testString = in.nextLine();
            String[] entireLine = testString.split(" ");
            double sum = 0;
            double numTests = parseDouble(entireLine[0]);
            for (int j = 1; j < entireLine.length; j++) {
                sum += parseDouble(entireLine[j]);
            }
            double average = rounder(sum/numTests);
            double overAchievers = 0;
            for (int j= 1; j < entireLine.length; j++) {
                if (parseDouble(entireLine[j]) > average) {
                    overAchievers += 1;
                }
            }
            double avgOverAchievers = rounder(overAchievers/numTests * 100);

            finalOutput[i] = String.format("%.3f", avgOverAchievers) + "%";
        }

        for (String avg : finalOutput) {
            System.out.println(avg);
        }

    }
    public static double rounder(double num) {
        BigDecimal bigDecimal = new BigDecimal(num);
        bigDecimal = bigDecimal.setScale(3, BigDecimal.ROUND_HALF_UP);
        return bigDecimal.doubleValue();
    }


}
