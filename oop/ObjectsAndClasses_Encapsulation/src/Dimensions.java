public class Dimensions {
    private final int height;
    private final int length;
    private final int width;

    public Dimensions(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Dimensions setHeight(int height) {
        return new Dimensions(height, length, width);
    }

    public Dimensions setLength(int length) {
        return new Dimensions(height, length, width);
    }

    public Dimensions setWidth(int width) {
        return new Dimensions(height, length, width);
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    public int cargoVolumeCalculations(int height, int length, int width){
        int value = height * length * width;
        return value;
    }

    @Override
    public String toString() {
         return "dimensions: height = " + height + ", length = " + length + ", width = " + width + "." + "\n" +
              "cargo volume = " + cargoVolumeCalculations(height, length, width);
   }
}
