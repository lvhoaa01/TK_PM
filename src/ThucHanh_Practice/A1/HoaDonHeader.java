package ThucHanh_Practice.A1;

public class HoaDonHeader {
    private String maHoaDon;
    private String ngayBan;
    private String tenKhachHang;

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", ngayBan='" + ngayBan + '\'' +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                '}';
    }
}
