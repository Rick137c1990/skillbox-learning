public final class Screen {
    private final TypeScreen type;
    private final int diagonal;
    private final double weight;

    public Screen(TypeScreen type, int diagonal, double weight) {
        this.type = type;
        this.diagonal = diagonal;
        this.weight = weight;
    }

    public TypeScreen getType() {
        return type;
    }

    public Screen setType(TypeScreen type) {
        return new Screen(type, diagonal, weight);
    }

    public int getDiagonal() {
        return diagonal;
    }

    public Screen setDiagonal(int diagonal) {
        return new Screen(type, diagonal, weight);
    }

    public Screen setWeight(double weight) {
        return new Screen(type, diagonal, weight);
    }

    public double getWeight() {
        return weight;
    }

      @Override
    public String toString() {
        return "type: " + type + "\n" +
             "diagonal: " + diagonal + " inches\n" +
             "weight: " + weight + " kg";
    }  
}
