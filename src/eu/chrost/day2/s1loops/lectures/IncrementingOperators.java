package eu.chrost.day2.s1loops.lectures;

public class IncrementingOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);

        //zwykle dodanie wartosci i przypisanie do tej samej zmiennej
        i = i + 1;
        System.out.println(i);

        //skrocony zapis powyzszego - moze byc o dowolna wartosc, niekoniecznie o 1
        i += 1;
        System.out.println(i);

        //odejmowanie - j.w.
        i -= 1;
        System.out.println(i);

        //dziala nawet z mnozeniem
        i *= 2;
        System.out.println(i);

        //zwieksz wartosc o 1
        i++;
        System.out.println(i);

        //zmniejsz wartosc o 1
        i--;
        System.out.println(i);

        //w tej chwili wartosc i wynosi 4

        //wypisz najpierw zawartosc i (4) a nastepnie podbij o 1
        System.out.println(i++);
        //w tym momencie i jest juz rowne 5
        System.out.println(i);

        //najpierw podbij i o 1 a nastepnie wypisz zawartosc
        System.out.println(++i);
        //w tym momencie i jest juz rowne 6
        System.out.println(i);

    }
}
