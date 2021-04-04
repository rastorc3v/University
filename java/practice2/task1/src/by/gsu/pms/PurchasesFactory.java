package by.gsu.pms;
import java.util.Scanner;

public class PurchasesFactory {
    private enum PurchasesKinds {
        GENERAL_PURCHASE,
        GENERAL_DISCOUNT_PURCHASE,
        DYNAMIC_DISCOUNT_PURCHASE
    }

    public CommodityPurchase getClassFromFactory(Scanner sc) {
        String[] purchaseInfo = sc.next().split(" ");
        PurchasesKinds kind = PurchasesKinds.valueOf(purchaseInfo[0]);
        switch (kind) {
            case GENERAL_PURCHASE :
                return  new CommodityPurchase(
                        purchaseInfo[1],
                        Float.parseFloat(purchaseInfo[2]),
                        Integer.parseInt(purchaseInfo[3])
                );
            case GENERAL_DISCOUNT_PURCHASE:
                return new GeneralDiscountCommodityPurchase(
                        purchaseInfo[1],
                        Float.parseFloat(purchaseInfo[2]),
                        Integer.parseInt(purchaseInfo[3]),
                        Integer.parseInt(purchaseInfo[4])
                );
            case DYNAMIC_DISCOUNT_PURCHASE:
                return new DynamicDiscountCommodityPurchase(
                        purchaseInfo[1],
                        Float.parseFloat(purchaseInfo[2]),
                        Integer.parseInt(purchaseInfo[3]),
                        Integer.parseInt(purchaseInfo[4])
                );
            default:
                System.out.println("Error in purchase type in src/in.txt. Take " + kind);
                break;
        }
        return null;
    }
}
