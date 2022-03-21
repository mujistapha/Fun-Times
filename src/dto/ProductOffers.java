package dto;

import enumClasses.DiscountTypes;
import enumClasses.OfferTypes;

import java.util.Date;

public class ProductOffers {

    private int id;
    private Offers offer;
    private Product product;
    private int minQty;
    private DiscountTypes type;
    private int discountInPercentage;

    private String title;
    private Date validFrom;
    private Date validTo;
    private boolean status;


    public ProductOffers(int id, Offers offer, Product product, int minQty, DiscountTypes type, int discountInPercentage, String title, Date validFrom, Date validTo, boolean status) {
        this.id = id;
        this.offer = offer;
        this.product = product;
        this.minQty = minQty;
        this.type = type;
        this.discountInPercentage = discountInPercentage;
        this.title = title;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.status = status;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
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
