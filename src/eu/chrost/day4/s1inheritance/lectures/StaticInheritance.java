package eu.chrost.day4.s1inheritance.lectures;

public class StaticInheritance {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000);
        Manager manager = new Manager("Jane Smith", 80000, "IT");

        //statyczne metody powinny tak w ogole powinny byc wolane tak
        System.out.println(Employee.whoAmI());
        System.out.println(Manager.whoAmI());

        //ale oczywiscie niektorzy probuja to robic nie tak jak trzeba
        //dopoki referencje maja faktycznie taki typ obiektu jaki jest pod nimi ukryty
        //to jeszcze to w miare dziala
        System.out.println(employee.whoAmI());
        System.out.println(manager.whoAmI());

        //ale jezeli obiekt bedzie innego typu niz wskazujaca na niego referencja
        Employee hiddenManager = manager;

        //to wowczas statyczna metoda zawola sie z takiego typu jakiego jest referencja
        //(czyli Employee) a nie jakiego jest faktyczny obiekt (Manager)
        System.out.println(hiddenManager.whoAmI());

    }
}
