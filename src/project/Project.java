package project;

import java.util.ArrayList;

public class Project {

    public static void main(String[] args) {

        Director d1 = new Director("j", "", 2);
        System.out.println(d1);
        // String userName, String emial, String Password, ArrayList<User> followers, ArrayList<User> following, String name
        User joe = new User("Joe", "joe@hotmail.com", "p12", new ArrayList<User>(), new ArrayList<User>(), "Joe");
        User mi = new User("mi", "mie@gmail.com", "m12", new ArrayList<User>(), new ArrayList<User>(), "mi");
        // trying out the follow methods
        joe.follow(mi);
        mi.follow(joe);
        System.out.println(joe.getFollowers());

        Review r1 = new Review();
        System.out.println("Your Review:");
        r1.printReview();
    }

}
