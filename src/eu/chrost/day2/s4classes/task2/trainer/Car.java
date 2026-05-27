package eu.chrost.day2.s4classes.task2.trainer;

class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = 2000;
    }

    public Car() {
        this("Unknown", "Unknown", 2000);
    }


    public void print() {
        System.out.println("Car{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", year=" + year + '}');
    }

    public boolean isOlderThan(int year) {
        return this.year < year;
    }

}
