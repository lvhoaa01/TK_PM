package TH1.A1;

public class HoaDonHeader {
    String MaHD, TenKH, NgayBan;

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
