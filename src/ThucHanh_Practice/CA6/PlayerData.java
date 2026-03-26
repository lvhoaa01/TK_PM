package ThucHanh_Practice.CA6;

import java.util.ArrayList;
import java.util.List;

class PlayerData {
    // Danh sách các màn hình (Dashboard) đang theo dõi dữ liệu này
    private List<GameObserver> observers = new ArrayList<>();

    // Các thuộc tính cơ bản của trò chơi (Câu 1)
    protected int thoiGian;
    protected int countdown;
    protected int grade;

    public void addObserver(GameObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(GameObserver observer) {
        observers.remove(observer);
    }

    /**
     * Hàm notify kích hoạt cập nhật.
     * Áp dụng Pull Model: Truyền chính đối tượng này (this) đi.
     */
    protected void notifyObservers() {
        for (GameObserver obs : observers) {
            obs.update(this);
        }
    }

    // Các hàm Setters: Mỗi khi game thay đổi chỉ số, tự động gọi notify.
    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        notifyObservers();
    }

    public void setCountdown(int countdown) {
        this.countdown = countdown;
        notifyObservers();
    }

    public void setGrade(int grade) {
        this.grade = grade;
        notifyObservers();
    }

    // Getters để Dashboard có thể "Kéo" (Pull) dữ liệu ra
    public int getThoiGian() { return thoiGian; }
    public int getCountdown() { return countdown; }
    public int getGrade() { return grade; }
}
