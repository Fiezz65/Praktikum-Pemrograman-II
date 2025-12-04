package Modul5.soal1;

public abstract class Shape {
    protected String shapeName;

    public Shape(String name) {
        this.shapeName = name;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double area();

    @Override
    public String toString() {
        return getShapeName();
    }
}