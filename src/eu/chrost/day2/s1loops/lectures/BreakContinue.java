package eu.chrost.day2.s1loops.lectures;

public class BreakContinue {
    public static void main(String[] args) {
        //wypisz na ekran liczby od 1 do 10
        int i = 1;
        //nieskonczona petla - musimy recznie zdefiniowac w srodku warunek wyjscia
        while (true) {
            System.out.println(i++);

            if (i > 10) {
                //nie wykonuj juz pozostalych instrukcji w petli
                //i nie uruchamiaj juz kolejnej iteracji
                break;
            }

            System.out.println("Wypisalem liczbe: " + (i - 1));
        }

        //wypisz na ekran liczby od 1 do 10 ale z pominieciem 7
        int k = 0;
        while (++k <= 10) {
            if (k == 7) {
                //przerwij aktualna iteracje petli
                //i od razu rozpocznij kolejna
                continue;
            }
            System.out.println(k);
        }
    }
}
