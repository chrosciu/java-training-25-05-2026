package eu.chrost.day3.s6static.task1.trainer;

public class Counter {

    private static int objectCount = 0;
    private final int id;

    public Counter() {
        objectCount += 1;
        id = objectCount;
    }

    public static int getObjectCount(){
       return objectCount;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) {

        System.out.println("counter " + Counter.getObjectCount());
        Counter counter1 = new Counter();
        System.out.println("counter " + getObjectCount());
        Counter counter2 = new Counter();
        System.out.println("counter " + Counter.getObjectCount());
        Counter counter3 = new Counter();
        System.out.println("counter " + Counter.getObjectCount());

        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(counter3);
    }
}
