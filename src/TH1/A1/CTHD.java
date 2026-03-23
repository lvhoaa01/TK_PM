package TH1.A1;

public class CTHD {
    String SanPham;
    int SoLuong;
    double DonGia, ChietKhau;

    public String getSanPham() {
        return SanPham;
    }

    public void setSanPham(String sanPham) {
        SanPham = sanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double donGia) {
        DonGia = donGia;
    }

    public double getChietKhau() {
        return ChietKhau;
    }

    public void setChietKhau(double chietKhau) {
        ChietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "SanPham='" + SanPham + '\'' +
                ", SoLuong=" + SoLuong +
                ", DonGia=" + DonGia +
                ", ChietKhau=" + ChietKhau +
                '}';
    }
}
