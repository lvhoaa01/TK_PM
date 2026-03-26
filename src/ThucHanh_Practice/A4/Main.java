package ThucHanh_Practice.A4;

import ThucHanh_Practice.A3.Triangle;

public class Main {
    public static void main(String[] args) {
        User s1 = new User("MyLan");
        User s2 = new User("KyDan");
        User s3 = new User("KyDa2");
        User s4 = new User("KyDa4");
        User s5 = new User("KyDa5");

        s1.vote(Candidate.JOE_BIDEN);
        s2.vote(Candidate.JOE_BIDEN);
        s3.vote(Candidate.DONALD_TRUMP);
        s4.vote(Candidate.DONALD_TRUMP);
        s5.vote(Candidate.DONALD_TRUMP);

        Election.getInstance().printRs();
    }
}
