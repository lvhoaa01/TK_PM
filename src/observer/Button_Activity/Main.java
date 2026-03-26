package observer.Button_Activity;

public class Main {
    public static void main(String[] args) {
        Button btn = new Button();
        Activity s1 = new Activity("submit");

        btn.attach(s1);
        btn.click();
        btn.click();
    }
}
