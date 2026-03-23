package composite.TestNhiPhan;

public class Main {
    public static void main(String[] args) {
        NodeBase nut1 = new NodeTrong(10);
        NodeBase nut2 = new NodeTrong(8);
        NodeBase nut3 = new NodeTrong(12);
        NodeBase nut4 = new NodeLeaf(6);
        NodeBase nut5 = new NodeLeaf(7);
        NodeBase nut6 = new NodeLeaf(11);
        NodeBase nut7 = new NodeLeaf(13);
        nut1.themPhai(nut3);
        nut1.themTrai(nut2);
        nut2.themPhai(nut5);
        nut2.themTrai(nut4);
        nut3.themPhai(nut7);
        nut3.themTrai(nut6);

        nut1.Duyet();
    }
}
