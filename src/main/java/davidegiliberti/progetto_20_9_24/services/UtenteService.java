package davidegiliberti.progetto_20_9_24.services;

import davidegiliberti.progetto_20_9_24.entities.Utente;
import davidegiliberti.progetto_20_9_24.exceptions.NotFoundEx;
import davidegiliberti.progetto_20_9_24.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;
    @Autowired
    private PasswordEncoder bcrypt;

    public Utente findById(UUID dipendenteId) {
        return this.utenteRepository.findById(dipendenteId).orElseThrow(() -> new NotFoundEx(dipendenteId));
    }

    public Page<Utente> findAll(int page, int size, String sortBy) {
        if (page > 100) page = 100;
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return this.utenteRepository.findAll(pageable);
    }

    
}
