package ThucHanh_Practice.A1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHeader header;
    private List<CTHD> chiTietHoaDon;

    private HoaDon(Buider buider){
        this.header = buider.header;
        this.chiTietHoaDon = buider.chiTietHoaDon;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "header=" + header +
                ", chiTietHoaDon=" + chiTietHoaDon +
                '}';
    }

    public static class Buider{
        private HoaDonHeader header;
        private List<CTHD> chiTietHoaDon = new ArrayList<>();

        public Buider setHeader(String maHoaDon, String ngayBan, String tenKhachHang){
            this.header = new HoaDonHeader(maHoaDon, ngayBan, tenKhachHang);
            return this;
        }

        public Buider themCTHD(String sanPham, int soLuong, double donGia, double chietKhau){
            this.chiTietHoaDon.add(new CTHD(sanPham, soLuong, donGia, chietKhau));
            return this;
        }

        public HoaDon build(){return new HoaDon(this);};
    }
}
