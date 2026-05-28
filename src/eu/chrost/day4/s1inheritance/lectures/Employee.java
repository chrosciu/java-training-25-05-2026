package eu.chrost.day4.s1inheritance.lectures;

import java.util.Objects;

public class Employee {
    //prywatne pola klasy sa naprawde prywatne
    //co oznacza ze nawet klasa potomna nie ma do nich dostepu
    //dlatego jezeli wiemy ze beda one jednak w niej potrzebne
    //to trzeba zmienic im poziom widocznosci na protected
    //oznaczajacy widocznosc w ramach danej klasy, klas potomnych
    //i innych klas z tego samego pakietu
    protected final String name;
    protected final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //symbole oznaczone @ z przodu to tzw. adnotacje
    //sa to informacje dla kompilatora albo dla bibliotek
    //pozwalajace na programowe przetwarzanie informacji
    //zwiazanych z klasa, metoda, polem etc.
    //adnotacja @Override pozwala skontrolowac czy poprawnie nadpisalismy
    //metode z klasy bazowej
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    //jesli mam tu zdefiniowana metode
    //to w tym momencie klasa potomna tez ja ma
    //nawet jezeli tam jej nie nadpiszemy
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    public static String whoAmI() {
        return "Employee";
    }
}
