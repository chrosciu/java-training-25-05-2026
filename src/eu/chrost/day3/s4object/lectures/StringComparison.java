package eu.chrost.day3.s4object.lectures;

public class StringComparison {
    public static void main(String[] args) {
        //w przypadku lancuchow znakowych nie ma potrzeby uzywania operatora new
        //sa one alokowane po cichu przez Jave
        //jezeli istnieje juz na stercie lancuch o takiej samej zawartosci
        //to dostaniemy referencje do niego zamiast tworzenia nowego obiektu
        String s1 = "Marcin";
        String s2 = "Marcin";

        System.out.println("s1 == s2 -> " + (s1 == s2));

        //mozna takze uzyc new - ale jest to niepotrzebne marnowanie miejsca w pamieci
        String s3 = new String("Marcin");
        String s4 = new String("Marcin");

        System.out.println("s3 == s4 -> " + (s3 == s4));
        //equals dziala z automatu - nie trzeba go nadpisywac
        System.out.println("s3.equals(s4) -> " + (s3.equals(s4)));
    }
}
