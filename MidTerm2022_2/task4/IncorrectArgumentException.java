public class IncorrectArgumentException extends ParseReadingFormatException{
    public IncorrectArgumentException(Throwable cause){
        super(cause);
    }
    public IncorrectArgumentException(String message, Throwable cause){
        super(message, cause);
    }
    public IncorrectArgumentException(){
        super();
    }
}
