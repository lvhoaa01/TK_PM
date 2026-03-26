package ChainOfResponsibility;

public class ChuTich extends NV_DuyetVay{

    public ChuTich(String ten, String chucVu, int hanMuc) {
        super(ten, chucVu, hanMuc);
    }


    @Override
    void duyetVay(int soTien) {
        if(soTien <= hanMuc)
            System.out.println(this.chucVu + " " + this.ten);
        else System.out.println("Từ chối khoản vay!");
    }
}
