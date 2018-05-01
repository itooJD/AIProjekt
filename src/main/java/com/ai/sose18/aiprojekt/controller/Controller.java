package com.ai.sose18.aiprojekt.controller;

import org.springframework.web.bind.annotation.*;
import com.ai.sose18.aiprojekt.ressource.Profil;

import java.util.ArrayList;

@RestController
public class Controller {

    private ArrayList<Profil> guards = new ArrayList<>();

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password) {
        return "success";
    }

    @RequestMapping(value = "/login", method = RequestMethod.DELETE)
    public void logout() {

    }

    @RequestMapping(value = "/guard/{id}", method = RequestMethod.GET)
    public Profil getGuard(@PathVariable("id") int guardId) {
        return guards.get(guardId);
    }

    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public Profil register(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password){
        Profil guardProfile = new Profil(email,password);
        guards.add(guardProfile);
        return guardProfile;
    }

}
