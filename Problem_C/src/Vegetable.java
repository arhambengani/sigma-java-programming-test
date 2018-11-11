/**
 * Created by arhambengani on 2018-03-21.
 */

public class Vegetable {

    private float weight = 0;
    private float weight_after_cut = 0;
    private int number_of_cuts = 0;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight_after_cut() {
        return weight_after_cut;
    }

    public void setWeight_after_cut(float weight_after_cut) {
        this.weight_after_cut = weight_after_cut;
    }

    public int getNumber_of_cuts() {
        return number_of_cuts;
    }

    public void setNumber_of_cuts(int number_of_cuts) {
        this.number_of_cuts = number_of_cuts;
    }

    public Vegetable(float weight, float weight_after_cut, int number_of_cuts) {
        this.weight = weight;
        this.weight_after_cut = weight_after_cut;
        this.number_of_cuts = number_of_cuts;
    }
}
