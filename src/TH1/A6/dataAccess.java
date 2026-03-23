package TH1.A6;

import java.util.ArrayList;
import java.util.List;

public class dataAccess {
    private static dataAccess instance;
    List<SanPham> dsach = new ArrayList<>();
    private dataAccess(){
    }
    public static dataAccess getInstance(){
        if(instance == null){
            instance = new dataAccess();
        }
        return instance;
    }

    public void add(SanPham sp){
        dsach.add(sp);
    }

    public void inDS(){
        for(var sp : dsach){
            System.out.println(sp);
        }
    }

}
