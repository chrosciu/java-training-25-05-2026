package eu.chrost.day3.s6static.task2.trainer;

public class Kalkulator {

    public static final double PI = 3.14159;
    public static final double E = 2.71828;

    private Kalkulator() {
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a/b;
    }

    public static void main(String[] args) {

        System.out.println("PI = " + PI);
        System.out.println("E = " + Kalkulator.E);

        System.out.println("Dodawanie: " + add(PI, E));
        System.out.println("Odejmowanie: " + subtract(PI, E));
        System.out.println("Mnożenie: " + multiply(PI, E));
        System.out.println("Dzielenie: " + divide(PI, E));

    }

}
