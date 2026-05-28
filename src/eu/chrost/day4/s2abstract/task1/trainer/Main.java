package eu.chrost.day4.s2abstract.task1.trainer;

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        Rectangle rectangle = new Rectangle(2, 3.5);

        Shape[] shapes = {circle, rectangle};

        for (Shape shape : shapes) {
            System.out.println("Area = " + shape.getArea());
        }

    }

}
