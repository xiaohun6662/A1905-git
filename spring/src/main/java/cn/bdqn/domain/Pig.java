package cn.bdqn.domain;

public class Pig {
    private String username;

    @Override
    public String toString() {
        return "Pig{" +
                "username='" + username + '\'' +
                '}';
    }
    public Pig(){

    }

    public Pig(String username){
        this.username=username;
    }
}
