package by.gsu.pms;
import java.util.Scanner;

public class PurchasesFactory {
    private enum PurchasesKinds {
        GENERAL_PURCHASE,
        GENERAL_DISCOUNT_PURCHASE,
        DYNAMIC_DISCOUNT_PURCHASE
    }

    @SuppressWarnings("unchecked")
    public <T> T getClassFromFactory(Scanner sc) {
        String id = sc.next();
        PurchasesKinds kind = PurchasesKinds.valueOf(id);
        switch (kind) {
            case GENERAL_PURCHASE :
                return (T) new CommodityPurchase();
//            case GENERAL_DISCOUNT_PURCHASE:
//                return (T) new GeneralDiscountCommodityPurchase();
//                break;
//            case DYNAMIC_DISCOUNT_PURCHASE:
//                return (T) new DynamicDiscountCommodityPurchase();
//                break;
            default:
                System.out.println("Error in purchase type in src/in.txt. Take " + kind);
                break;
        }
        return null;
    }
}
