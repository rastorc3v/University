package by.gsu.pms;

public class GeneralDiscountCommodityPurchase extends CommodityPurchase {
    static final int DISCOUNT = 50;

    public GeneralDiscountCommodityPurchase(String commodityName, float commodityPrice, int purchasedUnits) {
        super(commodityName, commodityPrice, purchasedUnits);
    }

    public float getDiscount() {
        return DISCOUNT;
    }

    @Override
    public float getCost() {
        return (getCommodityPrice() - DISCOUNT) * getPurchasedUnits();
    }
}
