package ThucHanh_Practice.CA4;

import java.util.ArrayList;
import java.util.List;

class Topic {
    // Danh sách các thành viên (A và B) đang theo dõi Topic
    private List<ThanhVien> danhSachThanhVien = new ArrayList<>();

    // Nơi lưu trữ toàn bộ các tin tức do Topic tạo ra
    private List<String> danhSachTin = new ArrayList<>();

    // Các thành viên tự đăng ký hoặc hủy đăng ký
    public void dangKy(ThanhVien tv) {
        danhSachThanhVien.add(tv);
    }

    public void huyDangKy(ThanhVien tv) {
        danhSachThanhVien.remove(tv);
    }

    /**
     * Tạo thông tin mới, lưu vào danh sách và chuyển tiếp (notify) cho các thành viên.
     */
    public void taoTinMoi(String noiDung) {
        danhSachTin.add(noiDung);
        // Lấy index cuối cùng vừa được thêm vào
        int index = danhSachTin.size() - 1;

        System.out.println("\n[TOPIC] Vừa phát hành bản tin mới (Số " + index + ")");

        for (ThanhVien tv : danhSachThanhVien) {
            tv.onTinMoi(index, noiDung); // Đẩy dữ liệu (Push) cho thành viên
        }
    }

    /**
     * Cập nhật tin cũ và tự động báo cho các thành viên.
     */
    public void capNhatTin(int index, String noiDungMoi) {
        if (index >= 0 && index < danhSachTin.size()) {
            System.out.println("\n[TOPIC] Vừa cập nhật bản tin số " + index);
            danhSachTin.set(index, noiDungMoi);

            for (ThanhVien tv : danhSachThanhVien) {
                tv.onCapNhatTin(index, noiDungMoi);
            }
        } else {
            System.out.println("[TOPIC] Lỗi: Không tìm thấy tin số " + index);
        }
    }
}
