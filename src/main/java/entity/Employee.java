package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "lName")
    private String lastName;
    @Column(name = "fName")
    private String firstName;

   /* public Employee(int id, String name, String surname) {
        this.id = id;
        this.lName = name;
        this.fName = surname;
    }*/

    public Employee() {

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
