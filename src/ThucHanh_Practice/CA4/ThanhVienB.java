package ThucHanh_Practice.CA4;

import java.util.HashMap;
import java.util.Map;

class ThanhVienB implements ThanhVien {
    private String ten;

    // GÓC PHÂN TÍCH: Tại sao dùng Map (HashMap) thay vì List (ArrayList) ở đây?
    // Giả sử Thành viên B đăng ký trễ (sau khi Topic đã tạo 5 tin).
    // Nếu dùng List, việc add() vào sẽ làm sai lệch index gốc của Topic.
    // Dùng Map với Key là 'index của Topic' và Value là 'nội dung' sẽ đảm bảo tính đồng nhất vị trí dữ liệu,
    // tránh lỗi IndexOutOfBoundsException khi cập nhật.
    private Map<Integer, String> lichSuTinNhan = new HashMap<>();

    public ThanhVienB(String ten) {
        this.ten = ten;
    }

    @Override
    public void onTinMoi(int index, String tinNoiDung) {
        // Lưu tin mới vào bộ nhớ riêng
        lichSuTinNhan.put(index, tinNoiDung);

        System.out.println("\n[Thành Viên B - " + ten + "] NHẬN TIN MỚI VÀ TỔNG HỢP DANH SÁCH:");
        // In toàn bộ tin đã nhận kèm số thứ tự
        for (Map.Entry<Integer, String> entry : lichSuTinNhan.entrySet()) {
            System.out.println("   -> Tin số " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("--------------------------------------------------");
    }

    @Override
    public void onCapNhatTin(int index, String tinMoiNoiDung) {
        // Kiểm tra xem tin này có tồn tại trong bộ nhớ của B không rồi mới cập nhật
        if (lichSuTinNhan.containsKey(index)) {
            lichSuTinNhan.put(index, tinMoiNoiDung);
            System.out.println("[Thành Viên B - " + ten + "] ĐÃ CẬP NHẬT TRONG LỊCH SỬ. Tin số [" + index + "] thành: " + tinMoiNoiDung);
        }
    }
}
