package Complete_reference_java_11.Part_1.Chapter_10_Exceptions.Throw;

public class SideException extends Exception{
    public SideException() {
    }

    public SideException(String message) {
        super(message);
    }

    public SideException(String message, Throwable cause) {
        super(message, cause);
    }

    public SideException(Throwable cause) {
        super(cause);
    }

    public SideException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
