package team25.musiclibrary.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import team25.musiclibrary.entities.Track;
import team25.musiclibrary.service.TrackService;

@Controller
public class TrackController {

    @Autowired
    TrackService trackService;

    @RequestMapping(value = "/getAllTracks", method = RequestMethod.GET, headers = "Accept=application/json")
    public String getTracks(Model model) {
        List<Track> listOfTracks = trackService.getAll();
        model.addAttribute("track", new Track());
        model.addAttribute("listOfTracks", listOfTracks);
        return "trackDetails";
    }

    @RequestMapping(value = "/getTrack/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Track getTrackById(@PathVariable int id) {
        return trackService.getTrack(id);
    }

    @RequestMapping(value = "/addTrack", method = RequestMethod.POST, headers = "Accept=application/json")
    public String addTrack(@ModelAttribute("track") Track track) {
        if(track.getId()==0)
        {
            trackService.addTrack(track);
        }
        else
        {
            trackService.updateTrack(track);
        }

        return "redirect:/getAllTracks";
    }

    @RequestMapping(value = "/updateTrack/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public String updateTrack(@PathVariable("id") int id, Model model) {
        model.addAttribute("track", this.trackService.getTrack(id));
        model.addAttribute("listOfTracks", this.trackService.getAll());
        return "trackDetails";
    }

    @RequestMapping(value = "/deleteTrack/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public String deleteTrack(@PathVariable("id") int id) {
        trackService.deleteTrack(id);
        return "redirect:/getAllTracks";
    }
}


