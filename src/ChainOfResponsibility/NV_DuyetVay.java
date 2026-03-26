package ChainOfResponsibility;

public abstract class NV_DuyetVay {
    String ten, chucVu;
    int hanMuc;
    NV_DuyetVay capTren;
    public NV_DuyetVay(String ten, String chucVu, int hanMuc) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMuc = hanMuc;
    }

    NV_DuyetVay capTren(NV_DuyetVay capTren){
        this.capTren = capTren;
        return this;
    }
    abstract void duyetVay(int soTien);
}
