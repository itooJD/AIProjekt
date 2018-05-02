package com.ai.sose18.aiprojekt.ressource.profil.guard;


import com.ai.sose18.aiprojekt.ressource.profil.ProfilRepository;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GuardImpl implements GuardInterface {

    @Autowired
    private ProfilRepository<Guard> profilRepository;

    public GuardImpl() {

    }

    @Override
    public Guard save(Guard guard) {
        return this.profilRepository.save(guard);
    }

    @Override
    public Guard getById(Long id) {
        Optional<Guard> guard_load = this.profilRepository.findById(id);
        if (guard_load.isPresent()) {
            return this.profilRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public Boolean login(Guard guard) {
        Optional<Guard> guard_load = this.profilRepository.findByEmail(guard.getEmail());
        return guard_load.isPresent() && guard_load.get().getPassword().equals(guard.getPassword());
    }
}
