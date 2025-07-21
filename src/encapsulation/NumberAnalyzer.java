package encapsulation;

public class NumberAnalyzer {
    public int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int findMin(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    void printMaxAndMinIfUnique(int[] numbers) {
        int max = findMax(numbers);
        int min = findMin(numbers);
        int counter = 0;
        for (int number : numbers) {
            if (max == number || min == number) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("Max value: " + max + " " + "Min value: " + min);
        } else {
            System.out.println("Max or min value aren't unique.");
        }
    }
}
