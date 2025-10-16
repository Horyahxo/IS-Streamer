package project;

import java.util.Scanner;

public class Review {

    private String title;
    private String body;
    private int rating;

    public Review() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter review title: ");
        this.title = scanner.nextLine();
        System.out.print("Enter review body: ");
        this.body = scanner.nextLine();
        System.out.print("Enter review rating (1-5): ");
        this.rating = scanner.nextInt();
    }

    public String getTitle() {
        return this.title;
    }

    public String getBody() {
        return this.body;
    }

    public int getRating() {
        return this.rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void printReview() {
        System.out.println("Title: " + this.title);
        System.out.println("Body: " + this.body);
        System.out.println("Rating: " + this.rating);
    }

}
