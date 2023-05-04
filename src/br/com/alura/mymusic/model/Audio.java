package br.com.alura.mymusic.model;

public class Audio {
    private String title;

    private int duration;

    private int totalPlays;

    private int likes;

    protected int classification;

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

    public int getClassification() {
        return classification;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getLikes() {
        return likes;
    }

    public void like() {
        ++this.likes;
    }

    public void play() {
        ++this.totalPlays;
    }
}
