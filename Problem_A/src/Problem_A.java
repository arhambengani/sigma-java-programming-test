import java.util.Scanner;

/**
 * Created by arhambengani on 2018-03-21.
 */
public class Problem_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* First input is the number of pairs of input strings */
        int number = sc.nextInt();

        /* Based on number we declare a new array to store the strings and get result */
        int arrayLength = number * 2;
        String[] inputString = new String[arrayLength];
        String[] result = new String[number];

        /* Now we read the strings and store them in the array */
        for (int i= 0; i < arrayLength; i++) inputString[i] = sc.next();

        /* Perform the comparison and get the result */
        Solution solution = new SolutionImpl();
        int index_1 = 0, index_2 = 0;
        for (int i = 0; i < number; i++) {
            index_1 = i * 2;
            index_2 = index_1 + 1;
            result[i] = solution.compareString(inputString[index_1], inputString[index_2]);
            System.out.println(inputString[index_1]);
            System.out.println(inputString[index_2]);
            System.out.println(result[i]);
            System.out.println("\n");
        }
    }
}
