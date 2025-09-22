public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "I love Java";
        System.out.println("Modified: " + replaceWord(sentence, "Java", "Python"));
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.equals(oldWord)) sb.append(newWord).append(" ");
            else sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}
