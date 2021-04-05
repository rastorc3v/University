import by.gsu.asoilab.Item;
import by.gsu.asoilab.Material;

public class Runner {
    public static void main(String[] args) {
        Material steel = new Material("steel", 7850);
        Item wire = new Item("wire", steel, (float) 0.03);
        System.out.println(wire.toString());
        Material copper = new Material("copper", 8500);
        wire.setMaterial(copper);
        System.out.println(wire.getMass());
        wire.setMaterial(steel);
        System.out.println(wire.getMaterial().getName());
    }
}
