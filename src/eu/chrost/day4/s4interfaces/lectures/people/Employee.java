package eu.chrost.day4.s4interfaces.lectures.people;

import eu.chrost.day4.s4interfaces.lectures.names.ExtraNameable;

//jezeli dana klasa jednoczesnie dziedziczy po innej i implementuje interfejsy lub interfejsy
//to najpierw podaje sie klauzule extends a potem implements (pozniej jeszcze moze byc permits)
//jezeli mamy jakis sposob sortowania obiektow danej klasy
//to mozemy zamiast tworzyc komparator z wykorzystaniem interfejsu Comparator
//od razu zmusic klase do zaimplementowania interfejsu Comparable
public class Employee extends Worker implements ExtraNameable, Comparable<Employee> {
    private final String name;
    private final String surname;

    public Employee(int salary, String name, String surname) {
        super(salary);
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFullName() {
        //jezeli chcemy zawolac domyslna implementacje metody
        //z interfejsu ktory implementuje dana klasa
        //to musimy uzyc nazwy tego interfejsu przed slowem super
        //gdyz samo super odnosilo by sie do klasy bazowej (czyli Worker)
        //return ExtraNameable.super.getFullName();

        //my jednak nadpiszemy te metode
        return name + " " + surname;
    }

    //tutaj metoda porownujaca naszego pracownika z innym
    //zalozymy ze bedziemy porownywac po pensji
    //dodatkowo zrobimy tak ze pracownik z wyzsza pensja bedzie wczesniej na liscie
    @Override
    public int compareTo(Employee o) {
        return o.salary - this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                "} ";
    }
}
