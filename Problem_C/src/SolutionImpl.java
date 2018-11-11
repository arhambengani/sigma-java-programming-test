/**
 * Created by arhambengani on 2018-03-21.
 */
public class SolutionImpl implements Solution {
    @Override
    public void makeCut(Vegetable vegetable) {
        int prevNumCuts = vegetable.getNumber_of_cuts();
        vegetable.setNumber_of_cuts(prevNumCuts + 1);
        float weight = vegetable.getWeight();
        float weightAfterCut = weight/ (prevNumCuts + 2);
        vegetable.setWeight_after_cut(weightAfterCut);
    }

    @Override
    public int maxWeight(Vegetable[] vegetable) {
        int maxWeightIndex = 0;
        float maxWeight = 0;
        for (int i = 0; i < vegetable.length; i++) {
            float weight = vegetable[i].getWeight_after_cut();
            if (maxWeight < weight) {
                maxWeight = weight;
                maxWeightIndex = i;
            }
        }
        return maxWeightIndex;
    }

    @Override
    public int minWeight(Vegetable[] vegetable) {
        int minWeightIndex = 0;
        /* 10000000 beacuse the max weight is 10^6 */
        float minWeight = 10000000;
        for (int i = 0; i < vegetable.length; i++) {
            float weight = vegetable[i].getWeight_after_cut();
            if (minWeight > weight) {
                minWeight = weight;
                minWeightIndex = i;
            }
        }
        return minWeightIndex;
    }

    @Override
    public int sumOfCuts(Vegetable[] vegetable) {
        int sum = 0;
        for (int i = 0; i < vegetable.length; i++) {
            sum += vegetable[i].getNumber_of_cuts();
        }
        return sum;
    }
}
