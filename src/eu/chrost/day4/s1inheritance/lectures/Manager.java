package eu.chrost.day4.s1inheritance.lectures;

import java.util.Objects;

//klasa Manager reuzywa tego co jest w klasie Employee
//dodajac nowe pola i metody
//czyli innymi slowy Manager rozszerza Employee
public class Manager extends Employee {
    private final String department;

    //poniewaz nie mamy wlasnego konstruktora to Java tworzy taki za nas
    //i wyglada on tak
//    public Manager() {
//        //w domyslnie stworzonym konstruktorze
//        //jako pierwszy wolany jest konstruktor klasy bazowej
//        //do tego celu jest uzyte slowo kluczowe super
//        super()
//
//    }

    //czyli zeby to wszystko zadzialalo to musimy zrobic konstruktor sami
    public Manager(String name, double salary, String department) {
        //pierwsza instrukcja w konstruktorze klasy potomnej
        //musi byc zawolanie konstruktora klasy bazowej
        //(chyba ze klasa bazowa ma bezparametrowy konstruktor -
        //- to wtedy zawola sie on sam)
        super(name, salary);
        this.department = department;
    }

    //zeby dalo sie wypisac zawartosc klasy Manager to trzeba w niej
    // po raz kolejny nadpisac metode toString()
    //rowniez w tej metodzie wykorzystamy metode z klasy bazowej
    //uzywajac po raz kolejny slowa kluczowego super()
//    @Override
//    public String toString() {
//        return "Manager{" +
//                "department='" + department + '\'' +
//                "} " + super.toString();
//    }

    //poprzednia wersja metody generowala tak naprawde zawartosc Employee
    //obok zawartosci Manager co wylgadalo dziwnie
    //dlatego sprobujmy napisac te metode recznie
    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary + '\'' +
                ", department='" + department + '\'' +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(department, manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    public static String whoAmI() {
        return "Manager";
    }
}
