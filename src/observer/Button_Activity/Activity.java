package observer.Button_Activity;

public class Activity implements ButtonClickListener{
    private String name;
    public Activity(String name){this.name = name;}


    @Override
    public void onClick(int clickButton) {
        System.out.println("Bạn click lần thứ " + clickButton +" !");
    }
}
