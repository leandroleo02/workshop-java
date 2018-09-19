package com.thoughtworks.workshop.application.endpoint;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("image")
public class ImageProcessorEndpoint {

    @RequestMapping(method = RequestMethod.POST)
    public Response processImage(@RequestBody Request request) {
        return null;
    }
}
