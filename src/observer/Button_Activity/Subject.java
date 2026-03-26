package observer.Button_Activity;

public interface Subject {
    void attach(ButtonClickListener listener);
    void detach(ButtonClickListener listener);
    void notifyListener();
}
