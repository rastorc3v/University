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

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public float getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(float commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public int getPurchasedUnits() {
        return purchasedUnits;
    }

    public void setPurchasedUnits(int purchasedUnits) {
        this.purchasedUnits = purchasedUnits;
    }

    public float getCost() {
        return commodityPrice * purchasedUnits;
    }

    @Override
    public String toString() {
        return commodityName + ';' + commodityPrice + ';' + purchasedUnits + ';' + getCost();
    }

    @Override
    public boolean equals(Object commodityPurchase) {
        CommodityPurchase o = (CommodityPurchase) commodityPurchase;
        assert o != null;
        return commodityName.equals( o.commodityName) && commodityPrice == o.commodityPrice;
    }
}
