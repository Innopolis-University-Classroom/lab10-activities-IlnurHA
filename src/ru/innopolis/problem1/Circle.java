package src.ru.innopolis.problem1;

class Circle extends Shape {
    private double radius = 0;

    Circle() {
        name = "circle";
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }
}