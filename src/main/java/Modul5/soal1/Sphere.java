package Modul5.soal1;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double r) {
        super("Sphere");
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 4 * Math.PI * (getRadius() * getRadius());
    }

    public String toString() {
        return super.toString() + " of radius " + getRadius();
    }
}