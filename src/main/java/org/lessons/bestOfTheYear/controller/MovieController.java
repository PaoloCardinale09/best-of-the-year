package org.lessons.bestOfTheYear.controller;


import org.lessons.bestOfTheYear.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

//    @GetMapping("/")
//    public String movieList() {
//        return getMoviesList();
//    }


    @GetMapping("/{id}")
    public String moviesDetail(@PathVariable Integer id, Model model) {
        // recupero il movie con id preso dal path
//        String name = "unknown";
        Movie currentMovie = null;
        for (Movie movie : getMoviesList()) {
            if (movie.getId() == id) {
//                name = movie.getTitle();
                currentMovie = movie;
            }
        }

        // aggiungo il nome del movie al model
        model.addAttribute("movie", currentMovie);
        return "detailMovie";
    }

    private List<Movie> getMoviesList() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Pulp fiction"));
        movies.add(new Movie(2, "Castaway on the moon"));
        movies.add(new Movie(3, "Animali notturni"));
        movies.add(new Movie(4, "Us"));
        return movies;
    }
}
