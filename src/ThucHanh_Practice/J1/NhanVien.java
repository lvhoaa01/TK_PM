package ThucHanh_Practice.J1;

public class NhanVien {
    private String ten;
    private int tuoi;
    private String diachi;
    private double tienluong;
    private int tongSoGioLien;

    public NhanVien() {
        this.ten = "";
        this.tuoi = 0;
        this.diachi = "";
        this.tienluong = 0;
        this.tongSoGioLien = 0;
    }

    public NhanVien(int tongSoGioLien, double tienluong, String diachi, int tuoi, String ten) {
        this.tongSoGioLien = tongSoGioLien;
        this.tienluong = tienluong;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getTongSoGioLien() {
        return tongSoGioLien;
    }

    public void setTongSoGioLien(int tongSoGioLien) {
        this.tongSoGioLien = tongSoGioLien;
    }

    public double tinhThuong(){
        if(this.tongSoGioLien >= 200){
            return this.tienluong * 0.2;
        } else if (this.tongSoGioLien >= 100) {
            return this.tienluong * 0.1;
        }else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diachi='" + diachi + '\'' +
                ", tienluong=" + tienluong +
                ", tongSoGioLien=" + tongSoGioLien +
                '}';
    }
}
