// Program to find the age of Harry if birth year is 2000 and current year is 2024
class AgeCalculation {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("Harry's age in " + currentYear + " is " + age);
    }
}
