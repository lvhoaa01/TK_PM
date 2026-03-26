package ThucHanh_Practice.CA1;

import java.util.ArrayList;
import java.util.List;

public class Stream <T>{
    private List<Listener<T>> listeners = new ArrayList<>();

    public void addListener(Listener<T> l){
        listeners.add(l);
    }

    public void addEvent(T data){
        for(Listener<T> listener : listeners){
            listener.onEvent(data);
        }
    }
}
