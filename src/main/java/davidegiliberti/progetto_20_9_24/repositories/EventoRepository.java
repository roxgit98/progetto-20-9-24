package davidegiliberti.progetto_20_9_24.repositories;

import davidegiliberti.progetto_20_9_24.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
