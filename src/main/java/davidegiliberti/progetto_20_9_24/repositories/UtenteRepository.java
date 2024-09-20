package davidegiliberti.progetto_20_9_24.repositories;

import davidegiliberti.progetto_20_9_24.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
