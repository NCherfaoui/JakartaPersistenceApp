// src/main/java/api/FilmResource.java
package api;

import entity.Film;
import service.FilmService;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/films")
public class FilmResource {
    private FilmService filmService = new FilmService();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Film createFilm(Film film) {
        return filmService.createFilm(film);
    }

    // other API endpoints...
}