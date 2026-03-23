package composite.TestNhiPhan;

public class NodeLeaf extends NodeBase{
    public NodeLeaf(int value) {
        super(value);
    }

    @Override
    public void Duyet() {
        System.out.print(this.value + " ");
    }

    @Override
    public void themTrai(NodeBase a) {

    }

    @Override
    public void themPhai(NodeBase a) {

    }

    @Override
    public void xoaTrai() {

    }

    @Override
    public void xoaPhai() {

    }
}
