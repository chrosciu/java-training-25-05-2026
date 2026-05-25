package eu.chrost.day1.s1variables.lectures;

public class Casting {
    public static void main(String[] args) {
        //rzutowanie bez problemu
        int c = 3;
        long longC = c;
        System.out.println(longC);

        long d = 5;
        //nie kompiluje sie - nie wolno rzutowac nie wprost (po cichu) z typu szerszego na wezszy
        //int intD = d;
        //przy rzutowaniu wprost z podaniem typu mozna - na odpowiedzialnosc programisty
        int intD = (int) d;
        System.out.println(intD);
    }
}
