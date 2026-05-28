package eu.chrost.day4.s5enums.lectures;

//enum jest specyficzna forma klasy
//w ktorej podajemy zamkniety zbior jakichs wartosci
//ktore to wartosci sa instancjami enuma
//tworzonymi "z urzedu" przez Jave
//oznacza to tyle ze nie mozna stworzyc instancji enuma przez new
//a istniejace instancje sa wspoldzielone w calym systemie
public enum WeekDay {
    //wartosci typu wyliczeniowego tez piszemy w formacie UPPER_KEBAB_CASE
    //i oddzielamy przecinkami
    //ta wartosc uzywa konstruktora bezparametrowego
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    //natomiast tu uzyty jest konstruktor z parametrem
    SATURDAY(true),
    SUNDAY(true);

    //enum moze miec pola i metody
    //pola oczywiscie musza byc ustawione w konstruktorze
    //co oznacza ze enum moze miec takze konstruktory
    //domyslnie oczywiscie generowany jest tylko konstruktor bezparametrowy

    private final boolean isWeekend;

    //konstruktor enuma nie jest publiczny bo i tak nie da sie stworzyc jego instancji z zewnatrz
    WeekDay(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    WeekDay() {
        this.isWeekend = false;
    }

    //zeby to pole mialo w ogole sens i dalo sie je uzyc to najlepiej zrobic do niego getter
    public boolean isWeekend() {
        return isWeekend;
    }
}
