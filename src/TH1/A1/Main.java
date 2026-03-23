package TH1.A1;

public class Main {
    public static void main(String[] args) {
        HoaDon hd1 = new HoaDon.Buider()
                .buiderHoaDonHeader("71", "Chuối", "01/11")
                .builderCTHD("Chuối", 21, 98.12, 0.12)
                .build();
        System.out.println(hd1.hdhd);
        System.out.println(hd1.cthd1);
    }
}
