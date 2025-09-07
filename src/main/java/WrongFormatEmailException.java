public class WrongFormatEmailException extends RuntimeException{
    public WrongFormatEmailException(String massage){
        super(String.format(massage));
    }
}

