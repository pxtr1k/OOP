public class ArgumentParseException extends Exception{
    public ArgumentParseException(String message, Throwable cause){
        super(message, cause);
    }
    public ArgumentParseException(String message){
        super(message);
    }
}
