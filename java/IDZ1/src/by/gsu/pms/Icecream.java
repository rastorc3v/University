package by.gsu.pms;

public class Icecream {
    private boolean isChocolate;
    private float fatPercentage;

    public Icecream() {
    }

    public Icecream(boolean isChocolate, float fatPercentage) {
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

    public String toString() {
        return "Is chocolate - " + isChocolate + " fat percentage - " + fatPercentage;
    }
}
