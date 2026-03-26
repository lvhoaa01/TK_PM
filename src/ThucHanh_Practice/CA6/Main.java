package ThucHanh_Practice.CA6;

public class Main {
    public static void main(String[] args) {
        // --- CHẠY CÂU 1 ---
        System.out.println(">>> KHỞI ĐỘNG GAME (LEVEL CƠ BẢN) <<<");
        PlayerData player = new PlayerData();
        Dashboard mainUI = new Dashboard("Main UI");

        player.addObserver(mainUI);

        // Game loop mô phỏng: Người chơi ăn được điểm
        player.setGrade(100);
        player.setThoiGian(59);

        // --- CHẠY CÂU 2 ---
        System.out.println("\n>>> NGƯỜI CHƠI LÊN LEVEL CAO - ÁP DỤNG DATA NÂNG CẤP <<<");
        // Chuyển sang sử dụng đối tượng mở rộng
        AdvancedPlayerData proPlayer = new AdvancedPlayerData(2, 500);
        proPlayer.setThoiGian(120);
        proPlayer.setCountdown(3);
        proPlayer.setGrade(2000);

        // Vẫn đăng ký cùng một UI cũ (Không cần tạo UI mới)
        proPlayer.addObserver(mainUI);

        // Thay đổi thông tin bổ sung, UI tự động cập nhật đầy đủ
        proPlayer.setLevel(3);
    }
}
