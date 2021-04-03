package by.gsu.pms;

public class CommodityPurchase {
    private String commodityName;
    private float commodityPrice;
    private int purchasedUnits;

    public CommodityPurchase() {
    }

    public CommodityPurchase(String commodityName, float commodityPrice, int purchasedUnits) {
        this.commodityName = commodityName;
        this.commodityPrice = commodityPrice;
        this.purchasedUnits = purchasedUnits;
    }

}
