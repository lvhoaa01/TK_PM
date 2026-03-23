package TH1.A1;

import creational.builder.Computer;

import java.util.Date;

public class HoaDon {
    CTHD cthd1;
    HoaDonHeader hdhd;
    public HoaDon(Buider buider){
        cthd1 = buider.cthd1;
        hdhd = buider.hdhd;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "cthd1=" + cthd1 +
                ", hdhd=" + hdhd +
                '}';
    }



    public static class Buider{
        public CTHD cthd1 = new CTHD();
        public HoaDonHeader hdhd = new HoaDonHeader();

        public Buider(){

        }

        public Buider builderCTHD(String SanPham, int SoLuong, double DonGia, double ChietKhau){
            this.cthd1.SoLuong = SoLuong;
            this.cthd1.DonGia = DonGia;
            this.cthd1.ChietKhau = ChietKhau;
            this.cthd1.SanPham = SanPham;
            return this;
        }

        public Buider buiderHoaDonHeader(String MaHD, String TenHD, String NgayBan){
            this.hdhd.MaHD = MaHD;
            this.hdhd.TenKH = TenHD;
            this.hdhd.NgayBan = NgayBan;
            return this;
        }

        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
