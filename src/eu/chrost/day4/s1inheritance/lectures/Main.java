package eu.chrost.day4.s1inheritance.lectures;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000);
        System.out.println(employee);
        System.out.println(employee.getName());
        System.out.println(employee.name);

        Manager manager = new Manager("Jane Smith", 80000, "IT");
        System.out.println(manager);
        System.out.println(manager.getName());

        System.out.println(employee.getClass().getName());
    }
}
