public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Palindrome? " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
