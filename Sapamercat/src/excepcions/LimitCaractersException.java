package excepcions;

public class LimitCaractersException extends Exception {
    public LimitCaractersException(String message) {
        super(message);
    }
}