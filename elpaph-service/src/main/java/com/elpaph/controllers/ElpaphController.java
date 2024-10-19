package com.elpaph.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class ElpaphController {

    @GetMapping("/elpaph")
    String elpaph() {
        return "Hello From The Land of Giants.";
    }

}
