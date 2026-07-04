public  final class CPU {
    private  final double frequency;
    private final int numberOfCores;
    private final TypeCPU manufacturer;
    private final double weight;

    public CPU(double frequency, int numberOfCores, TypeCPU manufacturer, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public TypeCPU getManufacturer() {
        return manufacturer;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public CPU setFrequency(double frequency) {
        return new CPU(frequency, numberOfCores, manufacturer, weight);
    }

    public CPU setNumberOfCores(int numberOfCores) {
        return new CPU(frequency, numberOfCores, manufacturer, weight);
    }

    public CPU setManufacturer(TypeCPU manufacturer) {
        return new CPU(frequency, numberOfCores, manufacturer, weight);
    }

    public CPU setWeight(double weight) {
        return new CPU(frequency, numberOfCores, manufacturer, weight);
    }

    @Override
    public String toString() {
         return "frequency: " + frequency + " Hz" + "\n" +
               "number of cores: " + numberOfCores + "\n" +
               "manufacturer: " + manufacturer + "\n" +
               "weight: " + weight + " kg";
    }
}
