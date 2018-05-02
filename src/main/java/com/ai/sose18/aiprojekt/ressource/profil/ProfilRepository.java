package com.ai.sose18.aiprojekt.ressource.profil;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface ProfilRepository<T extends Profil> extends CrudRepository<T, Long> {
    Optional<T> findById(Long id);

    Optional<T> findByEmail(String email);
}
