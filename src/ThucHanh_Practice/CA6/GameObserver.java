package ThucHanh_Practice.CA6;

public interface GameObserver {
    // GÓC PHÂN TÍCH CHO CÂU 2: GIẢI QUYẾT VẤN ĐỀ MỞ RỘNG DỮ LIỆU
    // Thay vì dùng Push Model truyền từng tham số: update(int thoiGian, int countdown, int grade)
    // Nếu dùng Push Model, khi thêm 'level' ở level cao, ta phải sửa lại toàn bộ Interface -> Vi phạm Open/Closed Principle.
    // -> GIẢI PHÁP: Sử dụng PULL MODEL. Truyền toàn bộ đối tượng PlayerData vào hàm.
    // Khi PlayerData có thêm thuộc tính mới, Interface này vẫn GIỮ NGUYÊN KHÔNG ĐỔI.
    void update(PlayerData data);
}
