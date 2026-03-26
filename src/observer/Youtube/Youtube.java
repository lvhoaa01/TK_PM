package observer.Youtube;

import java.util.ArrayList;
import java.util.List;

public class Youtube implements Subject{
    private List<Observer> subcribers = new ArrayList<>();
    private String lastestVideoTitle;
    @Override
    public void attach(Observer observer) {
        subcribers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        subcribers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : subcribers){
            observer.update(lastestVideoTitle);
        }
    }

    public void uploadVideo(String newTitle){
        this.lastestVideoTitle = newTitle;
        System.out.println("Youtube Channel đã upload video mới : " + this.lastestVideoTitle);
        notifyObserver();
    }
}
