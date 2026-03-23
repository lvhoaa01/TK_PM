package composite;

public class Main {
    public static void main(String[] args) {
        Graphic c1 = new Circle("Blue");
        Graphic c2 = new Circle("Red");

        CompoundGraphic ds = new CompoundGraphic();
        ds.add(c1);
        ds.add(c2);

        CompoundGraphic Bds = new CompoundGraphic();
        Bds.add(c2);
        Bds.add(ds);


        Bds.draw();
    }
}
