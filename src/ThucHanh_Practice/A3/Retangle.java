package ThucHanh_Practice.A3;

public class Retangle extends Shape{
    private static Retangle instance;

    private Retangle(){}

    public static Retangle getInstance(){
        if(instance == null){
            instance = new Retangle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Đang vẽ hình chữ nhật !";
    }
}
