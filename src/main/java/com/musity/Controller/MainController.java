package com.musity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @GetMapping("/tracks")
    public List<String> getAllTracks() {
        return List.of("мое имя", "анабиоз", "красивая красота", "снежинка","жизненная");
    }
}
