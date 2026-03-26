package ThucHanh_Practice.CA3;

public class NhaDauTuA implements NhaDauTu{
    private String ten;

    public NhaDauTuA(String ten){this.ten = ten;}

    @Override
    public void CapNhatTiGia(double tiGiaMoi) {
        System.out.println("Nhà đầu tư " + ten + " nhận tỉ giá mới : " + tiGiaMoi);
        if(tiGiaMoi <= 24000){
            System.out.println("MUA!");
        } else if (tiGiaMoi >= 25000) {
            System.out.println("BÁN!");
        }else System.out.println("Tiếp tục quan sát!");
    }
}
