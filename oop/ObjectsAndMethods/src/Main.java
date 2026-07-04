public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");
        basket.add("tomato", 45, 1, 10);
        basket.add("orange", 34);
        basket.add("pear", 34,1,5);
        basket.add("apple", 56, 2, 5);
        System.out.println(basket.getTotalPrice());
        System.out.println(basket.getTotalWeight());
    }
}
