package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PowerCalculator {

    public static double calculatePower(double base, int[] exponents) {
        double result = 1;

        for (int exp : exponents) {
            result = Math.pow(base, exp);
            base = result;
        }

        Collection<String> s = new ArrayList<String>();

        return result;
    }
}