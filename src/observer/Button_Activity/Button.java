package observer.Button_Activity;

import java.util.ArrayList;
import java.util.List;

public class Button implements Subject{
    private List<ButtonClickListener> listeners = new ArrayList<>();
    private int clickCount = 0;

    @Override
    public void attach(ButtonClickListener listener) {
        listeners.add(listener);
    }

    @Override
    public void detach(ButtonClickListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifyListener() {
        for(var listener : listeners){
            listener.onClick(clickCount);
        }
    }

    public void click(){
        ++clickCount;
        notifyListener();
    }
}
