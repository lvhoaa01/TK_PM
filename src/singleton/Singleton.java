package singleton;

public class Singleton {
    private static Singleton instance;
    private int cc;

    public int getCc() {
        return cc;
    }

    protected Singleton(int cc){
        this.cc = cc;
    }

    public static Singleton Instance(int cc){
        if(instance == null){
            instance = new Singleton(cc);
        }
        return instance;
    }
}
