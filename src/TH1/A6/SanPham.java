package TH1.A6;

public class SanPham {
    String MaSP, TenSP;
    int SoLuong;
    double DonGia;
    public SanPham(double donGia, int soLuong, String tenSP, String maSP) {
        DonGia = donGia;
        SoLuong = soLuong;
        TenSP = tenSP;
        MaSP = maSP;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String maSP) {
        MaSP = maSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
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

    @Override
    public String toString(){
        return "MaSP: " + MaSP + ", TenSP: " + TenSP + ", SoLuong: " + SoLuong + ", DonGia: " + DonGia + "!";
    }
}
