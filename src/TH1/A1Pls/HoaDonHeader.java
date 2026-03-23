package TH1.A1Pls;

public class HoaDonHeader {
    String MaHD, TenKH, NgayBan;

    public HoaDonHeader() {
        MaHD = "";
        TenKH = "";
        NgayBan = "";
    }

    public HoaDonHeader(String maHD, String tenKH, String ngayBan) {
        MaHD = maHD;
        TenKH = tenKH;
        NgayBan = ngayBan;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String maHD) {
        MaHD = maHD;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String tenKH) {
        TenKH = tenKH;
    }

    public String getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(String ngayBan) {
        NgayBan = ngayBan;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "MaHD='" + MaHD + '\'' +
                ", TenKH='" + TenKH + '\'' +
                ", NgayBan='" + NgayBan + '\'' +
                '}';
    }
}
