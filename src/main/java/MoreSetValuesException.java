public class MoreSetValuesException extends RuntimeException {
    public MoreSetValuesException(String massage){
        super(String.format(massage));
    }
}
