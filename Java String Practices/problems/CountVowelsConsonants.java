public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello World";
        countVowelsConsonants(str);
    }

    public static void countVowelsConsonants(String str) {
        str = str.toLowerCase();
        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
