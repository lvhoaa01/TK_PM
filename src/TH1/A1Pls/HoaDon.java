package TH1.A1Pls;


import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header;
    List<CTHD> cthds;

    protected HoaDon(Builder b){
        this.header = b.header;
        this.cthds = b.cthds;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "header=" + header +
                ", cthds=" + cthds +
                '}';
    }

    public static class Builder{
        HoaDonHeader header;
        List<CTHD> cthds = new ArrayList<>();
        public Builder buiderHeader(String MaHD, String ngayBan, String TenKH){
            header = new HoaDonHeader(MaHD, ngayBan, TenKH);
            return this;
        }

        public Builder builderCTHD(String SanPham, int SoLuong, double DonGia, double ChietKhau){
            CTHD cthd = new CTHD(SanPham, SoLuong, DonGia, ChietKhau);
            cthds.add(cthd);
            return this;
        }

        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
