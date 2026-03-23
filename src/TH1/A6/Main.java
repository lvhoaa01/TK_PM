package TH1.A6;

public class Main {
    public static void main(String[] args) {
        dataAccess ui1 = dataAccess.getInstance();
        dataAccess ui2 = dataAccess.getInstance();

        ui1.add(new SanPham(50000, 12, "BanhChuoi", "BC"));
        ui2.add(new SanPham(12000, 13, "BanhBeo", "BB"));

        dataAccess.getInstance().inDS();
    }
}
