package TH1.CA5;

public class Main {
    public static void main(String[] args) {
        TaiKhoan t1 = new TaiKhoan(77);
        TaiKhoan t2 = new TaiKhoan(33);
        ATM atm = new ATM();
        atm.NhanThe(t1);
        atm.RutTien(33);
        atm.NhanThe(t2);
        atm.RutTien(44);
    }
}
