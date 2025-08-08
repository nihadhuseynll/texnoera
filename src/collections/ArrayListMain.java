package collections;

import java.util.*;

import static collections.FindElement.findIndexOfElement;
import static collections.PowerCalculator.calculatePower;

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

//        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//        List<String> colors = List.of("Red", "Green", "Blue", "Orange", "White");
//        System.out.println("Original list elements:");
//        System.out.println("Nums: " + numbers);
//        System.out.println("Colors: " + colors);
//
//        int index1 = findIndexOfElement(numbers, 3);
//        System.out.println("\nIndex of 3 in numbers: " + index1); // Output: 2
//
//        int index2 = findIndexOfElement(numbers, 6);
//        System.out.println("Index of 6 in numbers: " + index2); // Output: -1
//
//        int index3 = findIndexOfElement(colors, "Green");
//        System.out.println("Index of \"Green\" in colors: " + index3); // Output: 1
//
//        int index4 = findIndexOfElement(colors, "Black");
//        System.out.println("Index of \"Black\" in colors: " + index4); // Output: -1
//
//        System.out.println(DayActivity.getNextDay("Monday"));   // Unknown day
//
//        double base = 2;
//        int[] exponents = {3, 2, 4}; // 2^3 = 8, 8^2 = 64, 64^4 = 16777216
//
//        double finalResult = calculatePower(base, exponents);
//
//        System.out.println("Final result: " + finalResult);
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(8);
//        arrayList.add(4);
//        arrayList.iterator();
//        System.out.println(arrayList.iterator().next());
//        System.out.println(arrayList );


        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("nestjs");
        set.add("javascript");
        set.add("tegdfshi");
        set.add("python");

        System.out.println("Hashset"+set);
        System.out.println("******************************");

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("java");
        set2.add("nestjs");
        set2.add("javascript");
        set2.add("tegdfshi");

        System.out.println("LinkedHashSet"+set2);

        System.out.println("***********************");

        Set<String> set3 = new TreeSet<>();
        set3.add("java");
        set3.add("nestjs");
        set3.add("javascript");
        set3.add("tegdfshi");

        System.out.println("TreeSet"+set3);

//        HashSet<String> h_set = new HashSet<String>();
//        // use add() method to add values in the hash set
//        h_set.add("Red");
//        h_set.add("Green");
//        h_set.add("Black");
//        h_set.add("White");
//        h_set.add("Pink");
//        h_set.add("Yellow");
//
//        // print the hash set
//        System.out.println("The Hash Set: " + h_set);

        HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original Hash Set: " + h_set);
        HashSet <String> new_h_set = new HashSet <String> ();
        new_h_set = (HashSet) h_set.clone();
        System.out.println("Cloned Hash Set: " + new_h_set);


//        Scanner scanner = new Scanner(System.in);
//        TreeSet<String> wordSet = new TreeSet<>();
//        String input;
//
//        System.out.println("Söz əlavə etmək üçün yazın. Çıxmaq üçün 'exit' yazın.");
//
//        while (true) {
//            System.out.print("Söz: ");
//            input = scanner.nextLine().trim();
//
//            if (input.equalsIgnoreCase("exit")) {
//                break;
//            }
//
//            if (wordSet.contains(input)) {
//                System.out.println("Bu söz artıq mövcuddur.");
//            } else {
//                wordSet.add(input);
//                System.out.println("Söz əlavə olundu.");
//            }
//        }
//
//        System.out.println("Sözlər (a-z):");
//        for (String word : wordSet) {
//            System.out.println(word);
//        }
//
//        System.out.println("Sözlər (z-a):");
//        Iterator<String> descIterator = wordSet.descendingIterator();
//        while (descIterator.hasNext()) {
//            System.out.println(descIterator.next());
//        }
//
//        System.out.print("Hansı hərflə başlayan sözləri görmək istəyirsiz? ");
//        String filter = scanner.nextLine().trim();
//
//        System.out.println("Filtr nəticəsi: " + filter.toUpperCase() + " ilə başlayan sözlər:");
//        for (String word : wordSet) {
//            if (word.toUpperCase().startsWith(filter.toUpperCase())) {
//                System.out.println(word);
//            }
//        }

        String text = "apple banana orange apple banana kiwi";

        String[] words = text.split(" ");

        List<String> wordList = new ArrayList<>(Arrays.asList(words));

        String result = null;

        for (int i = 0; i < wordList.size(); i++) {
            String current = wordList.get(i);
            boolean isRepeated = false;

            for (int j = 0; j < wordList.size(); j++) {
                if (i != j && current.equals(wordList.get(j))) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                result = current;
                break;
            }
        }

        if (result != null) {
            System.out.println("First non-repeated word: " + result);
        } else {
            System.out.println("No unique word found.");
        }
    }
}

