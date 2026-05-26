package eu.chrost.day2.s2arrays.lectures;

public class Var {
    public static void main(String[] args) {
        int i = 3;

        //slowo kluczowe var pozwala zdeklarowac zmienna bez podawania jej typu
        //to nie oznacza ze k jest dowolnego typu albo nie ma typu
        //typ jest ustalany na podstawie tego co jest przypisane do zmiennej
        //w tym przypadku bedzie to int
        var k = 3;

        //zmienna k mimo tego ze jest zadeklarowana var-em to ma okreslony typ
        //i nie mozna do niej przypisac wartosci innego typu
        //k = "Ala"

        var s = "Marcin";

        //nie kompiluje sie - nie mozna ustalic typu zmiennej
        //var p;

        int[] predefinedArray = {3, 4, 7};

        //tu tez mozna uzyc var - typ zostanie ustalony na podstawie tego jakiego typu elementy zawiera tablica
        for (var item: predefinedArray) {
            System.out.println(item);
        }
    }
}
