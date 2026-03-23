package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.Instance(1);
        Singleton s2 = Singleton.Instance(2);
        System.out.println(s1.getCc() + " " + s2.getCc());
    }
}
