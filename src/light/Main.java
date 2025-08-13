package light;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        // 1. Ad və yaş saxla
//        HashMap<String, Integer> people = new HashMap<>();
//        people.put("Ali", 25);
//        people.put("Veli", 30);
//        people.put("Aysel", 28);
//        System.out.println("Ad və yaş siyahısı:");
//        for (Map.Entry<String, Integer> entry : people.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
//        for(String key : people.keySet()) {
//            System.out.println(key + " - " + people.get(key));
//        }
//
//        System.out.println("\n---");
//
//        // 2. Ölkə – Paytaxt
//        HashMap<String, String> capitals = new HashMap<>();
//        capitals.put("Azerbaijan", "Baku");
//        capitals.put("Turkey", "Ankara");
//        capitals.put("USA", "Washington");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Ölkə adı daxil edin: ");
//        String country = sc.nextLine();
//        String capital = capitals.get(country);
//        if (capital != null) {
//            System.out.println(country + " ölkəsinin paytaxtı: " + capital);
//        } else {
//            System.out.println("Bu ölkə siyahıda yoxdur.");
//        }
//
//        System.out.println("\n---");
//
//        // 3. Sayğac (sözlərin sayılması)
//        String[] words = {"alma", "armud", "alma", "banan", "alma", "banan"};
//        HashMap<String, Integer> wordCount = new HashMap<>();
//        for (String w : words) {
//            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
//            wordCount.get("kasdmlkasmd");
//        }
//        System.out.println("Sözlərin sayı: " + wordCount);
//
//        System.out.println("\n---");
//
//        // 4. Ən böyük dəyəri tap
//        HashMap<String, Integer> scores = new HashMap<>();
//        scores.put("Ali", 90);
//        scores.put("Veli", 85);
//        scores.put("Aysel", 95);
//        String topKey = null;
//        int maxValue = Integer.MIN_VALUE;
//        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
//            if (entry.getValue() > maxValue) {
//                maxValue = entry.getValue();
//                topKey = entry.getKey();
//            }
//        }
//
//        System.out.println("Ən böyük dəyərə sahib: " + topKey + " (" + maxValue + ")");
//
//        System.out.println("\n---");
//
//        // 5. Key-lərin böyük hərflərə çevrilməsi
//        HashMap<String, String> map = new HashMap<>();
//        map.put("red", "qırmızı");
//        map.put("green", "yaşıl");
//        map.put("blue", "mavi");
//
//        HashMap<String, String> upperKeysMap = new HashMap<>();
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            upperKeysMap.put(entry.getKey().toUpperCase(), entry.getValue());
//        }
//        System.out.println("Böyük hərf key-lər: " + upperKeysMap);
//
//        // 6. Telefon kitabı
//        HashMap<String, List<String>> phoneBook = new HashMap<>();
//        phoneBook.put("Ali", Arrays.asList("0501234567", "0707654321"));
//        phoneBook.put("Veli", Arrays.asList("0559876543"));
//        System.out.println("Telefon kitabı: " + phoneBook);
//
//        System.out.println("\n---");
//
//        // 7. Tələbə və qiymətlər + orta hesab
//        HashMap<String, List<Integer>> studentGrades = new HashMap<>();
//        studentGrades.put("Ali", Arrays.asList(90, 80, 85));
//        studentGrades.put("Veli", Arrays.asList(70, 75, 80));
//        studentGrades.put("Aysel", Arrays.asList(100, 95, 90));
//
//        for (Map.Entry<String, List<Integer>> entry : studentGrades.entrySet()) {
//            String student = entry.getKey();
//            List<Integer> grades = entry.getValue();
//            double avg = grades.stream().mapToInt(Integer::intValue).average().orElse(0);
//            System.out.println(student + " orta balı: " + avg);
//        }
//
//        System.out.println("\n---");
//
//        // 8. Mətn analizatoru (hərflərin sayı)
//        String text = "Salam dünya";
//        HashMap<Character, Integer> charCount = new HashMap<>();
//        for (char c : text.toCharArray()) {
//            if (c != ' ') { // boşluqları saymırıq
//                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//            }
//        }
//        System.out.println("Hərflərin sayı: " + charCount);
//
//        System.out.println("\n---");
//
//        // 9. HashMap birləşdirmə (merge)
//        HashMap<String, Integer> map1 = new HashMap<>();
//        map1.put("alma", 2);
//        map1.put("armud", 3);
//
//        HashMap<String, Integer> map2 = new HashMap<>();
//        map2.put("alma", 4);
//        map2.put("banan", 5);
//
//        map2.forEach((key, value) -> map1.merge(key, value, Integer::sum));
//        System.out.println("Birləşdirilmiş xəritə: " + map1);
//
//        System.out.println("\n---");
//
//        // 10. HashMap sıralama (value-ya görə azalan sıra)
//        HashMap<String, Integer> scoress = new HashMap<>();
//        scoress.put("Ali", 85);
//        scoress.put("Veli", 90);
//        scoress.put("Aysel", 95);
//
//        scores.entrySet()
//                .stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        List<String> words = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art");

        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String sortedWord = new String(letters);

            if (!anagramMap.containsKey(sortedWord)) {
                anagramMap.put(sortedWord, new ArrayList<>());
            }

            anagramMap.get(sortedWord).add(word);
        }

        for (Map.Entry<String, List<String>> entry : anagramMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        HashMap<String, Double> products = new HashMap<>();
        products.put("Telefon", 1500.0);
        products.put("Noutbuk", 2500.0);
        products.put("Qulaqlıq", 200.0);
        products.put("Monitor", 800.0);

        String maxProduct = null;
        String minProduct = null;
        double maxPrice = Double.MIN_VALUE;
        double minPrice = Double.MAX_VALUE;

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            String product = entry.getKey();
            double price = entry.getValue();

            if (price > maxPrice) {
                maxPrice = price;
                maxProduct = product;
            }
            if (price < minPrice) {
                minPrice = price;
                minProduct = product;
            }
        }

        System.out.println("Ən bahalı məhsul: " + maxProduct + " - " + maxPrice);
        System.out.println("Ən ucuz məhsul: " + minProduct + " - " + minPrice);

        for (String product : products.keySet()) {
            double newPrice = products.get(product) * 1.10;
            products.put(product, newPrice);
        }

        System.out.println("\nYenilənmiş qiymətlər:");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
