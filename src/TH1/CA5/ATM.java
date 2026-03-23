package TH1.CA5;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    private TaiKhoan taikhoan = new TaiKhoan();
    void RutTien(double val) {
        if(taikhoan == null){
            System.out.println("Mời đưa thẻ vào!");
            return;
        }


        // Cập nhật số dư phải làm bên class TaiKhoan
        if(val <= taikhoan.KiemTraSoDu()){
            taikhoan.NhanThongBao("Số dư hợp lệ!");
            taikhoan.setSodu(taikhoan.getSodu() - val); // Fail
            taikhoan.NhanThongBao("Số dư sau rút là " + taikhoan.getSodu());
        }
        else{
            taikhoan.NhanThongBao("Số dư không hợp lệ!");
        }
    }

    public void NhanThe(TaiKhoan sub) {
        this.taikhoan = sub;
    }

    void RutThe(Sub sub) {
        this.taikhoan = null;
    }
}
