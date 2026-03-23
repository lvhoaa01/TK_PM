package TH1.A1Pls;

public class Main {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .buiderHeader("HD001", "01/11/2005", "LeVanHoa")
                .builderCTHD("NhanCuoi", 1, 20000000, 0.2)
                .build();

        System.out.println(hoaDon);
    }
}
