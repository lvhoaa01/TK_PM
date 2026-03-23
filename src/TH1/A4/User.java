package TH1.A4;

public class User{
    int id;
    public User(int id){
        this.id = id;
    }

    public void vote(Candidate c){
        Election.getInstance().vote(c, this.id);
    }
}
