import java.util.Scanner;

/**
 * Created by arhambengani on 2018-03-21.
 */
public class Problem_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double input_number = 0.0;
        double[] data = new double[5];
        int i = 0;

        Solution solution = new SolutionImpl();

        /* Input the numbers and get the result */
        while (sc.hasNext()) {
            input_number = sc.nextDouble();
            if (input_number == 0) {
                solution.printResult(data);
                break;
            }else if (i < 5) {
                data[i] = input_number;
                i++;
            }else if (i == 5) {
                solution.printResult(data);
                i = 0;
                data[i] = input_number;
                i++;
            }
        }
    }
}
