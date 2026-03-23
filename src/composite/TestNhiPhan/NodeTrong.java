package composite.TestNhiPhan;

public class NodeTrong extends NodeBase{
    protected NodeBase nutTrai, nutPhai;
    public NodeTrong(int value) {
        super(value);
        this.nutPhai = null;
        this.nutTrai = null;
    }

    @Override
    public void Duyet() {
        System.out.print(this.value + " ");
        nutTrai.Duyet();
        nutPhai.Duyet();
    }

    @Override
    public void themTrai(NodeBase a) {
        this.nutTrai = a;
    }

    @Override
    public void themPhai(NodeBase a) {
        this.nutPhai = a;
    }

    @Override
    public void xoaTrai() {
        this.nutTrai = null;
    }

    @Override
    public void xoaPhai() {
        this.nutPhai = null;
    }
}
