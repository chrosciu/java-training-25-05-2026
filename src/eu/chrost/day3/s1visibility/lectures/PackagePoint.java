package eu.chrost.day3.s1visibility.lectures;

//ta klasa bedzie widoczna tylko w tym samym pakiecie - co oznacza ze nie da sie jej uzyc w innym
class PackagePoint {
    private double x;
    private double y;

    public PackagePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
