package project;

public abstract class Content {

    private int ID;
    private String title;
    private String genre;
    private int releaseYear;
    private Staff staff;
    private static int count;

    public abstract String contetntType();

    public Content() {
     this(0,null, null, 0, null);

    }

    public Content(int ID, String title, String genre, int releaseYear, Staff staff) {
        setID(ID);
        setTitle(title);
        setGenre(genre);
        setReleaseYear(releaseYear);
        setStaff(staff);
        count++;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Content.count = count;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nTitle: %s\nGenre: %s\nRelease Year: %d\n The director and the actors: %s", getID(), getTitle(), getGenre(), getReleaseYear(), getStaff());
    }

}
