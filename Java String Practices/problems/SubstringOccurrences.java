public class SubstringOccurrences {
    public static void main(String[] args) {
        String str = "abababa";
        String sub = "aba";
        System.out.println("Occurrences: " + countSubstringOccurrences(str, sub));
    }

    public static int countSubstringOccurrences(String str, String sub) {
        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) count++;
        }
        return count;
    }
}
