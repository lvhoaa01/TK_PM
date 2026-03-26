package ThucHanh_Practice.CA6;

class Dashboard implements GameObserver {
    private String tenManHinh;

    public Dashboard(String tenManHinh) {
        this.tenManHinh = tenManHinh;
    }

    @Override
    public void update(PlayerData data) {
        System.out.println("\n=== [" + tenManHinh + "] CẬP NHẬT THÔNG TIN NHÂN VẬT ===");
        System.out.println(" - Thời gian còn lại : " + data.getThoiGian() + "s");
        System.out.println(" - Số lượt còn lại   : " + data.getCountdown());
        System.out.println(" - Điểm số (Grade)   : " + data.getGrade());

        // Kiểm tra xem dữ liệu có phải là phiên bản nâng cao (Câu 2) không để hiển thị thêm
        if (data instanceof AdvancedPlayerData) {
            AdvancedPlayerData advancedData = (AdvancedPlayerData) data;
            System.out.println("   [!] THÔNG TIN BỔ SUNG (LEVEL CAO):");
            System.out.println("   -> Level hiện tại : " + advancedData.getLevel());
            System.out.println("   -> Mức thưởng     : " + advancedData.getMucThuong());
        }
        System.out.println("================================================");
    }
}
