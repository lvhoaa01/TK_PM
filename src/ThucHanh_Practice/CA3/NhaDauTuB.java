package ThucHanh_Practice.CA3;

public class NhaDauTuB implements NhaDauTu{
    private String ten;

    public NhaDauTuB(String ten){this.ten = ten;}

    @Override
    public void CapNhatTiGia(double tiGiaMoi) {
        System.out.println("Nhà đầu tư " + ten + " nhận tỉ giá mới : " + tiGiaMoi);
        if(tiGiaMoi < 23500){
            System.out.println("MUA lớn!");
        }else System.out.println("Giữ nguyên, quan sát tiếp!");
    }
}
