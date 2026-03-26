package ChainOfResponsibility;

public class NhanVienChoVay extends NV_DuyetVay{
    public NhanVienChoVay(String ten, String chucVu, int hanMuc) {
        super(ten, chucVu, hanMuc);
    }

    @Override
    void duyetVay(int soTien) {
        if(soTien <= hanMuc)
            System.out.println(this.chucVu + " " + this.ten);
        else if (capTren != null){
            System.out.println("Không đủ quyền !");
            capTren.duyetVay(soTien);
        }
    }

}
