package by.gsu.pms;

public class DynamicDiscountCommodityPurchase extends CommodityPurchase {
    static final int MIN_PURCHASE_UNITS = 10;
    private float discount;

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public DynamicDiscountCommodityPurchase(String commodityName, float commodityPrice, int purchasedUnits, float discount) {
        super(commodityName, commodityPrice, purchasedUnits);
        this.discount = discount;
    }

    @Override
    public float getCost() {
        if (getPurchasedUnits() > MIN_PURCHASE_UNITS) {
            return getCommodityPrice() * getPurchasedUnits() * (1 - discount/100);
        } else {
            return super.getCost();
        }
    }
}
