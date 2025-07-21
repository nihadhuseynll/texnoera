package encapsulation;

public class WordCounter {
    public int countWords(String sentence) {
        String str = "";
        for (int i = 0; i < sentence.length(); i++) {
            char symbol = sentence.charAt(i);

            if (symbol >= 'a' && symbol <= 'z' || symbol >= 'A' && symbol <= 'Z' || sentence.charAt(i) == ' ') {
                str += symbol;
            }
        }
        System.out.println(str);
        return 0;
    }

    public static int countSpecificWord(String sentence, String word) {
        if (sentence == null || word == null || word.isEmpty()) return 0;

        String[] words = sentence.toLowerCase().split("\\s+");
        String target = word.toLowerCase();
        int count = 0;

        for (String w : words) {
            w = w.replaceAll("[^a-zA-Z]", "");

            if (w.equals(target)) {
                count++;
            }
        }

        return count;
    }
}
