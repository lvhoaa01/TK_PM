package ThucHanh_Practice.CA2;

public class Button {
    private String id;
    private OnClickListener listener;
    public Button(String id) {
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    public void click(){
        System.out.println("User vừa chạm nút " + this.id + ".");
        if(listener != null){
            listener.onClick(this);
        }else {
            System.out.println("Nút này chưa được gán sự kiện.");
        }
    }
}
