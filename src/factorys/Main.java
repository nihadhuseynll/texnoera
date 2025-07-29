package factorys;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};
        System.out.println(countSegments("Hello , what is your ! name."));
//        String s = "aabaaaaacaaabaa";
//        int count = 1;
//        String emptyString = "";
//        for (int i = 0; i < s.length(); i++) {
//            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
//                count++;
//                if (count <= 2) {
//                    emptyString = emptyString + s.charAt(i);
//                }
//            } else {
//                emptyString = emptyString + s.charAt(i);
//                count = 1;
//            }
//        }
//        System.out.println(emptyString);
//
//        int[] array1 = {2, 7, 15, 7, 30, 5, 3, 6, 0, 0, 9};
//        int target = 9;
//        String array2 = "";
//        String[] stringArray;
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = i + 1; j < array1.length; j++) {
//                if (array1[i] + array1[j] == target) {
//                    array2 = array2 + i + " " + j;
//                    stringArray = array2.split(" ");
//                    System.out.println(Arrays.toString(stringArray));
//                    array2 = "";
//                }
//            }
//        }

//        System.out.println(wordPattern("abba", "dog cat cat dog"));
//        System.out.println(wordPattern("abba", "dog cat cat fish"));
//        System.out.println(wordPattern("aaaa", "dog cat cat dog"));

//        String haystack = "butsad";
//        String needle = "sad";
//        boolean[] checkArray = new boolean[needle.length()];
//        ArrayList<Integer> newList = new ArrayList<>();
//
//        for (int i = 0; i < haystack.length(); i++) {
//            for (int j = 0; j < needle.length(); j++) {
//                if (haystack.charAt(i) == needle.charAt(j)) {
//                    checkArray[j] = true;
//                    newList.add(i);
//                    break;
//                }else {
//                    if (!allFalse(checkArray)){
//                        checkArray = new boolean[needle.length()];
//                    }
//                }
//            }
//        }
//
//        if (allTrue(checkArray)) {
//            System.out.println(newList.getFirst());
//        } else {
//            System.out.println("-1");
//        }
    }

//    public static boolean allTrue(boolean[] checkArray) {
//        for (int i = 0; i < checkArray.length; i++) {
//            if (!checkArray[i]) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean allFalse(boolean[] checkArray) {
//        for (int i = 0; i < checkArray.length; i++) {
//            if (checkArray[i]) {
//                return false;
//            }
//        }
//        return true;
//    }

//    public static String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) return "";
////        String[] strings = {"flower","flow","flight"};
//
//        String prefix = strs[0];
//
//        for (int i = 1; i < strs.length; i++)
//            while (strs[i].indexOf(prefix) != 0) {
//                prefix = prefix.substring(0, prefix.length() - 1);
//                System.out.println(prefix);
//                if (prefix.isEmpty()) {
//                    return "";
//                }
//            }
//        return prefix;
//    }

    public static int countSegments(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        String[] segments = s.trim().split("\\s+");
        return segments.length;
    }
//    public static boolean wordPattern(String pattern, String s) {
//        String[] words = s.split(" ");
//        if (pattern.length() != words.length) return false;
//
//        String[] patternToWord = new String[26];
//        String[] wordToPattern = new String[words.length];
//
//        for (int i = 0; i < pattern.length(); i++) {
//            char c = pattern.charAt(i);
//            String word = words[i];
//
//            int index = c - 'a';
//
//            if (patternToWord[index] == null) {
//                patternToWord[index] = word;
//            } else {
//                if (!patternToWord[index].equals(word)) return false;
//            }
//
//            for (int j = 0; j < i; j++) {
//                if (words[j].equals(word) && pattern.charAt(j) != c) {
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }
}
