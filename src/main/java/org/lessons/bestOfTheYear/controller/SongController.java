package org.lessons.bestOfTheYear.controller;


import org.lessons.bestOfTheYear.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {

    @GetMapping("/{id}")
    public String songsDetail(@PathVariable Integer id, Model model) {
        // recupero il movie con id preso dal path
//        String name = "unknown";
        Song currentSong = null;
        for (Song song : getSongsList()) {
            if (song.getId() == id) {
//                name = song.getTitle();
                currentSong = song;
            }
        }

        // aggiungo il nome del movie al model
        model.addAttribute("song", currentSong);
        return "detailSong";
    }

    private List<Song> getSongsList() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Bohemian rhapsody "));
        songs.add(new Song(2, "No limit of stars"));
        songs.add(new Song(3, "Crawling"));
        songs.add(new Song(4, "Weired fishes"));
        return songs;
    }
}
