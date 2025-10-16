package project;

import java.util.ArrayList;

public class User extends Person {

    private String userName;
    private String emial;
    private String Password;
    private ArrayList<User> followers;
    private ArrayList<User> following;

    public User() {
       this(null, null, null,null,null,null);

    }

    public User(String userName, String emial, String Password, ArrayList<User> followers, ArrayList<User> following, String name) {
        super(name);
        setUserName(userName);
        setEmial(emial);
        setPassword(Password);
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }

    public void follow(User user) {
        this.following.add(user);
        user.followers.add(this);
    }

    public void unfollow(User user) {
        this.following.remove(user);
        user.followers.remove(this);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ArrayList<User> getFollowers() {
        return this.followers;
    }

    public void setFollowers(ArrayList<User> followers) {
        this.followers = followers;
    }

    public ArrayList<User> getFollowing() {
        return following;
    }

    public void setFollowing(ArrayList<User> following) {
        this.following = following;
    }

    @Override
    public String toString() {
        return String.format("%s The User Name : %s \n The Email : %s \n ", super.toString(), getUserName(), getEmial());
    }

}
