package project;

public class Movie extends Content {

    private int duration;

    public Movie() {
    }

    public Movie(int ID, String title, String genre, int releaseYear, Staff staff, int duration) {
        super(ID, title, genre, releaseYear, staff);
        setDuration(duration);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String contetntType() {
        return "Movie";
    }

    @Override
    public String toString() {
        return String.format("%s\nThe Duration : %d Minutes", super.toString(), getDuration());
    }
}
