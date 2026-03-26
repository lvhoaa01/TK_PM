package ThucHanh_Practice.A1;

public class Main {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Buider()
                .setHeader("HD001", "01/11/05", "Lê Văn Hòa")
                .themCTHD("DellPrecision", 1, 1000000000, 0.2)
                .build();

        System.out.println(hoaDon);
    }
}
