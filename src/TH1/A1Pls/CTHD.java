package TH1.A1Pls;

public class CTHD {
    String SanPham;
    int SoLuong;
    double DonGia, ChietKhau;

    public CTHD() {
        SanPham = "";
        SoLuong = 0;
        DonGia = 0;
        ChietKhau = 0;
    }

    public CTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
        SanPham = sanPham;
        SoLuong = soLuong;
        DonGia = donGia;
        ChietKhau = chietKhau;
    }

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
