import by.gsu.asoilab.Item;

public class Runner {
    public static void main(String[] args) {
        Item wire = new Item(7850, "wire", "steel", (float) 0.03);
        System.out.println(wire.toString());
    }
}
