// src/main/java/service/FilmService.java
package service;

import entity.Film;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FilmService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    private EntityManager em = emf.createEntityManager();

    public Film createFilm(Film film) {
        em.getTransaction().begin();
        em.persist(film);
        em.getTransaction().commit();
        return film;
    }

    // other CRUD operations...
}