package ThucHanh_Practice.CA3;

import java.util.ArrayList;
import java.util.List;

public class DichVuTiGia {
    private List<NhaDauTu> danhSachNhaDauTu = new ArrayList<>();

    private double tiGiaHienTai;

    public void DangKy(NhaDauTu ndt){
        danhSachNhaDauTu.add(ndt);
    }

    public void huyDangKy(NhaDauTu ndt){
        danhSachNhaDauTu.remove(ndt);
    }

    public void setTiGia(double tiGiaMoi){
        this.tiGiaHienTai = tiGiaMoi;
        thongBaoNhaDauTu();
    }

    public void thongBaoNhaDauTu(){
        for(NhaDauTu ndt : danhSachNhaDauTu){
            ndt.CapNhatTiGia(this.tiGiaHienTai);
        }
    }
}
