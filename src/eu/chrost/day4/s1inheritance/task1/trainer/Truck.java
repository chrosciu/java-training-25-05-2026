package eu.chrost.day4.s1inheritance.task1.trainer;

public class Truck extends Vehicle {
    private final double loadCapacity;

    public Truck(double loadCapacity, String brand, int year) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck [brand=" + brand + ", loadCapacity=" + loadCapacity + ", year=" + year + "]";
    }

    //inna implementacja hashCode i equals bazujaca na templatach z VSCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(loadCapacity);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Truck other = (Truck) obj;
        if (Double.doubleToLongBits(loadCapacity) != Double.doubleToLongBits(other.loadCapacity))
            return false;
        return true;
    }

    
}
