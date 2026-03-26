package ThucHanh_Practice.CA5;

class ATM {
    // Lưu trữ thẻ/tài khoản đang được đút vào máy (Gắn kết Observer)
    // GÓC PHÂN TÍCH: Ở đây ATM không dùng List<IObserverTaiKhoan> vì tại một thời điểm,
    // một máy ATM vật lý chỉ phục vụ 1 thẻ. Tuy nhiên logic Observer (Callback) vẫn được giữ nguyên.
    private IObserverTaiKhoan taiKhoanHienTai;

    // Mô phỏng hành động đút thẻ vào máy
    public void duaTheVao(IObserverTaiKhoan the) {
        this.taiKhoanHienTai = the;
        System.out.println("[ATM] Đã nhận thẻ. Sẵn sàng giao dịch.");
    }

    // Mô phỏng hành động rút thẻ
    public void rutTheRa() {
        this.taiKhoanHienTai = null;
        System.out.println("[ATM] Đã đẩy thẻ ra. Hẹn gặp lại!");
    }

    /**
     * Hành vi cốt lõi của ATM: Rút tiền
     */
    public void rutTien(double soTien) {
        if (taiKhoanHienTai == null) {
            System.out.println("[ATM] Vui lòng đút thẻ vào trước khi giao dịch!");
            return;
        }

        System.out.println("\n[ATM] Yêu cầu rút " + soTien + " VND đang được xử lý...");

        // Bước 1: Hỏi Observer xem có đủ điều kiện không
        boolean hopLe = taiKhoanHienTai.kiemTraSoDu(soTien);

        // Bước 2: Phản hồi lại cho Observer tùy theo kết quả
        if (hopLe) {
            System.out.println("[ATM] Máy đang nhả tiền phạch phạch phạch... Xong!");
            // Đẩy thông báo thành công cho Tài khoản để nó tự trừ tiền
            taiKhoanHienTai.nhanThongBao(true, soTien, "Bạn vừa rút tiền mặt tại cây ATM.");
        } else {
            System.out.println("[ATM] Lỗi: Tài khoản từ chối giao dịch do không đủ số dư.");
            // Đẩy thông báo thất bại
            taiKhoanHienTai.nhanThongBao(false, soTien, "Giao dịch rút tiền không thành công do số dư không đủ.");
        }
    }
}
