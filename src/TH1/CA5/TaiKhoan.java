package TH1.CA5;

public class TaiKhoan implements Sub{
    private double sodu;
    public TaiKhoan(){}
    public TaiKhoan(double sodu){this.sodu = sodu;}

    public double getSodu() {
        return sodu;
    }

    public void setSodu(double sodu) {
        this.sodu = sodu;
    }

    @Override
    public double KiemTraSoDu() {
        return this.sodu;
    }

    @Override
    public void NhanThongBao(String mes) {
        System.out.println(mes);
    }
}
// Kiểm tra số dư : Đảm bảo số dư sau khi rút lớn hơn hoặc bằng 50
// void NhanThongBao(doble sotien, boolean thanhcong) : cho biết rút thành công không thì cập nhật số dư