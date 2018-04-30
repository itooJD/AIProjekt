package com.ai.sose18.aiprojekt.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password) {

    }

    @RequestMapping(value = "/guard/{id}", method = RequestMethod.GET)
    public void getGuard(@PathVariable("id") int guardId) {

    }
}
