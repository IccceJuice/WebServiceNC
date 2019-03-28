package team25.musiclibrary.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
//        model.addAttribute("artist_name", )
        return "jsp/trackList";
    }

    @RequestMapping(value = "/getTrack/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Track getTrackById(@PathVariable int id) {
        return trackService.getTrack(id);
    }

    @RequestMapping(value = "/addTrack", method = RequestMethod.GET, headers = "Accept=application/json")
    public String addTrack(@ModelAttribute("track") Track track) {
        trackService.addTrack(track);
        return "redirect:/getAllTracks";
    }

    @RequestMapping(value = "/updateTrack/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public String updateTrack(@PathVariable("id") int id, Model model) {
        model.addAttribute("track", trackService.getTrack(id));
        model.addAttribute("listOfTracks", trackService.getAll());
        return "jsp/addTrack";
    }

    @RequestMapping(value= "/saveTrack", method = RequestMethod.POST, headers = "Accept=application/json")
    public String saveTrack(@ModelAttribute("track") Track track){
        trackService.updateTrack(track);
        return "redirect:/getAllTracks";
    }

    @RequestMapping(value = "/deleteTrack/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public String deleteTrack(@PathVariable("id") int id) {
        trackService.deleteTrack(id);
        return "redirect:/getAllTracks";
    }


}


