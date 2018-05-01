package com.ai.sose18.aiprojekt.ressource;

public class Profil {
    private String email;
    private String password;

    public Profil(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return this.email;
    }

    public String getEmail(){
        return this.email;
    }
}
