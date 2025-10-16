/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

public class Episode {

    private String title;
    private int duration;
    private int season;
    private int views;

    public Episode() {
    }

    public Episode(String title, int duration, int season, int views) {
        setTitle(title);
        setDuration(duration);
        setSeason(season);
        setViews(views);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return String.format("Title: %s\nDuration: %d Minutes\nSeason: %d\nViews: %d", getTitle(), getDuration(), getSeason(), getViews());
    }
}


