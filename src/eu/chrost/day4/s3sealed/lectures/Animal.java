package eu.chrost.day4.s3sealed.lectures;

//klasa oznaczona jako sealed wprost wskazuje ktore klasy moga po niej dziedziczyc
//wszystkie inne maja to zabronione
//jezeli uzywamy modyfikatore sealed to musimy w sekcji permits wskazac
//przynajmmiej jedna klase dopuszczona do dziedziczenia
//brak takiej sekcji albo pusta sekcja sa niedozwolone
//klasy wymienione w sekcji permits musza znajdowac sie w tym samym pakiecie
//co klasa oznaczona jako sealed
//oraz musza same w sobie deklarowac jedna z 3 mozliwosci:
//final LUB sealed LUB non-sealed
//(to ostatnie wymusza na programiscie swiadoma decyzje o ponownym otwarciu hierarchii)
//klasa zapieczetowana moze byc klasa abstrakcyjna
public abstract sealed class Animal permits Bird, Cat, Dog {
    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String greet();
}
