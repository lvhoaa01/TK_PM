package ThucHanh_Practice.CA2;

public class Main {
    public static void main(String[] args) {
        Activity mainActivity = new Activity("Main");
        Button btn = mainActivity.getMyButton();

        btn.click();
        btn.click();
        btn.click();
    }
}
