package ThucHanh_Practice.CA5;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo máy ATM
        ATM atm = new ATM();

        // 2. Tạo một tài khoản với số dư 5.000.000 VND
        TaiKhoan taiKhoanCuaHoa = new TaiKhoan("Hòa", 5000000);

        // 3. Đút thẻ vào máy (Đăng ký Observer)
        atm.duaTheVao(taiKhoanCuaHoa);

        // 4. Kịch bản 1: Rút hợp lệ
        atm.rutTien(2000000);

        // 5. Kịch bản 2: Rút quá số dư (còn 3tr nhưng đòi rút 4tr)
        atm.rutTien(4000000);

        // 6. Rút thẻ ra
        atm.rutTheRa();
    }
}
