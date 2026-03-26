package ThucHanh_Practice.CA1;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance;

    private List<MonHoc> danhSachMonHoc;

    private Stream<List<MonHoc>> stream;

    private DataAccess(){
        this.danhSachMonHoc = new ArrayList<>();
        this.stream = new Stream<>();
    }

    public static DataAccess getInstance(){
        if(instance == null){
            instance = new DataAccess();
        }
        return instance;
    }

    public Stream<List<MonHoc>> getStream(){
        return stream;
    }

    public void addMonHoc(MonHoc mh){
        danhSachMonHoc.add(mh);
        stream.addEvent(new ArrayList<>(danhSachMonHoc));
    }

    public void updateMonHoc(int index, MonHoc mh){
        if(index >= 0 && index < danhSachMonHoc.size()){
            danhSachMonHoc.set(index, mh);
            stream.addEvent(new ArrayList<>(danhSachMonHoc));
        }
    }

    public void deleteMonHoc(int index){
        if(index >= 0 && index < danhSachMonHoc.size()){
            danhSachMonHoc.remove(index);
            stream.addEvent(new ArrayList<>(danhSachMonHoc));
        }
    }
}
