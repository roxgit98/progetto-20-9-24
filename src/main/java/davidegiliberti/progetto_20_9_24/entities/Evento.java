package davidegiliberti.progetto_20_9_24.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String titolo;
    private String descrizione;
    private LocalDate dataEvento;
    private String luogo;

    public Evento(String titolo, String descrizione, LocalDate dataEvento, String luogo) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.dataEvento = dataEvento;
        this.luogo = luogo;
    }
}
