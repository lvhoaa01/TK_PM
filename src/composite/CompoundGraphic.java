package composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic{
    private List<Graphic> dsach = new ArrayList<>();

    public void add(Graphic graphic){
        this.dsach.add(graphic);
    }

    public void remove(Graphic graphic){
        this.dsach.remove(graphic);
    }

    @Override
    public void draw() {
        System.out.println("Vẽ nhóm hình :");
        for(Graphic s : dsach){
            s.draw();
        }
    }
}
