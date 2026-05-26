package eu.chrost.day2.s2arrays.lectures;

public class ProgramArguments {
    //Zsumuj liczby od M do N, gdzie M i N sa przekazane z zewnatrz jako argumenty
    public static void main(String[] args) {

        //walidacja ilosci argumentow
        if (args.length != 2) {
            System.out.println("Należy przekazac dokładnie 2 argumenty - liczby całkowite, pierwsza mniejsza bądź równa drugiej");
            //return powoduje wyjscie z aktualnej metody
            //na tym etapie mozna go potraktowac jako instrukcje natychmiast konczaca wykonanie programu
            return;
        }

        //wczytanie i walidacja pierwszego argumentu
        String firstArgument = args[0];
        int firstNumber;
        try {
            firstNumber = Integer.parseInt(firstArgument);
        } catch (NumberFormatException e) {
            System.out.println("Pierwszy argument nie jest liczbą całkowitą");
            return;
        }

        //wczytanie i walidacja drugiego argumentu
        String secondArgument = args[1];
        int secondNumber;
        try {
            secondNumber = Integer.parseInt(secondArgument);
        } catch (NumberFormatException e) {
            System.out.println("Drugi argument nie jest liczbą całkowitą");
            return;
        }

        //walidacja relacji miedzy argumentami
        if (firstNumber > secondNumber) {
            System.out.println("Pierwsza liczba musi byc mniejsza lub równa drugiej");
            return;
        }

        //faktyczne obliczenie sumy
        int sum = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }
        System.out.println("Suma od: " + firstNumber + " do: " + secondNumber + " wynosi: " + sum);
    }
}
