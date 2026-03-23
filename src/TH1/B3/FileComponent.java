package TH1.B3;

public abstract class FileComponent {
    protected String name;
    protected String date;
    protected String prefix;
    protected FileComponent parent;

    public FileComponent(String name, String date){
        this.date = date;
        this.name = name;
    }

    public void setParent(FileComponent parent) {
        this.parent = parent;
    }


    public String getStringTreeFolder(){
        return this.prefix+ this.name;
    }

    public String getPath(){
        if(this.parent == null){
            return name;
        }else {
            return this.parent.name + "\\" + this.name;
        }
    }

    public void addItem(FileComponent component){

    }

    public void removeItem(FileComponent component){

    }
}
