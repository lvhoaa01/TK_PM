package TH1.B1;

public class Chia extends BieuThucDecorator{
    private float toanhang;
    public Chia(BieuThuc bieuThuc, float toanhang){
        super(bieuThuc);
        this.toanhang = toanhang;
    }

    @Override
    String bieuthuc() {
        return "(" + bieuThuc.bieuthuc() + "*" + toanhang + ")";
    }

    @Override
    float giatri() {
        return bieuThuc.giatri()/toanhang;
    }
}
