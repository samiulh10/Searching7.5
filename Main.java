import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Algorithms a = new Algorithms();

        ArrayList<Integer> testCaseOne = new ArrayList<Integer>(Arrays.asList(-1, 0, 1));
        ArrayList<Integer> testCaseTwo = new ArrayList<Integer>(Arrays.asList(-1, -1, -1));
        ArrayList<Integer> testCaseThree = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

        ArrayList<String> testCaseFour = new ArrayList<String>(Arrays.asList("String"));
        ArrayList<String> testCaseFive = new ArrayList<String>(Arrays.asList("Holmer", "SAKIB"));
        ArrayList<String> testCaseSix = new ArrayList<String>(Arrays.asList("bktech"));

        ArrayList<Integer> testCaseSeven = new ArrayList<Integer>(Arrays.asList(1, 2));
        ArrayList<Integer> testCaseEight = new ArrayList<Integer>(Arrays.asList(2, 3));

        ArrayList<Integer> testCaseNine = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

        System.out.println("Negative Values");

        System.out.println(a.negValues(testCaseOne));
        System.out.println(a.negValues(testCaseTwo));
        System.out.println(a.negValues(testCaseThree));

        System.out.println("String found");

        System.out.println(a.stringFound(testCaseFour, "string"));
        System.out.println(a.stringFound(testCaseFive, "sam"));
        System.out.println(a.stringFound(testCaseSix, "bktech"));

        System.out.println("Same value in both lists");

        System.out.println(a.valueFound(testCaseSeven, testCaseEight));
        System.out.println(a.valueFound(testCaseOne, testCaseTwo));
        System.out.println(a.valueFound(testCaseOne, testCaseThree));

        System.out.println("First appearance of int");

        System.out.println(a.intAppearance(testCaseNine, 2));
        System.out.println(a.intAppearance(testCaseOne, 5));
        System.out.println(a.intAppearance(testCaseTwo, -1));

        System.out.println("int found");

        System.out.println(a.intFound(new int[] {1, 2, 3}, 2));
        System.out.println(a.intFound(new int[] {1 , 2, 3,4}, 4));
        System.out.println(a.intFound(new int[] {5, 6}, 5));






    }
}
