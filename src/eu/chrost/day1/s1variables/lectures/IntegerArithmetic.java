package eu.chrost.day1.s1variables.lectures;

public class IntegerArithmetic {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        int sum = a + b;
        System.out.println(sum);

        int diff = a - b;
        System.out.println(diff);

        int product = a * b;
        System.out.println(product);

        //dzielenie calkowite - wynik zaokraglany jest w dol
        int quotient = a / b;
        System.out.println(quotient);

        //reszta z dzielenia
        int remainder = a % b;
        System.out.println(remainder);
    }
}
