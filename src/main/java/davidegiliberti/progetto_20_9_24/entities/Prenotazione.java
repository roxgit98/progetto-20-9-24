package davidegiliberti.progetto_20_9_24.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "prenotazione")
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private LocalDate dataPrenotazione;
    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    public Prenotazione(LocalDate dataPrenotazione, Evento evento, Utente utente) {
        this.dataPrenotazione = dataPrenotazione;
        this.evento = evento;
        this.utente = utente;
    }
}
