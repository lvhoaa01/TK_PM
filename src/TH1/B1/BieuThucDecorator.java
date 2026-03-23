package TH1.B1;

public abstract class BieuThucDecorator extends BieuThuc{
    protected BieuThuc bieuThuc;

    public BieuThucDecorator(BieuThuc bieuThuc){
        this.bieuThuc = bieuThuc;
    }
}
