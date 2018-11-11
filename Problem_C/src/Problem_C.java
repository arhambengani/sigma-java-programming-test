import java.util.Scanner;

/**
 * Created by arhambengani on 2018-03-21.
 */
public class Problem_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float T = sc.nextFloat();
        int numberOfVegetables = sc.nextInt();
        Vegetable[] vegetable = new Vegetable[numberOfVegetables];
        int read_weight = 0;

        for (int i = 0; i < numberOfVegetables; i++) {
            read_weight = sc.nextInt();
            vegetable[i] = new Vegetable(read_weight, read_weight, 0);
        }

        Solution solution = new SolutionImpl();
        int maxWeightIndex = solution.maxWeight(vegetable);
        int minWeightIndex = solution.minWeight(vegetable);
        float maxWeight = vegetable[maxWeightIndex].getWeight_after_cut();
        float minWeight = vegetable[minWeightIndex].getWeight_after_cut();
        float ratio = minWeight/maxWeight;
        while (ratio < T) {
            if (ratio < T) {
                solution.makeCut(vegetable[maxWeightIndex]);
                maxWeightIndex = solution.maxWeight(vegetable);
                minWeightIndex = solution.minWeight(vegetable);
                maxWeight = vegetable[maxWeightIndex].getWeight_after_cut();
                minWeight = vegetable[minWeightIndex].getWeight_after_cut();
                ratio = minWeight/maxWeight;
            }
        }

        int numberOfCuts = solution.sumOfCuts(vegetable);
        System.out.println(numberOfCuts);
    }
}
