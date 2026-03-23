package TH1.B1;

public abstract class BieuThuc {
    abstract float giatri();
    abstract String bieuthuc();

    @Override
    public String toString() {
        return bieuthuc() + " = " + giatri();
    }
}
