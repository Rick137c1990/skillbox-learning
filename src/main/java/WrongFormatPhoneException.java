public class WrongFormatPhoneException extends RuntimeException{
    public WrongFormatPhoneException(String message){
        super(String.format(message));
    }
}
