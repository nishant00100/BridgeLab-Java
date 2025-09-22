import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {
    private static final int OTP_LENGTH = 6;

    public static int generate6DigitOtp() {
        return (int) (Math.random() * 900000) + 100000; // 100000..999999
    }

    public static int[] generateOTPs(int times) {
        int[] otps = new int[times];
        for (int i = 0; i < times; i++) otps[i] = generate6DigitOtp();
        return otps;
    }

    public static boolean areUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int v : arr) set.add(v);
        return set.size() == arr.length;
    }

    public static void main(String[] args) {
        int[] otps = generateOTPs(10);
        System.out.print("Generated OTPs: ");
        for (int o : otps) System.out.print(o + " ");
        System.out.println();
        System.out.println("All unique? " + areUnique(otps));

        // If not unique, regenerate until unique (optional)
        int attempts = 1;
        while (!areUnique(otps)) {
            otps = generateOTPs(10);
            attempts++;
        }
        System.out.println("Unique OTP set after attempts: " + attempts);
    }
}
