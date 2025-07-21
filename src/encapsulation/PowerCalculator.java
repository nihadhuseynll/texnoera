package encapsulation;

import java.util.Arrays;

public class PowerCalculator {

    public int calculatePower(int base, int exponent) {
        int result = 1;
        if (exponent < 0) {
            System.out.println("Exponent can't be negative.");
            return -1;
        }

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    public void displayPositiveResults(int[] bases, int[] exponents) {
        String array = "";
        int result = 1;
        for (int i = 0; i < bases.length; i++) {
            for (int j = 0; j < exponents[i]; j++) {
                if (exponents[i] > 0) {
                    result *= bases[i];
                }
            }
            if (exponents[i] > 0) {
                array = array + result + ",";
                result = 1;
            }
        }
        String[] arr = array.split(",");
        System.out.println(Arrays.toString(arr));
    }
}
