package area20240711;

public class Circle extends Picture{
    private double r;
    private final double PI = 3.1415926;

    public Circle(){}

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double length() {
        return 2 * PI * this.r;
    }

    @Override
    public double area() {
        return this.r * this.r * PI;
    }
}
