package TH1.B3;

public class FileItem extends FileComponent{
    public FileItem(String name, String date){
        super(name, date);
    }
    @Override
    public String getStringTreeFolder() {
        return this.prefix+ this.name;
    }
}
