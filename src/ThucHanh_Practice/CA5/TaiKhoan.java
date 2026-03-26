package ThucHanh_Practice.CA5;

class TaiKhoan implements IObserverTaiKhoan {
    private String tenChuTaiKhoan;
    private double soDu;

    public TaiKhoan(String tenChuTaiKhoan, double soDuBanDau) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDuBanDau;
    }

    /**
     * ATM sẽ gọi hàm này ĐẦU TIÊN để kiểm tra tính hợp lệ.
     */
    @Override
    public boolean kiemTraSoDu(double soTienCanRut) {
        System.out.println("   [Hệ thống Tài khoản] Đang kiểm tra số dư cho giao dịch: " + soTienCanRut);
        return this.soDu >= soTienCanRut;
    }

    /**
     * ATM sẽ gọi hàm này THỨ HAI để báo cáo kết quả.
     * Ở đây, Tài khoản sẽ TỰ TÍNH TOÁN lại số dư thay vì để ATM tính hộ.
     * Đây là điểm mấu chốt của tính Đóng gói (Encapsulation) và Observer Pattern.
     */
    @Override
    public void nhanThongBao(boolean ketQua, double soTienGiaoDich, String loiNhan) {
        System.out.println("--------------------------------------------------");
        System.out.println("[Tài khoản: " + tenChuTaiKhoan + "] BẢN TIN TỪ ATM: " + loiNhan);

        if (ketQua) {
            // Nếu giao dịch hợp lệ, tiến hành trừ tiền
            this.soDu -= soTienGiaoDich;
            System.out.println("   -> Giao dịch THÀNH CÔNG. Số dư bị trừ: " + soTienGiaoDich);
        } else {
            System.out.println("   -> Giao dịch THẤT BẠI. Không trừ tiền.");
        }

        System.out.println("   -> SỐ DƯ HIỆN TẠI: " + this.soDu + " VND");
        System.out.println("--------------------------------------------------\n");
    }
}
