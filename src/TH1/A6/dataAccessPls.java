package TH1.A6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dataAccessPls {
    private static Map<String, dataAccessPls> instance = new HashMap();
    List<SanPham> dsach = new ArrayList<>();
    private dataAccessPls(){
    }
    public static dataAccessPls getInstance(String tag){
        if(instance.get(tag) == null){
            instance.put(tag, new dataAccessPls());
        }
        return instance.get(tag);
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
