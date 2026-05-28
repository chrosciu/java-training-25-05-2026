package eu.chrost.day4.s1inheritance.lectures;

public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000);
        Manager manager = new Manager("Jane Smith", 80000, "IT");

        //poniewaz kazdy manager jest pracownikiem to moge robic bezproblemowe przypisanie
        //(obiekt klasy potomnej moge zawsze przypisac do klasy bazowej)
        Employee hiddenManager = manager;

        //operacja odwrotna - czyli przypisanie obiektu klasy bazowej do referencji klasy potomnej
        //nie jest mozliwa wprost (dlatego ze nie kazdy pracownik jest automatycznie managerem)
        //Manager fakeManager = employee;

        //taka operacje mozna wymusic poprzez rzutowanie wprost
        //taki kod sie skompiluje - ale jesli dany pracownik nie jest managerem
        //to dostaniemy w runtime ClassCastException
        //Manager fakeManager = (Manager) employee;

        //takie rzutowanie sie powiedzie bo to jest faktycznie manager
        Manager realManager = (Manager) hiddenManager;

        //mimo tego ze referencja jest z klasy bazowej
        //to zawolania poprzez nia metoda
        //faktycznie wywoluje metode z klasy potomnej
        //(czyli z obiektu na ktory wskazuje referencja)
        System.out.println(hiddenManager.toString());

        //rzutowanie jest dozwolone tylko w ramach hierarchii przodek - potomek
        //czyli nie da sie robic rzutowania na klasy nie bedace potomkiem albo przodkiem
        //cos takiego zatem sie w ogole nie skompiluje
        //String s = (String) employee;

        //za poomoca metody getClass() z klasy Object() mozna dojsc do tego
        //jakiego faktycznie typu jest obiekt trzymany pod dana referencja
        System.out.println(hiddenManager.getClass().getName());

        //operatorem instanceof mozna faktycznie sprawdzic czy da sie wykonac rzutowanie
        //operator zwraca typ boolean wiec mozna go uzyc w if()
        if (hiddenManager instanceof Manager) {
            Manager anotherRealManager = (Manager) hiddenManager;
            System.out.println(anotherRealManager.getName());
        }

        //ten cast sie nie uda wiec blok w if sie nie wykona
        //ale nie poleci dzieki temu ClassCastException
        if (employee instanceof Manager) {
            System.out.println("It's a miracle!");
        }

        //skladnia instanceof zmienila sie od Java 13 i teraz nie trzeba
        //robic tego extra casta po instanceof
        //jesli wynik instanceof jest true
        // to do zmiennej yetAnotherManager bedzie przypisany zrzutowany hiddenManager
        if (hiddenManager instanceof Manager yetAnotherManager) {
            System.out.println(yetAnotherManager.toString());
        }


    }
}
