package ThucHanh_Practice.CA3;

public class Main {
    public static void main(String[] args) {
        DichVuTiGia dichVu = new DichVuTiGia();

        NhaDauTuA s1 = new NhaDauTuA("Lê Văn Hòa");
        NhaDauTuB s2 = new NhaDauTuB("Đại Lư");

        dichVu.DangKy(s1);
        dichVu.DangKy(s2);

        dichVu.setTiGia(23500);
    }
}
