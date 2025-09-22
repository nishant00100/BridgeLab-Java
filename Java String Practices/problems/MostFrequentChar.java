public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "success";
        System.out.println("Most Frequent Character: " + mostFrequentChar(str));
    }

    public static char mostFrequentChar(String str) {
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        int max = -1;
        char result = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                result = c;
            }
        }
        return result;
    }
}
