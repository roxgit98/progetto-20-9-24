package davidegiliberti.progetto_20_9_24.exceptions;

public class NotFoundEx extends RuntimeException {
    public NotFoundEx(long id) {
        super("L'ID " + id + " non è presente");
    }

    public NotFoundEx(String message) {
        super(message);
    }
}
