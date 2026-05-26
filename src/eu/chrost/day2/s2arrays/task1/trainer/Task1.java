package eu.chrost.day2.s2arrays.task1.trainer;

public class Task1 {
    public static void main(String[] args) {
        int[] liczbyCal = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int liczba : liczbyCal) {
            sum +=liczba;
        }
        System.out.println("Suma elementow tablicy " + sum);

        //mozna tez uzyc String.format zeby nie kleic lancuchow za pomoca `+`
        System.out.println(String.format("Suma elementow tablicy %d", sum));
    }
}
