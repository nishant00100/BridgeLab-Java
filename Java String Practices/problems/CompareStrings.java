public class CompareStrings {
    public static void main(String[] args) {
        compareStrings("apple", "banana");
    }

    public static void compareStrings(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
                return;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\"");
                return;
            }
        }
        if (s1.length() < s2.length())
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
        else if (s1.length() > s2.length())
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\"");
        else
            System.out.println("Both strings are equal");
    }
}
