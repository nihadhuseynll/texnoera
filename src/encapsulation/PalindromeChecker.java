package encapsulation;

public class PalindromeChecker {

    public boolean isPalindrome(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        System.out.println("Reversed string of str: " + reversedString);
        return str.equals(reversedString);
    }
}
