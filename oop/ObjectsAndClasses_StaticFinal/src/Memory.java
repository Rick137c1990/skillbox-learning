public final class Memory {
    private final TypeMemory type;
    private final int value;
    private final double weight;

    public Memory(TypeMemory type, int value, double weight) {
        this.type = type;
        this.value = value;
        this.weight = weight;
    }

    public TypeMemory getType() {
        return type;
    }

    public Memory setType(TypeMemory type) {
        return new Memory(type, value, weight);
    }

    public int getValue() {
        return value;
    }

    public Memory setValue(int value) {
        return new Memory(type, value, weight);
    }

    public Memory setWeight(double weight) {
        return new Memory(type, value, weight);
    }

    public double getWeight() {
        return weight;
    }

      @Override
    public String toString() {
        return "type: " + type + "\n" +
             "capacity: " + value + " GB\n" +
             "weight: " + weight + " kg";
    }
}
