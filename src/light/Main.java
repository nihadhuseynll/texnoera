package light;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Ad və yaş saxla
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Ali", 25);
        people.put("Veli", 30);
        people.put("Aysel", 28);
        System.out.println("Ad və yaş siyahısı:");
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        for(String key : people.keySet()) {
            System.out.println(key + " - " + people.get(key));
        }

        System.out.println("\n---");

        // 2. Ölkə – Paytaxt
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Azerbaijan", "Baku");
        capitals.put("Turkey", "Ankara");
        capitals.put("USA", "Washington");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ölkə adı daxil edin: ");
        String country = sc.nextLine();
        String capital = capitals.get(country);
        if (capital != null) {
            System.out.println(country + " ölkəsinin paytaxtı: " + capital);
        } else {
            System.out.println("Bu ölkə siyahıda yoxdur.");
        }

        System.out.println("\n---");

        // 3. Sayğac (sözlərin sayılması)
        String[] words = {"alma", "armud", "alma", "banan", "alma", "banan"};
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String w : words) {
            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
            wordCount.get("kasdmlkasmd");
        }
        System.out.println("Sözlərin sayı: " + wordCount);

        System.out.println("\n---");

        // 4. Ən böyük dəyəri tap
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Ali", 90);
        scores.put("Veli", 85);
        scores.put("Aysel", 95);
        String topKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                topKey = entry.getKey();
            }
        }

        System.out.println("Ən böyük dəyərə sahib: " + topKey + " (" + maxValue + ")");

        System.out.println("\n---");

        // 5. Key-lərin böyük hərflərə çevrilməsi
        HashMap<String, String> map = new HashMap<>();
        map.put("red", "qırmızı");
        map.put("green", "yaşıl");
        map.put("blue", "mavi");

        HashMap<String, String> upperKeysMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            upperKeysMap.put(entry.getKey().toUpperCase(), entry.getValue());
        }
        System.out.println("Böyük hərf key-lər: " + upperKeysMap);
    }
}
