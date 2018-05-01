package com.ai.sose18.aiprojekt.controller;

import org.springframework.web.bind.annotation.*;
import com.ai.sose18.aiprojekt.ressource.Profil;

@RestController
public class Controller {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password) {
        return "success";
    }

    @RequestMapping(value = "/guard/{id}", method = RequestMethod.GET)
    public void getGuard(@PathVariable("id") int guardId) {
    }

    @RequestMapping(value = "/guard", method = RequestMethod.POST)
    public String registerGuard(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password) {
        Profil profil = new Profil(email, password);
        return profil + " created";
    }
}
