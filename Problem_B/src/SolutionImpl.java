import java.text.DecimalFormat;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

/**
 * Created by arhambengani on 2018-03-21.
 */
public class SolutionImpl implements Solution {
    @Override
    public double getDistance(double[] data) {
        /* Get each value in a variable */
        double x1 = data[0];
        double y1 = data[1];
        double x2 = data[2];
        double y2 = data[3];
        double p = data[4];

        double pow_absolute1 = pow((abs(x1 - x2)),p);
        double pow_absolute2 = pow((abs(y1 - y2)),p);

        double distance = pow((pow_absolute1 + pow_absolute2),1/p);

        return distance;
    }

    @Override
    public void printResult(double[] data) {
        /* Get the result and print the result */
        double result = 0.0;
        DecimalFormat numberFormat = new DecimalFormat("#.0000000000");

        result = getDistance(data);
        System.out.println(numberFormat.format(result));
    }
}
