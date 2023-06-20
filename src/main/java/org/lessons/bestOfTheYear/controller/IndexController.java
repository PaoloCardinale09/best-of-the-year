package org.lessons.bestOfTheYear.controller;


import org.lessons.bestOfTheYear.Movie;
import org.lessons.bestOfTheYear.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/") // rotta alla quale corrispondono i metodi di questo controller
public class IndexController {

    @GetMapping("/")
    public String home(Model model) {
        String name = "Paolo";
        model.addAttribute("name", name);
        return "index"; // Ritorno il nome del template index.html resources/templates
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("movies", getBestMovies());
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("songs", getBestSongs());
        return "songs";
    }

    // Step 2 Creare all’interno del controller due metodi privati :
    //- uno restituisce una lista di oggetti di tipo Movie - getBestMovies()
    //- l’altro restituisce una lista di oggetti di tipo Song - getBestSongs()

    private String getBestMovies() {
        List<Movie> bestMovies = new ArrayList<>();
        bestMovies.add(new Movie(1, "Pulp fiction"));
        bestMovies.add(new Movie(2, "Castaway on the moon"));

        List<String> movieTitles = new ArrayList<>();

        for (Movie movie : bestMovies) {
            movieTitles.add(movie.getTitle());
        }

        String songTitles = String.join(", ", movieTitles);
        return songTitles;

    }

    private String getBestSongs() {
        List<Song> bestSongs = new ArrayList<>();
        bestSongs.add(new Song(1, "Bohemian rhapsody "));
        bestSongs.add(new Song(2, "No limit of stars"));
        List<String> songTitles = new ArrayList<>();

        for (Song song : bestSongs) {
            songTitles.add(song.getTitle());
        }
        String movieTitles = String.join(", ", songTitles);
        return movieTitles;
    }


}
