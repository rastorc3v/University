package by.gsu.asoilab;

public class Item {
    private String name;
    private Material material;
    private float volume;

    public Item() { }

    public Item(String name, Material material, float volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getMass() {
        return volume * material.getDensity();
    }

    @Override
    public String toString() {
        return name + ';' + material.toString() + ';' + volume + ';' + getMass();
    }
}
