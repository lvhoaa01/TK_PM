package ThucHanh_Practice.CA4;

public class Main {
    public static void main(String[] args) {
        Topic tinCongNghe = new Topic();

        ThanhVienA a1 = new ThanhVienA("Nguyễn Văn A");
        ThanhVienB b1 = new ThanhVienB("Trần Thị B");

        // Đăng ký nhận tin
        tinCongNghe.dangKy(a1);
        tinCongNghe.dangKy(b1);

        // Kịch bản 1: Topic tạo tin mới
        tinCongNghe.taoTinMoi("Google ra mắt Gemini Pro.");
        tinCongNghe.taoTinMoi("Apple công bố iOS 18.");

        // Kịch bản 2: Topic cập nhật tin cũ
        // Tin số 0 sẽ được sửa lại nội dung
        tinCongNghe.capNhatTin(0, "Google ra mắt Gemini Pro 1.5 với 1M Token Context.");
    }
}
