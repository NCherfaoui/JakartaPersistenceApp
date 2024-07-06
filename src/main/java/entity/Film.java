// src/main/java/entity/Film.java
package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "films")
public class Film {
    public Film(String title, String director) {
        this.title = title;
        this.director = director;
    }

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "title")
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Column(name = "director")
    private String director;

    // getters and setters...
    public Film() {

    }

}