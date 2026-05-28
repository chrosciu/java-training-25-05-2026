package eu.chrost.day4.s4interfaces.lectures.names;

import java.util.Comparator;

//klasa bedzie umozliwiala porownanie obiektow implementujacych interfejs Nameable
public class NameableComparator implements Comparator<Nameable> {
    //w implementacji musimy porownac name z pierwszego obiektu i z drugiego
    @Override
    public int compare(Nameable o1, Nameable o2) {
        //zalozenie implementacyjne: jedna i druga wartosc to nie jest null
        String name1 = o1.getName();
        String name2 = o2.getName();
        return name1.compareTo(name2);
    }
}
