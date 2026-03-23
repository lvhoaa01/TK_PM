package TH.A3;

abstract class Shape {
    String brush, paper, frame;
    protected  Shape(){
        brush = "bru";
        paper = "pap";
        frame = "fra";
    }

    public String getBrush() {
        return brush;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    abstract String draw();

    @Override
    public String toString(){
        return "Dram: [Brush: " + brush + ", Paper: " + paper + ", Frame: " + frame + " !";
    }
}

class Circle extends Shape{
    private static Circle instance;
    Circle(){
        super();
    }
    @Override
    public String draw(){
        return "";
    }
}

class Rectangle extends Shape{
    @Override
    public String draw(){
        return "";
    }
}

class Triangle extends Shape{
    @Override
    public String draw(){
        return "";
    }
}
