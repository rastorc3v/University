package by.gsu.pms;

public class Icecream {
    private String name;
    private boolean isChocolate;
    private float fatPercentage;

    public Icecream() {
    }

    public Icecream(String name, boolean isChocolate, float fatPercentage) {
        this.name = name;
        this.isChocolate = isChocolate;
        this.fatPercentage = fatPercentage;
    }

    public boolean isChocolate() {
        return isChocolate;
    }

    public void setChocolate(boolean chocolate) {
        isChocolate = chocolate;
    }

    public float getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(float fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

    public String toString() {
        return "Is chocolate - " + isChocolate + " fat percentage - " + fatPercentage;
    }
}
