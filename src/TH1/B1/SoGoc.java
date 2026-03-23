package TH1.B1;

public class SoGoc extends BieuThuc {
    private float toanhang;
    public SoGoc(float toanhang){this.toanhang = toanhang;}
    @Override
    float giatri() {
        return toanhang;
    }

    @Override
    String bieuthuc() {
        return String.valueOf(toanhang);
    }
}
