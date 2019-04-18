package main.weekOne;

public class AccessShapeGenerator {
    public static void main(String[] args) {

        Rectangle rectangle = ShapesGenerator.generateRectangle();
        Square square = ShapesGenerator.generateSquare();

        System.out.println(rectangle.getHeight() + "=" + rectangle.getWidth());
    }
}
