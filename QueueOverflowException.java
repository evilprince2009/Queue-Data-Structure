public class QueueOverflowException extends IllegalStateException {
    public QueueOverflowException() {
        super();
    }
    public QueueOverflowException(String message) {
        super(message);
    }
}