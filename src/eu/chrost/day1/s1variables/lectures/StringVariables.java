package eu.chrost.day1.s1variables.lectures;

public class StringVariables {
    public static void main(String[] args) {
        String name = "Marcin";
        System.out.println(name);

        String surname = "Chrost";
        System.out.println(surname);

        //mozliwe nazwy zmiennych:
        //full_name
        //FullName
        //fullName - konwencja uzywana w Javie - pierwszy czlon z malej litery, pozostale - z duzej, bez podkreslnikow

        //mozna zdeklarowac wprost - ale to bez sensu - powtarzamy sie
        //String fullName = "Marcin Chrost";

        String fullName = "Marcin" + "Chrost";
        System.out.println(fullName);

        //mozna tak - ale to nie wyglada ladnie
        //String fullNameWithSpace = "Marcin " + "Chrost";
        //lepiej dac te spacje oddzielnie
        String fullNameWithSpace = "Marcin" + " " + "Chrost";
        System.out.println(fullNameWithSpace);

        int i = 3;
        //mozna laczyc operatorem `+` zmienne rzonych typow - wystarczy ze jeden z nich to String
        //wtedy calosc bedzie traktowana jak String
        String description = "i = " + i;
        System.out.println(description);

    }
}
