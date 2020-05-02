package com.ideaworks.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Value("${person.name}")
    private String name;
    @Value("${person.site}")
    private String site;
    @GetMapping("/site")
    public String getName() {
        return site;
    }
}
