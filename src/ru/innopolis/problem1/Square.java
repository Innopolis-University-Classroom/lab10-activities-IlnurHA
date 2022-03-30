package src.ru.innopolis.problem1;

public class Square extends Shape {
    private double side;

    Square() {
        name = "square";
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
