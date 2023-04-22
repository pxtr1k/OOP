public class ReadingFormatException extends ParseReadingFormatException{
    public ReadingFormatException(Throwable cause){
        super(cause);
    }
    public ReadingFormatException(String message, Throwable cause){
        super(message, cause);
    }
    public ReadingFormatException(){
        super();
    }
}
