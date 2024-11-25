package com.example.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {
    // endpoint name GET/hello
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";

    }
    // endpoint with path variable
    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable String name) {
        return "Hello " + name;
    }
    // end point with multiple path variable
    @GetMapping("/hello/pvr/{showName}/{seatId}")
    public String showSeat(@PathVariable String showName, @PathVariable int seatId) {
        return "Hello " + showName + " " + seatId;
    }

    }

