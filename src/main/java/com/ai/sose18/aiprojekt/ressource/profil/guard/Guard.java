package com.ai.sose18.aiprojekt.ressource.profil.guard;

import com.ai.sose18.aiprojekt.ressource.profil.Profil;

import javax.persistence.Entity;

@Entity
public class Guard extends Profil {
    public Guard() {
        super();
    }

    public Guard(String email, String password) {
        super(email, password);
    }

}
