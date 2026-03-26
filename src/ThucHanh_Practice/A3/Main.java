package ThucHanh_Practice.A3;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.createShape(ShapType.TRIANGLE);
        System.out.println(shape1.draw());
    }
}
