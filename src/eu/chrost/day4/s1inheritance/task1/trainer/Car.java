package eu.chrost.day4.s1inheritance.task1.trainer;

import java.util.Objects;

public class Car extends Vehicle {
    private final int seats;

    public Car(String brand, int year, int seats) {
        super(brand, year);
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", seats=" + seats + ", year=" + year + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return seats == car.seats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seats);
    }
}
