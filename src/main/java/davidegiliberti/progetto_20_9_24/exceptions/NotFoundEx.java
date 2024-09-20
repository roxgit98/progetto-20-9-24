package davidegiliberti.progetto_20_9_24.exceptions;

import java.util.UUID;

public class NotFoundEx extends RuntimeException {
    public NotFoundEx(UUID id) {
        super("L'ID " + id + " non è presente");
    }

    public NotFoundEx(String message) {
        super(message);
    }
}
