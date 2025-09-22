public class ToggleCase {
    public static void main(String[] args) {
        String str = "HeLLo WoRLD";
        System.out.println("Toggled: " + toggleCase(str));
    }

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c)) sb.append(Character.toUpperCase(c));
            else sb.append(c);
        }
        return sb.toString();
    }
}
