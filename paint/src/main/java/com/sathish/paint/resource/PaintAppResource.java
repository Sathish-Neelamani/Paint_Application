package com.sathish.paint.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "PAINT APP", path = {"/paint/v1"})
public class PaintAppResource {

    @GetMapping(path = {"/start"})
    public String getPaintAppStarted() {
        return "It has started successfully";
    }
}
