package ThucHanh_Practice.CA2;


public class Activity implements OnClickListener{
    private String name;
    private int clickCount = 0;

    private Button myButton;

    public Activity(String name){
        this.name = name;

        System.out.println("Khởi tạo: " + this.name);

        myButton = new Button("btn_submit");

        myButton.setOnClickListener(this);
    }

    @Override
    public void onClick(Button button) {
        clickCount++;
        System.out.println("Sự kiện " + this.name + ": Bạn click lần thứ " + this.clickCount + "!");
    }

    public Button getMyButton(){
        return myButton;
    }
}
