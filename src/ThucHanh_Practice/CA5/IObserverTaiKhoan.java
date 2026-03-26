package ThucHanh_Practice.CA5;

interface IObserverTaiKhoan {
    // Phương thức để ATM truy vấn xem có đủ tiền rút không
    boolean kiemTraSoDu(double soTienCanRut);

    // Phương thức để ATM "phát sóng" (thông báo) kết quả giao dịch về cho tài khoản
    void nhanThongBao(boolean ketQua, double soTienGiaoDich, String loiNhan);
}
