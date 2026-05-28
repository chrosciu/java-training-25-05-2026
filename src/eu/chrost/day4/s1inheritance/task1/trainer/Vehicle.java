package eu.chrost.day4.s1inheritance.task1.trainer;

import java.util.Objects;

public class Vehicle {
    protected final String brand;
    protected final int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle [brand=" + brand + ", year=" + year + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return year == vehicle.year && Objects.equals(brand, vehicle.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, year);
    }
}
