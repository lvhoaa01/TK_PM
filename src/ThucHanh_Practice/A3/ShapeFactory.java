package ThucHanh_Practice.A3;

public class ShapeFactory {
    public Shape createShape(ShapType shapType) throws IllegalAccessException {
        if(shapType == null){
            return null;
        }

        switch (shapType){
            case CIRCLE -> {
                return Circle.getInstance();
            }
            case TRIANGLE -> {
                return Triangle.getInstance();
            }
            case RECTANGLE -> {
                return Retangle.getInstance();
            }
            default -> throw new IllegalAccessException("Loại hình vẽ khoong được hỗ trợ!");
        }
    }
}
