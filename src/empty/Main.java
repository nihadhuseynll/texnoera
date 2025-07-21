package empty;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int targetSum = 5;

        System.out.println("Elements with sum = " + targetSum + ":");

        for (Integer number : numbers) {
            if (number == targetSum) {
                System.out.println("[" + number + "]");
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == targetSum) {
                    System.out.println("[" + numbers.get(i) + ", " + numbers.get(j) + "]");
                }
            }
        }

    }
}
