package dto;

public class ProductOffersItems {

    private int id;
    private ProductOffers productOffer;
    private UnitCategoryOffers unitCategoryOffer;
    private Product product;
    private int minQty;
    private int discountInPercentage;

    public ProductOffersItems(int id, ProductOffers productOffer, UnitCategoryOffers unitCategoryOffer, Product product, int minQty, int discountInPercentage) {
        this.id = id;
        this.productOffer = productOffer;
        this.unitCategoryOffer = unitCategoryOffer;
        this.product = product;
        this.minQty = minQty;
        this.discountInPercentage = discountInPercentage;
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductOffers getProductOffer() {
        return productOffer;
    }

    public void setProductOffer(ProductOffers productOffer) {
        this.productOffer = productOffer;
    }

    public UnitCategoryOffers getUnitCategoryOffer() {
        return unitCategoryOffer;
    }

    public void setUnitCategoryOffer(UnitCategoryOffers unitCategoryOffer) {
        this.unitCategoryOffer = unitCategoryOffer;
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

    public int getDiscountInPercentage() {
        return discountInPercentage;
    }

    public void setDiscountInPercentage(int discountInPercentage) {
        this.discountInPercentage = discountInPercentage;
    }
}

