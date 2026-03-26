package ThucHanh_Practice.A4;

public class User {
    private String name;
    public User(String name){this.name = name;}

    public String getName(){return name;}

    public void vote(Candidate candidate){
        Election.getInstance().vote(this.name, candidate);
    }
}
