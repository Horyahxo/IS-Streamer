package project;

public class TvShow extends Content {

    private int seasonCount;
    private int episodeCount;
    private Episode[] episodes;

    
    public TvShow(int ID, String title, String genre, int releaseYear, Staff staff, int seasonCount, int episodeCount, Episode[] episodes) {
        super(ID, title, genre, releaseYear, staff);
        setSeasonCount(seasonCount);
        setEpisodeCount(episodeCount);
        setEpisodes(episodes);
    }

    public int getSeasonCount() {
        return seasonCount;
    }

    public void setSeasonCount(int seasonCount) {
        this.seasonCount = seasonCount;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }

    public Episode[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Episode[] episodes) {
        this.episodes = episodes;
    }

    @Override
    public String contetntType() {
        return "Tv Show";
    }

    @Override
    public String toString() {
        return String.format("%s\nEpisode Count: %d\nSeason Count: %d", super.toString(), getEpisodeCount(), getSeasonCount());
    }

    public final void displayEpisodes() {
        System.out.println("--- Episodes List ---");
        if (episodes == null) {
            System.out.println("No episode added yet!");
        } else {
            for (Episode e : episodes) {
                System.out.println(e);
                System.out.println("-----------------------------");
            }
        }
    }

}
