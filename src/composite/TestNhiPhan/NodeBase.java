package composite.TestNhiPhan;

public abstract class NodeBase {
    protected int value;
    public NodeBase(int value){this.value = value;}
    public abstract void themTrai(NodeBase a);
    public abstract void themPhai(NodeBase a);
    public abstract void xoaTrai();
    public abstract void xoaPhai();
    public abstract void Duyet(); // In giá trị của nút ra màn hình
}
