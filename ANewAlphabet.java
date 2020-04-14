import java.util.Scanner;

public class ANewAlphabet {

    public static void main(String[] args) {
        //read in string
        var in = new Scanner(System.in);
        String str = in.nextLine();

        //convert everything in string to lower case
        String LowerCaseStr = str.toLowerCase();

        //split to make array of characters
        String[] characters = LowerCaseStr.split("");

        //convert characters
        for (int i = 0; i<characters.length; i++) {
            characters[i] = convertChar(characters[i]);
        }
        //return joined array
        String fixedStr = "";

        for (String convertedStr : characters) {
            fixedStr += convertedStr;
        }
        System.out.println(fixedStr);
    }

    public static String convertChar(String str) {
        switch (str) {
            case "a":
                return "@";
            case "b":
                return "8";
            case "c":
                return "(";
            case "d":
                return "|)";
            case "e":
                return "3";
            case "f":
                return "#";
            case "g":
                return "6";
            case "h":
                return "[-]";
            case "i":
                return "|";
            case "j":
                return "_|";
            case "k":
                return "|<";
            case "l":
                return "1";
            case "m":
                return "[]\\/[]";
            case "n":
                return "[]\\[]";
            case "o":
                return "0";
            case "p":
                return "|D";
            case "q":
                return "(,)";
            case "r":
                return "|Z";
            case "s":
                return "$";
            case "t":
                return "\'][\'";
            case "u":
                return "|_|";
            case "v":
                return "\\/";
            case "w":
                return "\\/\\/";
            case "x":
                return "}{";
            case "y":
                return "`/";
            case "z":
                return "2";
            default:
                return str;
        }
    }
}
