package davidegiliberti.progetto_20_9_24.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record EventoDTO(
        @NotEmpty(message = "titolo obbligatorio")
        @Size(min = 5, max = 20, message = "inserisci da 5 a massimo 20 caratteri")
        String titolo,
        @NotEmpty(message = "descrizione obbligatoria")
        @Size(min = 5, max = 20, message = "inserisci da 5 a massimo 20 caratteri")
        String descrizione,
        @NotEmpty(message = "data obbligatoria")
        @Size(min = 10, max = 10, message = "inserisci massimo 10 caratteri")
        String dataEvento,
        @NotEmpty(message = "luogo obbligatorio")
        @Size(min = 5, max = 20, message = "inserisci da 5 a massimo 20 caratteri")
        String luogo
) {
}
