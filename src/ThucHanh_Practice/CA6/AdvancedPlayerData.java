package ThucHanh_Practice.CA6;

class AdvancedPlayerData extends PlayerData {
    // Các thông tin bổ sung khi lên level cao
    private int level;
    private int mucThuong;

    public AdvancedPlayerData(int level, int mucThuong) {
        this.level = level;
        this.mucThuong = mucThuong;
    }

    public void setLevel(int level) {
        this.level = level;
        notifyObservers(); // Vẫn tận dụng lại cơ chế notify của lớp cha
    }

    public void setMucThuong(int mucThuong) {
        this.mucThuong = mucThuong;
        notifyObservers();
    }

    public int getLevel() { return level; }
    public int getMucThuong() { return mucThuong; }
}
