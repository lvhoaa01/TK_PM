package abstract_method;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle("red", 3.2);
        Shape s2 = new Rectangle("blue", 3, 2);

        s1.print();
        System.out.println("Area = " + s1.area());
        s2.print();
        System.out.println("Area = " + s2.area());
    }
}
