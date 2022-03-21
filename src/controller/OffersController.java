package controller;

import dto.Offers;
import dto.ProductOffers;
import dto.ProductOffersItems;
import enumClasses.DiscountTypes;
import enumClasses.OfferTypes;
import dto.UnitCategoryOffers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class OffersController {

    private StockController stock = new StockController();
//    private UnitCategoryOffers u = new UnitCategoryOffers();
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    private Offers offer1 = new Offers(1, "Buy 2 tins of soup and get a loaf of bread half price",
            formatter.parse("19-03-2022"),
            formatter.parse("26-03-2022"),
            OfferTypes.ON_UNIT_CATEGORY,true);

    private Offers offer2 = new Offers(2, "Apples have a 10% discount",
            formatter.parse("23-03-2022"),
            formatter.parse("30-04-2022"),
            OfferTypes.ON_PRODUCT,true);

    private UnitCategoryOffers unitCategoryOffers = new UnitCategoryOffers(1, offer1, stock.listOfUnitCategories().get(0), 2, DiscountTypes.ON_OTHER_PRODUCT, 0);

    private ProductOffers productOffers1 = new ProductOffers(1, offer1, stock.listOfProducts().get(0), 2, DiscountTypes.ON_OTHER_PRODUCT, 0, "Buy 2 tins of soup and get a loaf of bread half price",
            formatter.parse("19-03-2022"),
            formatter.parse("26-03-2022"),true);
    private ProductOffers productOffers2 = new ProductOffers(1, offer2, stock.listOfProducts().get(3), 1, DiscountTypes.PERCENTAGE, 10, "Apples have a 10% discount",
            formatter.parse("23-03-2022"),
            formatter.parse("30-04-2022"),true);

    private ProductOffersItems productOffersItems = new ProductOffersItems(1, productOffers1, null, stock.listOfProducts().get(1), 1, 50);

    public OffersController() throws ParseException {
    }


    public List<Offers> listOfAllOffers() throws ParseException {
        List<Offers> offers = new ArrayList<>();
        offers.add(offer1);
        offers.add(offer2);
        return offers;
    }

    public List<UnitCategoryOffers> getUnitCategoryOffers() throws ParseException {
        List<UnitCategoryOffers> units = new ArrayList<>();
        units.add(unitCategoryOffers);
        return units;
    }

    public List<ProductOffers> getProductOffers() throws ParseException {
        List<ProductOffers> productOffers = new ArrayList<>();
        productOffers.add(productOffers1);
        productOffers.add(productOffers2);
        return productOffers;
    }

    public List<ProductOffersItems> getProductOffersItems() throws ParseException {
        List<ProductOffersItems> items = new ArrayList<>();
        items.add(productOffersItems);
        return items;
    }




}
