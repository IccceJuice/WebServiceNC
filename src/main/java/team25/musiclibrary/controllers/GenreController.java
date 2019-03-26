package team25.musiclibrary.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import team25.musiclibrary.entities.Genre;
import team25.musiclibrary.service.GenreService;

import java.util.List;

@Controller
public class GenreController {

    @Autowired
    GenreService genreService;

    @RequestMapping("/getAllGenres")
    public String getGenres(Model model){
        List<Genre> genreList = genreService.getAll();
        model.addAttribute("genre", new Genre());
        model.addAttribute("listOfGenres", genreList);
        return "jsp/genreList";
    }
    @RequestMapping(value = "/getGenre/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Genre getGenreById(@PathVariable int id) {
        return genreService.getGenre(id);
    }

    @RequestMapping(value = "/addGenre", method = RequestMethod.POST, headers = "Accept=application/json")
    public String addGenre(@ModelAttribute("genre") Genre genre) {
        genreService.addGenre(genre);
        return "redirect:/getAllGenres";
    }

    @RequestMapping(value = "/updateGenre/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public String updateGenre(@PathVariable("id") int id, Model model) {
        model.addAttribute("genre", genreService.getGenre(id));
        model.addAttribute("listOfGenres", genreService.getAll());
        return "jsp/genreList";
    }

    @RequestMapping(value = "/deleteGenre/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public String deleteGenre(@PathVariable("id") int id) {
        genreService.deleteGenre(id);
        return "redirect:/getAllTracks";
    }
}
