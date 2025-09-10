// Program to print multiplication tables from 6 to 9
class Multiplication6To9 {
    public static void main(String[] args) {
        int[] numbers = {6, 7, 8, 9};

        for (int n = 0; n < numbers.length; n++) {
            System.out.println("\nMultiplication Table of " + numbers[n] + ":");
            int[] results = new int[10];
            for (int i = 0; i < results.length; i++) {
                results[i] = numbers[n] * (i + 1);
                System.out.println(numbers[n] + " * " + (i + 1) + " = " + results[i]);
            }
        }
    }
}
