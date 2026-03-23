package TH1.B1;

public class Nhan extends BieuThucDecorator{
    private float toanhang;
    public Nhan(BieuThuc bieuthuc, float toanhang){
        super(bieuthuc);
        this.toanhang = toanhang;
    }

    @Override
    String bieuthuc() {
        return "(" + bieuThuc.bieuthuc() + "*" + toanhang + ")";
    }

    @Override
    float giatri() {
        return bieuThuc.giatri()*toanhang;
    }
}
