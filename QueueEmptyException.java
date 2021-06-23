import java.util.NoSuchElementException;

public class QueueEmptyException extends NoSuchElementException {
    public QueueEmptyException() {
        super();
    }
    public QueueEmptyException(String message) {
        super(message);
    }
}
