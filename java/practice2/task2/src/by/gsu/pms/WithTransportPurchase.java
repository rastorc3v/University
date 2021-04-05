package by.gsu.pms;

public class WithTransportPurchase extends AbstractPurchase {
    // price for transportation of one unit of commodity
    private float transportPrice;

    public WithTransportPurchase(Commodity commodity, int purchaseUnits, float transportPrice) {
        super(commodity, purchaseUnits);
        this.transportPrice = transportPrice;
    }

    public float getTransportPrice() {
        return transportPrice;
    }

    public void setTransportPrice(float transportPrice) {
        this.transportPrice = transportPrice;
    }

    @Override
    public float getCost() {
        return getPurchaseUnits() * (getCommodity().getPrice() + transportPrice);
    }
}
