package eu.chrost.day4.s2abstract.lectures;

public class Dachshund extends Dog {
    public Dachshund(String name) {
        super(name);
    }

    //nie kompiluje sie - metoda greet jest oznaczona jako final w klasie Dog
    //i nie mozna jej nadpisac
//    @Override
//    public String greet() {
//        return "Wuff! I'm a Dachshund named: " + name;
//    }
}
