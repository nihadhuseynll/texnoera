package collections;

import java.util.List;

import static collections.FindElement.findIndexOfElement;

public class ArrayListMain {


    public static void timeCalculate(String input, List<Integer> integerList) {

        Long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            integerList.addFirst(i);
        }

        Long endTime = System.currentTimeMillis();

        System.out.println(input + " " + (endTime - startTime));
    }


    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<String> colors = List.of("Red", "Green", "Blue", "Orange", "White");
        System.out.println("Original list elements:");
        System.out.println("Nums: " + numbers);
        System.out.println("Colors: " + colors);

        int index1 = findIndexOfElement(numbers, 3);
        System.out.println("\nIndex of 3 in numbers: " + index1); // Output: 2

        int index2 = findIndexOfElement(numbers, 6);
        System.out.println("Index of 6 in numbers: " + index2); // Output: -1

        int index3 = findIndexOfElement(colors, "Green");
        System.out.println("Index of \"Green\" in colors: " + index3); // Output: 1

        int index4 = findIndexOfElement(colors, "Black");
        System.out.println("Index of \"Black\" in colors: " + index4); // Output: -1

        ActivitySuggester.suggestActivity("Monday");     // Monday activity: Study Java
        ActivitySuggester.suggestActivity("saturday");   // Saturday activity: Go hiking
        ActivitySuggester.suggestActivity("WEDNESDAY");  // Wednesday activity: Read a book
        ActivitySuggester.suggestActivity("Funday");     // Unknown day
    }
}

