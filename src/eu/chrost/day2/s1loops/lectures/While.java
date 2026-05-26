package eu.chrost.day2.s1loops.lectures;

public class While {
    public static void main(String[] args) {
        //wypisz na ekran liczby od 1 do 10
        int i = 1;
        while (i <= 10) {
            //warunek jest sprawdzany zawsze na wejsciu do petli
            //zatem mozliwe jest ze petla nie wykona sie ani razu
            System.out.println(i);
            i += 1;
            //po wykonaniu tego kodu wracamy na poczatek petli
            //i znowu sprawdzamy warunek
            //jezeli bedzie falszywy nie wykona sie juz kolejna iteracja
        }

        int j = 100;
        //ta petla nie wykona sie ani razu - warunek nie jest spelniony na pierwszym wejsciu
        while (j <= 10) {
            System.out.println(j);
            j += 1;
        }

        int k = 1;
        //ta petla bedzie wykonywac sie bez konca - warunek bedzie zawsze prawdziwy !
//        while (k > 0) {
//            System.out.println(k++);
//        }
    }
}
