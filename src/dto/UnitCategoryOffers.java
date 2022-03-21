package dto;

import enumClasses.DiscountTypes;

public class UnitCategoryOffers {

    private int id;
    private Offers offer;
    private UnitCategory product;
    private int minQty;
    private DiscountTypes type;
    private int discountInPercentage;

    public UnitCategoryOffers(int id, Offers offer, UnitCategory product, int minQty, DiscountTypes type, int discountInPercentage) {
        this.id = id;
        this.offer = offer;
        this.product = product;
        this.minQty = minQty;
        this.type = type;
        this.discountInPercentage = discountInPercentage;
    }

    public UnitCategoryOffers() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Offers getOffer() {
        return offer;
    }

    public void setOffer(Offers offer) {
        this.offer = offer;
    }

    public UnitCategory getProduct() {
        return product;
    }

    public void setProduct(UnitCategory product) {
        this.product = product;
    }

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }

    public DiscountTypes getType() {
        return type;
    }

    public void setType(DiscountTypes type) {
        this.type = type;
    }

    public int getDiscountInPercentage() {
        return discountInPercentage;
    }

    public void setDiscountInPercentage(int discountInPercentage) {
        this.discountInPercentage = discountInPercentage;
    }
}
