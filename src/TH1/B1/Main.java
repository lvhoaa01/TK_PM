package TH1.B1;

public class Main {
    public static void main(String[] args) {
        BieuThuc sogoc = new SoGoc(6);
        BieuThuc a1 = new Cong(sogoc, 9);
        BieuThuc a2 = new Nhan(a1, 5);
        System.out.print("BT1 : ");
        System.out.println(a2);
        BieuThuc sogoc1 = new SoGoc(8);
        BieuThuc b1 = new Cong(sogoc1, 6);
        BieuThuc b2 = new Chia(b1, 2);
        BieuThuc b3 = new Nhan(b2, 5);
        BieuThuc b4 = new Cong(b3, 8);
        BieuThuc b5 = new Tru(b4, 4);
        System.out.print("BT2 : ");
        System.out.println(b5);

    }
}
