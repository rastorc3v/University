package by.gsu.pms;

public class DiscountPurchase extends AbstractPurchase {
    private float discount;

    public DiscountPurchase(Commodity commodity, int purchaseUnits, float discount) {
        super(commodity, purchaseUnits);
        this.discount = discount;
    }

    @Override
    public float getCost() {
        return (getCommodity().getPrice() - discount) * getPurchaseUnits();
    }
}
