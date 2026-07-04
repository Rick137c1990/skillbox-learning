public final class Keyboard {
    private final TypeKeyboard type;
    private final boolean backlight;
    private final double weight;

    public Keyboard(TypeKeyboard type, boolean backlight, double weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    public String getBacklight() {
        return backlight == true ?
                "yes" : "no";
    }

    public TypeKeyboard getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public Keyboard setType(TypeKeyboard type) {
        return new Keyboard(type, backlight, weight);
    }

    public Keyboard setBacklight(boolean backlight) {
        return new Keyboard(type, backlight, weight);
    }

    public Keyboard setWeight(double weight) {
        return new Keyboard(type, backlight, weight);
    }

      @Override
    public String toString() {
        return "type: " + type + "\n" +
              "backlight: " + getBacklight() + "\n" +
              "weight: " + weight + " kg";
    }
}
