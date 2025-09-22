public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println("Without duplicates: " + removeDuplicates(str));
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }
        return sb.toString();
    }
}
