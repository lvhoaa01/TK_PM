package TH1.A4;

import java.util.ArrayList;
import java.util.List;

public class Election {
    public static Election instance;
    private int trump=0, biden=0;
    List<Integer> dsach = new ArrayList<>();
    private Election(){
    }

    public int getBiden() {
        return biden;
    }

    public int getTrump() {
        return trump;
    }

    public static Election getInstance(){
        if(instance == null){
            instance = new Election();
        }
        return instance;
    }

    public void vote(Candidate c, int id){
        for(var user : dsach){
            if(user == id){
                return;
            }
            else dsach.add(id);
        }
        if(c == Candidate.TRUMP) ++trump;
        else if(c == Candidate.BIDEN) ++biden;
    }
}
