package davidegiliberti.progetto_20_9_24.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record PrenotazioneDTO(
        @NotEmpty(message = "data obbligatoria")
        @Size(min = 10, max = 10, message = "inserisci massimo 10 caratteri")
        String dataPrenotazione,
        @NotEmpty(message = "id evento obbligatorio")
        @Size(min = 1, message = "inserisci minimo 1 carattere")
        String eventoId,
        @NotEmpty(message = "id utente obbligatorio")
        @Size(min = 36, max = 36, message = "inserisci massimo 36 caratteri")
        String utenteId
) {
}
