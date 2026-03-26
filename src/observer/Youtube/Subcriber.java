package observer.Youtube;

public class Subcriber implements Observer{
    private String name;

    public Subcriber(String name){this.name = name;}
    @Override
    public void update(String videoTitle) {
        System.out.println("Xin chào " + this.name + ", kênh bạn theo dõi vừa ra video mới: " + videoTitle);
    }
}
