package src.ru.innopolis.problem1;

public class Rectangle extends Shape {
    private double length = 0, height = 0;

    Rectangle() {
        name = "rectangle";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double perimeter() {
        return 2 * (length + height);
    }
}
