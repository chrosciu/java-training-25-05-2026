package eu.chrost.day2.s1loops.lectures;

public class For {
    public static void main(String[] args) {
        //petla for sklada sie z 3 czesci
        //1 - deklaracja zmiennej dostepnej wewnatrz petli oraz ustawienie jej poczatkowej wartosci
        //2 - warunek ktory jest sprawdzany przed wejsciem do petli (czyli tak jak w petli while)
        //co oznacza ze petla for moze nie wykonac sie ani razu !
        //3 - akcja jaka ma zostac wykonana po zakonczeniu kazdej iteracji petli
        //czyli ostatnia instrukcja w iteracji
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                //instrukcja continue powoduje przerwanie aktualnego przebiegu petli
                //ALE akcja zdefiniowana w czesci 3 zostanie jednak wykonana
                continue;
            }
            System.out.println(i);
        }
        //w tym miejscu licznik jest juz niedostepny
        //System.out.println(i);

        System.out.println("########");

        //skladowe petli sa opcjonalne - mozna je pominac
        //jezeli pominiemy warunek z czesci 2 to uznaje sie ze jest on zawsze prawdziwy
        //iteracja ma wykonac sie zawsze
        for (int j = 1; ;) {
            if (j > 10) {
                //instrukcja break dziala dokladnie tak samo
                //jak w petli while / do-while
                break;
            }
            System.out.println(j++);
        }

        System.out.println("########");

        int k = 1;
        //ta petla wykonuje sie zawsze i jest dokladnym odpowiednikiem while(true)
        for (;;) {
            if (k > 10) {
                break;
            }
            System.out.println(k++);
        }
    }
}
