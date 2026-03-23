package TH1.B1;

public class Tru extends BieuThucDecorator{
    private float toanhang;
    public Tru(BieuThuc bieuThuc, float toanhang){
        super(bieuThuc);
        this.toanhang = toanhang;
    }

    @Override
    String bieuthuc() {
        return "(" + bieuThuc.bieuthuc() + "-" + toanhang + ")";
    }

    @Override
    float giatri() {
        return bieuThuc.giatri() - toanhang;
    }
}
