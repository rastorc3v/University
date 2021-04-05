package by.gsu.pms;

public abstract class AbstractPurchase implements Comparable<AbstractPurchase> {
    private Commodity commodity;
    private int purchaseUnits;

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getPurchaseUnits() {
        return purchaseUnits;
    }

    public void setPurchaseUnits(int purchaseUnits) {
        this.purchaseUnits = purchaseUnits;
    }

    public float getCost() {
        return commodity.getPrice() * purchaseUnits;
    }

    @Override
    public String toString() {
        return commodity.toString() + ';' + purchaseUnits + ';' + getCost();
    }

    @Override
    public int compareTo(AbstractPurchase purchase) {
        return  (int) (purchase.getCost() - this.getCost());
    }
}
