package TH1.A6;

public class MainPls {
    public static void main(String[] args) {
        dataAccessPls ui1 = dataAccessPls.getInstance("Hòa");
        dataAccessPls ui2 = dataAccessPls.getInstance("Hòa1");
        dataAccessPls ui3 = dataAccessPls.getInstance("Hòa2");
        ui1.add(new SanPham(50000, 12, "BanhChuoi", "BC"));
        ui1.add(new SanPham(50000, 12, "BanhChuoi", "BC1"));
        ui2.add(new SanPham(12000, 13, "BanhBeo", "BB"));
        ui2.add(new SanPham(12000, 13, "BanhBeo", "BB1"));
        System.out.println("UI1");
        ui1.inDS();
        System.out.println("UI2");
        ui2.inDS();

    }
}
