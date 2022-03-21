package dto;

public class Product {

    private int id;
    private String product;
    private UnitCategory unitCategory;
    private double cost;

    public Product(int id, String product, UnitCategory unitCategory, double cost) {
        this.id = id;
        this.product = product;
        this.unitCategory = unitCategory;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public UnitCategory getUnitCategory() {
        return unitCategory;
    }

    public void setUnitCategory(UnitCategory unitCategory) {
        this.unitCategory = unitCategory;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return  id +
                ", " + product + '\'' +
                ", " + unitCategory.getName() +
                ", " + cost
                ;
    }
}
