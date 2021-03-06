/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import entities.Movie;

/**
 *
 * @author abed
 */
public class MovieDTO {
    private String title;
    private String[] actors;
    private int year;

    public MovieDTO(Movie movie) {
        this.title = movie.getTitle();
        this.actors = movie.getActors();
        this.year = movie.getYear();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
