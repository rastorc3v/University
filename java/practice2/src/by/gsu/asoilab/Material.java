package by.gsu.asoilab;

public class Material {
    private String name;
    private int density;

    public Material() {
    }

    public Material(String name, int density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }
}
