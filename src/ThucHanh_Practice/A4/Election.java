package ThucHanh_Practice.A4;

import java.util.HashSet;
import java.util.Set;

public class Election {
    private static Election instance;

    private int voteForTrump = 0;
    private int voteForBiden = 0;

    private Set<String> voteUsers;

    private Election(){
        this.voteUsers = new HashSet<>();
    }

    public static Election getInstance(){
        if(instance == null){
            instance = new Election();
            return instance;
        }
        return instance;
    }

    public void vote(String username, Candidate candidate){
        if(voteUsers.contains(username)){
            System.out.println(username + " không được bầu cử lần 2!");
            return;
        }

        if(candidate == Candidate.JOE_BIDEN){
            voteForBiden++;
        }else if(candidate == Candidate.DONALD_TRUMP){
            voteForTrump++;
        }

        voteUsers.add(username);
        System.out.println(username + " bầu cử thành công !");
    }


    public void printRs(){
        System.out.println("DonalTrump : " + voteForTrump + " phiếu!");
        System.out.println("JoeBiden : " + voteForBiden + " phiếu!");
    }
}
