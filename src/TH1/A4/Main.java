package TH1.A4;

public class Main {
    public static void main(String[] args) {
        User s1 = new User(1);
        User s2 = new User(2);
        User s3 = new User(3);
        User s4 = new User(4);
        s1.vote(Candidate.BIDEN);
        s2.vote(Candidate.TRUMP);
        s3.vote(Candidate.TRUMP);
        s4.vote(Candidate.TRUMP);
        System.out.println(Election.getInstance().getBiden());
        System.out.println(Election.getInstance().getTrump());
    }
}
