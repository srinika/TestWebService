package org.hybernates.common.service;

import org.hybernates.common.models.Movie;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/movies")
public class MovieService {
    private static Map<String, Movie> movies = new HashMap<String, Movie>();

    static {
        for (int i=1; i<=10; i++) {
            Movie movie = new Movie();
            movie.setId(String.valueOf(i));
            movie.setTitle("Movie "+ String.valueOf(i));
            movies.put(String.valueOf(i), movie);
        }
    }

    @GET
    @Path("/getmovie/{id}")
    //@Produces(MediaType.APPLICATION_JSON)
    public Response getAllMovies(@PathParam("id") String id) {
        return Response.status(200).entity(movies.get(id).getTitle()).build();
    }
}
