package davidegiliberti.progetto_20_9_24.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record UtenteDTO(
        @NotEmpty(message = "username obbligatorio")
        @Size(min = 5, max = 20, message = "inserisci da 5 a massimo 20 caratteri")
        String username,
        @NotEmpty(message = "nome obbligatorio")
        @Size(min = 5, max = 20, message = "inserisci da 5 a massimo 20 caratteri")
        String nome,
        @NotEmpty(message = "cognome obbligatorio")
        @Size(min = 5, max = 20, message = "inserisci da 5 a massimo 20 caratteri")
        String cognome,
        @NotEmpty(message = "email obbligatoria")
        @Email(message = "email non valida")
        String email,
        @NotEmpty(message = "password obbligatoria")
        @Size(min = 12, message = "inserisci minimo 12 caratteri, includendo almeno una lettera minuscola, una lettera maiuscola, un numero ed un simbolo speciale")
        String password,
        @NotEmpty(message = "ruolo obbligatorio")
        @Size(min = 5, max = 20, message = "inserisci da 5 a massimo 20 caratteri")
        String ruolo
) {
}
