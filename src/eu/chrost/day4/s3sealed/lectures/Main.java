package eu.chrost.day4.s3sealed.lectures;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Maja");
        Cat cat = new Cat("Maniek");
        Canary canary = new Canary("Tweety");

        System.out.println(dog.greet());
        System.out.println(cat.greet());
        System.out.println(canary.greet());

        System.out.println(describe(dog));
        System.out.println(describe(cat));
        System.out.println(describe(canary));
        System.out.println(describe(null));
    }

    //klasy zapieczetowane swietnie dopasowuja sie do nowej wersji instrukcji switch
    //wprowadzonej od Javy 19
    private static String describe(Animal animal) {
        return switch(animal) {
            //nowa wersja instrukcji switch wprowadza tzw. pattern matching
            //czyli mozliwosc dopasowania zmiennej przekazanej do switcha
            //nie po wartosci a po typie tej zmiennej
            case Canary c -> "This is a canary named " + c.name;
            //w ponizszym przykladzie - jezeli animal bedzie tak naprawde typu Bird
            //to zostanie wykonana ponizsza galaz
            //a dodatkowo w zmiennej b od razu znajdzie sie wartosc animal zrzutowana na typ Bird
            case Bird b -> "This is a bird named " + b.name;
            case Cat c -> "This is a cat named " + c.name;
            //mozna rowniez uzywac tutaj kolejnych podklas
            //warunek jest taki ze klasa potomka musi znalezc sie przed klasa przodka
            //gdyby Dog byl wczesniej to nigdy nie mielibysmy szans dojsc do galezi dla Dachshund
            //(wybierana jest bowiem pierwsza pasujaca galaz)
            //kompilator zglosi wtedy blad
            case Dachshund d -> "This is a dachshund named " + d.name + ", woof!" + d.fetch();
            //Bird, Cat i Dog sa jedynymi mozliwymi typami jakie moze przyjac animal
            //w zwiazku z tym nie jest potrzebna klauzula default
            case Dog d -> "This is a dog named " + d.name + ", woof! " + d.fetch();
            //przed Java 19 przekazanie wartosci null do switcha powodowalo NPE
            //teraz mozna dodac specjalna galaz na takie przypadki
            case null -> "No animal provided";
        };
    }
}
