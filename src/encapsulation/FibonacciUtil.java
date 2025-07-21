package encapsulation;

public class FibonacciUtil {
    public int[] generateFibonacci(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                array[i] = 0;
            } else if (i == 1) {
                array[i] = 1;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array;
    }

    public void printEvenFibonacci(int n) {
        int[] array = generateFibonacci(n);
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }

    public boolean isInFibonacci(int num) {
        int a = 0, b = 1;
        while (a <= num) {
            if (a == num) return true;
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }
}
