/**
 * Created by arhambengani on 2018-03-21.
 */
public class SolutionImpl implements Solution {
    /* Function to compare two strings */
    @Override
    public String compareString(String a, String b) {
        int length_string = a.length();
        String result = "";
        for (int i = 0; i < length_string; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                result += ".";
            }else {
                result += "*";
            }
        }
        return result;
    }
}
