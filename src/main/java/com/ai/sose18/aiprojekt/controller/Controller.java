package com.ai.sose18.aiprojekt.controller;

import com.ai.sose18.aiprojekt.ressource.profil.*;
import com.ai.sose18.aiprojekt.ressource.profil.guard.Guard;
import com.ai.sose18.aiprojekt.ressource.profil.guard.GuardImpl;
import com.ai.sose18.aiprojekt.ressource.profil.guard.GuardInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    @Autowired
    private GuardInterface guardInterface = new GuardImpl();

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Profil login(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password) {
        return guardInterface.login(new Guard(email, password));
    }

    @RequestMapping(value = "/logout", method = RequestMethod.DELETE)
    public Profil logout(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password) {
        return guardInterface.logout(new Guard(email, password));
    }

    @RequestMapping(value = "/guard/{id}", method = RequestMethod.GET)
    public Profil getGuard(@PathVariable("id") Long guardId) {
        return this.guardInterface.getById(guardId);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Profil register(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password) {
        return this.guardInterface.save(new Guard(email, password));
    }

}
