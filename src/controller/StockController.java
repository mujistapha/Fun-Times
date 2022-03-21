package controller;

import dto.Product;
import dto.UnitCategory;

import java.util.ArrayList;
import java.util.List;

public class StockController {

    public StockController() {
    }

    public List<UnitCategory> listOfUnitCategories(){

        List<UnitCategory> units = new ArrayList<>();
        units.add(new UnitCategory(1, "tin"));
        units.add(new UnitCategory(2, "loaf"));
        units.add(new UnitCategory(3, "bottle"));
        units.add(new UnitCategory(4, "single"));
        return units;
    }

    public List<Product> listOfProducts(){

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "soup", listOfUnitCategories().get(0), 0.65));
        products.add(new Product(2, "bread", listOfUnitCategories().get(1), 0.80));
        products.add(new Product(3, "milk", listOfUnitCategories().get(2), 1.30));
        products.add(new Product(4, "apples", listOfUnitCategories().get(3), 0.10));

        return products;
    }

;}
