package com.ai.sose18.aiprojekt.ressource.profil;


public interface ProfilInterface<T extends Profil> {
    T save(T obj);

    T getById(Long id);

    T login(T obj);

    T logout(T obj);
}
