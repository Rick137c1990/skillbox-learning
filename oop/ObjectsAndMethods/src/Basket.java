public class Basket {
    private static int count = 0; // total number of baskets created
    private String items = "";     // list of items
    private int totalPrice = 0;    // total price of items
    private int limit;             // price limit for the basket
    private double totalWeight = 0; // total weight of items

    // Default constructor
    public Basket() {
        increaseCount(1);
        items = "Item list:";
        this.limit = 1_000_000;
    }

    // Constructor with custom price limit
    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    // Constructor with initial items and total price
    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    // Static getter for total basket count
    public static int getCount() {
        return count;
    }

    // Increase the basket count
    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    // Add item with default count = 1 and weight = 0
    public void add(String name, int price) {
        add(name, price, 1, 0);
    }

    // Add item with all parameters
    public void add(String name, int price, int count, double weight) {
        boolean error = false;

        if (contains(name)) {
            error = true;
        }
        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occurred :(");
            return;
        }

        items = items + "\n" + name + " - " + count + " pcs - " + price;
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
    }

    // Clear the basket
    public void clear() {
        items = "";
        totalPrice = 0;
    }

    // Get total price
    public int getTotalPrice() {
        return totalPrice;
    }

    // Check if item is in the basket
    public boolean contains(String name) {
        return items.contains(name);
    }

    // Print the basket contents
    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("The basket is empty");
        } else {
            System.out.println(items);
        }
    }

    // Get total weight
    public double getTotalWeight() {
        return totalWeight;
    }
}

