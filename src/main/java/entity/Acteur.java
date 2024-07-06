package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "acteurs")
public class Acteur {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "lName")
    private String lastName;
    @Column(name = "fName")
    private String firstName;

    public Acteur( String name, String surname) {

        this.lastName = name;
        this.firstName = surname;
    }

    public Acteur() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLName() {
        return lastName;
    }

    public void setLName(String name) {
        this.lastName = name;
    }

    public String getFName() {
        return firstName;
    }

    public void setFName(String surname) {
        this.firstName = surname;
    }


}
