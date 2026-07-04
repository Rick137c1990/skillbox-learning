public final class RAM {
    private final TypeRAM type;
    private final int volume;
    private final double weight;

    public RAM(TypeRAM type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public TypeRAM getType() {
        return type;
    }

    public RAM setType(TypeRAM type){
        return new RAM(type, volume, weight);
    }

    public int getVolume() {
        return volume;
    }

    public RAM setVolume(int volume) {
        return new RAM(type, volume, weight);
    }

    public RAM setWeight(double weight) {
        return new RAM(type, volume, weight);
    }

    public double getWeight() {
        return weight;
    }

       @Override
    public String toString() {
        return "type: " + type + "\n" +
              "volume: " + volume + " GB\n" +
              "weight: " + weight + " kg";
    }
}
