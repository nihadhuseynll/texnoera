package encapsulation;

import java.util.Arrays;

public class ArmstrongUtil {

    public boolean isArmstrong(int number) {

        int originalNumber = number;
        int count = String.valueOf(number).length();

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, count);
            number /= 10;
        }
        return sum == originalNumber;
    }

    public int[] getArmstrongNumbersInRange(int min, int max) {
        int[] numbers = new int[max];
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (isArmstrong(i)) {
                count++;
                numbers[count - 1] = i;
            }
        }
        return Arrays.copyOf(numbers, count);
    }

    public void printNonArmstrongFromArray(int[] array){
        System.out.print("Armstrong numbers in the array: ");
        for (int number : array) {
            if (!isArmstrong(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
