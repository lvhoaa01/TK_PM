package TH1.B3;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileComponent{
    protected List<FileComponent> children = new ArrayList<>();
    public Folder(String name, String date){
        super(name, date);
    }

    @Override
    public void addItem(FileComponent component) {
        //Thêm bẫy file cùng tên --> Không thêm
        component.setParent(this);
        children.add(component);
    }

    @Override
    public void removeItem(FileComponent component) {
        //Thêm bẫy không tồn tại --> Thông báo không tồn tại
        component.setParent(null);
        children.remove(component);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(prefix);
//        builder.append(ex).append(name).append("\n");
        builder.append(this.name);
        for(var file : children){
//            file.prefix =
//            builder.append("\n").append(file.getStringTreeFolder());
        }
        return builder.toString();
    }
}
