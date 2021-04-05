import by.gsu.pms.*;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Commodity commodity = new Commodity("Milk", (float) 100);
        AbstractPurchase[] arr = {
                new DiscountPurchase(commodity, 10, 50),
                new DiscountPurchase(commodity, 10, 20),
                new PercentDiscountPurchase(commodity, 5, 10),
                new PercentDiscountPurchase(commodity, 8, 15),
                new WithTransportPurchase(commodity, 2, 25),
                new WithTransportPurchase(commodity, 3, 20)
        };
        IPurchase.print(arr);
        Arrays.sort(arr);
        IPurchase.print(arr);
    }

    private interface IPurchase {
        static void print(AbstractPurchase[] arr) {
            for (AbstractPurchase purchase: arr) {
                System.out.println(purchase.toString());
            }
        }
    }
}
