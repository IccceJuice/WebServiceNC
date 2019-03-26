package team25.musiclibrary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import team25.musiclibrary.entities.Artist;
import team25.musiclibrary.entities.Genre;
import team25.musiclibrary.service.ArtistService;

import java.util.List;

@Controller
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @RequestMapping("/getAllArtists")
    public String getArtists(Model model){
        List<Artist> artistList = artistService.getAll();
        model.addAttribute("artist", new Artist());
        model.addAttribute("listOfArtists", artistList);
        return "jsp/artistList";
    }
    @RequestMapping(value = "/getArtist/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Artist getArtistById(@PathVariable int id) {
        return artistService.getArtist(id);
    }

    @RequestMapping(value = "/addArtist", method = RequestMethod.POST, headers = "Accept=application/json")
    public String addArtist(@ModelAttribute("genre") Artist artist) {
        artistService.addArtist(artist);
        return "redirect:/getAllArtists";
    }

    @RequestMapping(value = "/updateArtist/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public String updateArtist(@PathVariable("id") int id, Model model) {
        model.addAttribute("artist", artistService.getArtist(id));
        model.addAttribute("listOfArtists", artistService.getAll());
        return "jsp/artistList";
    }

    @RequestMapping(value = "/deleteArtist/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public String deleteArtist(@PathVariable("id") int id) {
        artistService.deleteArtist(id);
        return "redirect:/getAllArtists";
    }
}
