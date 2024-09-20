package davidegiliberti.progetto_20_9_24.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record LoginDTO(
        @NotEmpty(message = "email obbligatoria")
        @Email(message = "email non valida")
        String email,
        @NotEmpty(message = "password obbligatoria")
        @Size(min = 12, message = "inserisci minimo 12 caratteri, includendo almeno una lettera minuscola, una lettera maiuscola, un numero ed un simbolo speciale")
        String password
) {
}
