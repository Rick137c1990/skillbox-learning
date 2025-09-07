public class LessSetValuesException extends RuntimeException{
    public LessSetValuesException(String massage){
        super(String.format(massage));
    }
}
