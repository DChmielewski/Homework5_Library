package org.example;


import java.util.List;


public class Movie {

    private String title;
    private String genre;
    private Director director;
    private List<Actor> actors;
    private int publishingDate;

    public Movie(String title, String genre, Director director, int publishingDate, List<Actor> actors) {
        this.title = title;
        this.genre = genre;
        this.actors = actors;
        this.director = director;
        this.publishingDate = publishingDate;

    }

    public String getTitle() {
        return title;
    }


    public List<Actor> getActors() {
        return actors;
    }


    public int getPublishingDate() {
        return publishingDate;
    }


    @Override
    public String toString() {
        return "Film title: " + this.title + ", Genre: " + this.genre + ", Actors: " + this.actors + ", publishing date: " + this.publishingDate + " and the Director is: " + this.director;
    }


}


