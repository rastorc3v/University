package by.gsu.pms;

public class GeneralDiscountCommodityPurchase extends CommodityPurchase {
    private int discount = 50;

    public GeneralDiscountCommodityPurchase(String commodityName, float commodityPrice, int purchasedUnits, int discount) {
        super(commodityName, commodityPrice, purchasedUnits);
        this.discount = discount;
    }

    public int getDISCOUNT() {
        return discount;
    }

    public void setDISCOUNT(int discount) {
        this.discount = discount;
    }

    @Override
    public float getCost() {
        return (getCommodityPrice() - discount) * getPurchasedUnits();
    }
}
