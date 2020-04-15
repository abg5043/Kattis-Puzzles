import java.util.Scanner;
import static java.lang.Integer.parseInt;
import java.util.Arrays;
import java.util.Collections;

/** This class determines when the best time to plant trees are if John wants to have a party!
 *
 */


public class Planting_Trees {


    /** The following method calculates the shortest amount of time to the party given N number of trees (first input)
     * and each number of days it takes for a tree to grow to full strength (plus, add a day becasue John wants the trees
     * to be in full bloom by the party).
     *
     * Return: The shortest amount of days until the party.
     */


    public static void main(String[] args) {
	    var in = new Scanner(System.in);
	    int numTrees = parseInt(in.nextLine());
		int daysToParty = 0;

	    //Create int array of trees
	    var trees = in.nextLine();
	    String[] treeArr = trees.split(" ");
	    Integer[] fixedTrees = new Integer[treeArr.length];
	    for (int i = 0; i<treeArr.length; i++) {
	    	fixedTrees[i] = parseInt(treeArr[i]);
		}

		//Sort array in descending order since it makes sense to always plant the slowest growing trees first.
		Arrays.sort(fixedTrees, Collections.reverseOrder());

	    //Find the shortest days until party
		for (int i = 0; i < numTrees; i++) {
			daysToParty = Math.max(daysToParty, fixedTrees[i] + 1 + i +1);
        }
	    System.out.println(daysToParty);
    }
}
