package ThucHanh_Practice.CA4;

public class ThanhVienA implements ThanhVien{
    private String ten;

    public ThanhVienA(String ten){this.ten = ten;}

    @Override
    public void onTinMoi(int index, String tinNoiDung) {
        System.out.println("Thành viên A " + ten + ": Tin mới -> " + tinNoiDung);
    }

    @Override
    public void onCapNhatTin(int index, String tinMoiNoiDung) {
        System.out.println("Thành viên A " + ten + ": Cập nhật tin mới -> " + tinMoiNoiDung);
    }
}
