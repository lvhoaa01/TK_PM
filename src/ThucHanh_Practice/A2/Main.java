package ThucHanh_Practice.A2;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder("Bắt đầu: ");

        builder.addString("Giá trị của Pi xấp xỉ là ")
                .addFloat(3.14f)
                .addString(".")
                .addBool(false);

        String kq = builder.toString();
        System.out.println(kq);
    }
}
