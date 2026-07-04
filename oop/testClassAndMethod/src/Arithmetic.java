public class Arithmetic {
    private int number;
    private int number2;

    public Arithmetic(int number, int number2) {
        this.number = number;
        this.number2 = number2;
    }
    public int addition() {
        int result = number + number2;
        return result;
    }
    public int multiplication() {
        int result = number * number2;
        return result;
    }
    public int moreNumber() {
        int result = number > number2 ?
                number : number2;
        return result;
    }
    public int lessNumber() {
        int result = number < number2 ?
                number : number2;
        return result;
    }
}
