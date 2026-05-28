package eu.chrost.day4.s1inheritance.task1.trainer;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Skladak", 2025);
        System.out.println(vehicle);

        Car fiat = new Car("Fiat Punto", 2005, 5);
        System.out.println(fiat);

        Car anotherFiat = new Car("Fiat Punto", 2010, 5);
        System.out.println(anotherFiat);
        System.out.println(fiat.equals(anotherFiat));

        Car fiatCopy = new Car("Fiat Punto", 2005, 5);
        System.out.println(fiat.equals(fiatCopy));

        Truck ivecoDaily = new Truck(30, "Iveco Daily", 2025);
        System.out.println(ivecoDaily);

    }
}
