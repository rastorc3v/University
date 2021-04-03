package by.gsu.asoilab;

public class Item extends Material {
    private String name;
    private String material;
    private float volume;

    public Item(String name, String material, float volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public Item(int density, String name, String material, float volume) {
        super(material, density);
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    private float getMass() {
        return volume * getDensity();
    }

    @Override
    public String toString() {
        return name + ';' + super.toString() + ';' + volume + ';' + getMass();
    }
}
