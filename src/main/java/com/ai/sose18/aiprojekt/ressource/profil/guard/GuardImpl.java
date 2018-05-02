package com.ai.sose18.aiprojekt.ressource.profil.guard;


import com.ai.sose18.aiprojekt.ressource.profil.ProfilRepository;
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
        }
        return null;

    }

    @Override
    public Guard login(Guard guard) {
        Optional<Guard> guard_load = this.profilRepository.findByEmail(guard.getEmail());
        if (guard_load.isPresent() && guard_load.get().getPassword().equals(guard.getPassword())) {
            guard_load.get().setLoggedIn(true);
            return guard_load.get();
        }
        return null;
    }

    @Override
    public Guard logout(Guard guard) {
        Optional<Guard> guard_load = this.profilRepository.findByEmail(guard.getEmail());
        if (guard_load.isPresent() && guard_load.get().getPassword().equals(guard.getPassword())) {
            guard_load.get().setLoggedIn(false);
            return guard_load.get();
        }
        return null;
    }
}
