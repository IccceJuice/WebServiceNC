package team25.musiclibrary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {


    @GetMapping("/")
    public String hello(){
        return "jsp/trackList";
    }

    @GetMapping("/getHome")
    public String home(){ return "jsp/homePage";}
}
