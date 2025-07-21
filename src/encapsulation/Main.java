package encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static encapsulation.WordCounter.countSpecificWord;

public class Main {
    public static void main(String[] args) {
        // TODO 8. Ədədlərin bölünməsini yoxlama
//        Scanner scanner = new Scanner(System.in);
//
//        int[] array = new int[10];
//        int counter = 0;
//
//        for(int i = 0; i < array.length; i++){
//            array[i] = scanner.nextInt();
//            if(array[i] % 3 == 0 && array[i] % 5 == 0){
//                counter++;
//            }
//        }
//        System.out.println(counter);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                1, 2
        ));
        List<Integer> list1 = list.reversed();
        System.out.println(list1);

        // TODO 9. Ən uzun ardıcıl artan alt-silsilə

//        int[] array = {1, 2, 2, 3, 4, 1};
//        int counter = 1;
//        int maxCounter = 1;
//        for (int i = 0; i < array.length; i++) {
//            if (i + 1 < array.length && (array[i + 1] > array[i])) {
//                counter++;
//                if(counter > maxCounter) {
//                    maxCounter = counter;
//                }
//            } else {
//                counter = 1;
//            }
//        }
//
//        System.out.println("Max count: " + maxCounter);

        // TODO 10. Məktəb qiymətləndirmə sistemi
//        int[] array = {76, 55, 65, 92, 34, 83, 102};
//
//        for (int j : array) {
//            if (j > 90 && j < 100) {
//                System.out.println("A");
//            } else if (j > 80 && j < 90) {
//                System.out.println("B");
//            } else if (j > 70 && j < 80) {
//                System.out.println("C");
//            } else if (j > 60 && j < 70) {
//                System.out.println("D");
//            } else if (j > 50 && j < 60) {
//                System.out.println("E");
//            } else {
//                System.out.println("F");
//            }
//        }

        //TODO 11. Cüt və tək elementlərin cəmini ayırmaq

//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int cemTek = 0;
//        int cemCut = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                cemCut += array[i];
//            } else {
//                cemTek += array[i];
//            }
//        }
//        System.out.println("Cut ededlerin cemi: " + cemCut);
//        System.out.println("Tek ededlerin cemi: " + cemTek);

        // TODO 12. Array-dəki ən yaxın iki elementi tapın

//        int[] array = {5, 8, 10, 11};
//        int min = array[0];
//        int minIndex1 = 0;
//        int minIndex2 = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                int abs = Math.abs(array[i] - array[j]);
//                if (i != j && abs < min) {
//                    minIndex1 = i;
//                    minIndex2 = j;
//                    min = abs;
//                }
//            }
//        }
//        System.out.println("Minimum fərq: " + min);
//        System.out.println("Minimum Index 1: " + minIndex1);
//        System.out.println("Minimum Index 2: " + minIndex2);

        // TODO 13. Maksimum və minimum elementi dəyişmək

//        int[] arr = {5, 8, 2, 9, 1, 4};
//
//        int minIndex = 0;
//        int maxIndex = 0;
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < arr[minIndex]) {
//                minIndex = i;
//            }
//            if (arr[i] > arr[maxIndex]) {
//                maxIndex = i;
//            }
//        }
//
//        int temp = arr[minIndex];
//        arr[minIndex] = arr[maxIndex];
//        arr[maxIndex] = temp;
//
//        System.out.print("Nəticə: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

        // TODO 14. Ədədlərin sinifləndirilməsi

//        int[] array = {1,2,-1,-1,-1,-4,5,0,6,0,32,1,0};
//        int countNegative = 0;
//        int sumPositive = 0;
//        String indexOfZeros = "";
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                countNegative++;
//            }
//            if(array[i] > 0){
//                sumPositive += array[i];
//            }
//            if(array[i] == 0){
//                indexOfZeros = indexOfZeros + i + " ";
//            }
//        }
//        System.out.println("Count of negative elements: " + countNegative);
//        System.out.println("Sum of positive elements: " + sumPositive);
//        System.out.println("Index of zeros elements: " + indexOfZeros);

        // TODO: Variant 1 hard tasks

        //TODO: 15. Bir metod yazın ki, 5 rəqəmli ədədlərdən ibarət bir array qəbul edir.
        // Bu metod, yalnız tərsi ilə eyni olan ədədləri tapıb onların cəmini hesablasın.
        // Əgər belə ədəd yoxdursa, "Palindrome ədəd yoxdur" çap etsin.

//        int[] array = {12321, 56465, 78987, 2734723};
//        int originalNumber = 0;
//        int reversedNumber = 0;
//        int remainder;
//        int counter = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            originalNumber = array[i];
//            while (array[i] > 0) {
//                remainder = array[i] % 10; 1,2
//                reversedNumber = reversedNumber * 10 + remainder; 1,12321
//                array[i] /= 10; 1232,123
//            }
//
//            if (originalNumber == reversedNumber) {
//                System.out.println("This is the palindrome number: " + originalNumber);
//                counter++;
//            } else {
//                if (counter == 0) {
//                    System.out.println("This is no reverse number in array.");
//                }
//            }
//
//            reversedNumber = 0;
//            remainder = 0;
//        }

        //TODO: 16. Bir Calculator sinfi yaradın.
        // Bu sinifin calculate adlı bir metodu olsun və bu metod aşağıdakıları qəbul etsin:

//        double[] numbers = {10, 5, 2};
//        System.out.println(calculate(numbers, '+'));
//        System.out.println(calculate(numbers, '*'));
//        System.out.println(calculate(numbers, '-'));
//        System.out.println(calculate(numbers, '/'));
//        System.out.println(calculate(numbers, 'x'));

        //TODO: 18. Bir PowerCalculator sinfi yaradın. Bu sinifdə iki metod olsun:

//        PowerCalculator pc = new PowerCalculator();
//        int[] bases = {2,3,4};
//        int[] exponents = {3,-2,2};
//        pc.displayPositiveResults(bases, exponents);

        //TODO: 19. Bir NumberAnalyzer sinfi yaradın. Bu sinifdə aşağıdakı metodları yazın:

//        NumberAnalyzer analyzer = new NumberAnalyzer();
//        int[] array = {5,3,9,1,9};
//        analyzer.printMaxAndMinIfUnique(array);

        //TODO: 20. Bir FibonacciUtil sinfi yaradın və aşağıdakı metodları yazın:

//        FibonacciUtil fibonacciUtil = new FibonacciUtil();
//        System.out.println(Arrays.toString(fibonacciUtil.generateFibonacci(10)));
//        fibonacciUtil.printEvenFibonacci(10);
//        System.out.println();
//        System.out.println(fibonacciUtil.isInFibonacci(10));

        // TODO: Variant 2 hard tasks

        // TODO: 15. Bir ArmstrongUtil adlı sinif yaradın və aşağıdakıları edin:

//        ArmstrongUtil armstrongUtil = new ArmstrongUtil();
//        int[] array = {1,2,3,4,125,12,67,407,153};
//        System.out.println("Number is armstrong: " + armstrongUtil.isArmstrong(153));
//        System.out.println("Armstrong numbers between min and max values: "
//                + Arrays.toString(armstrongUtil.getArmstrongNumbersInRange(1, 1000)));
//        armstrongUtil.printNonArmstrongFromArray(array);

        // TODO 16. Bir PalindromeChecker sinfi yaradın və aşağıdakı metodları əlavə edin:

//        PalindromeChecker checker = new PalindromeChecker();
//        System.out.println("Checking of str is palindrome or not: " + checker.isPalindrome("assa"));

        // TODO 17. Bir WordCounter adlı sinif yaradın və aşağıdakı metodları yazın:

        WordCounter wordCounter = new WordCounter();
        wordCounter.countWords("Salam dunya,  necesen !");
        String sentence = "Java is great, and java developers love JAVA!";
        String word = "java";

        int result = countSpecificWord(sentence, word);
        System.out.println("Sözün sayı: " + result);

        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("hello", "world"));

    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toLowerCase().toCharArray();
        char[] chars2 = str2.toLowerCase().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}
