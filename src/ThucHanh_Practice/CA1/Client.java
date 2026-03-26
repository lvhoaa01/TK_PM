package ThucHanh_Practice.CA1;

import java.util.List;

public class Client implements Listener<List<MonHoc>>{
    private String tenClient;

    public Client(String tenClient){
        this.tenClient = tenClient;
    }

    @Override
    public void onEvent(List<MonHoc> data) {
        System.out.println("Màn hình " + tenClient + "tự động cập nhật:");
        for(MonHoc mh : data){
            System.out.println("   " + mh.toString());
        }
        System.out.println("-----------------");
    }
}
