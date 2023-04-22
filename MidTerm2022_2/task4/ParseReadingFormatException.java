abstract class ParseReadingFormatException extends Exception {
    public ParseReadingFormatException(Throwable cause){
        super(cause);
    }
    public ParseReadingFormatException(String message, Throwable cause){
        super(message, cause);
    }
    public ParseReadingFormatException(){
        super();
    }
}
