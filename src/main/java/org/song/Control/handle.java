package org.song.Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class handle {
    @RequestMapping("/hello")
    public String get(){
        return "hello";
    }
}
