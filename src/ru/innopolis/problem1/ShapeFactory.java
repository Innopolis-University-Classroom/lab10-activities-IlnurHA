package src.ru.innopolis.problem1;

public class ShapeFactory {
    Shape createShape(String shapeName) throws Exception {
        switch (shapeName) {
            case "circle" -> {
                return new Circle();
            }
            case "square" -> {
                return new Square();
            }
            case "rectangle" -> {
                return new Rectangle();
            }
            default -> throw new Exception("No such shape");
        }
    }
}
