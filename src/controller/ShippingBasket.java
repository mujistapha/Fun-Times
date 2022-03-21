package controller;

import dto.Product;
import dto.ProductOffers;
import dto.ProductOffersItems;
import enumClasses.DiscountTypes;

import java.math.BigDecimal;
import java.math.RoundingMode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class ShippingBasket {

    StockController stocks = new StockController();
    private OffersController offers = new OffersController();

    public HashMap<Product, Integer> orderMap = new HashMap<>();

    public ShippingBasket() throws ParseException {
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        ShippingBasket basket = new ShippingBasket();

        basket.stocks.listOfProducts().stream()
                .forEach(s -> System.out.println(s.toString()));


        boolean end = false;
        while(!end){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of the product, write finish when you are done ");

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    String text = scanner.nextLine();
                    if(Integer.valueOf(text) <= 4){
                        Product product = basket.stocks.listOfProducts().get(Integer.valueOf(text) -1);
                        int count = basket.orderMap.getOrDefault(product, 0);
                        basket.orderMap.put(product, count + 1);
                    }   else {
                        System.out.println("You can only add product with number between 1-4");
                    }
                }
                String text = scanner.nextLine();
                if(text.equals("finish")){
                    System.out.println("You total order price is: " + basket.getTotal(formatter.parse("25-03-2022")));
                    end = true;
                }
            }
            scanner.close();
        }
    }

    public double getTotal(Date date) throws ParseException {
        double total = 0.0;
        HashMap<Product, Integer> productForDiscount = new HashMap<>();
        List<Product> hasDiscount = new ArrayList<>();

        for (Product product : orderMap.keySet()) {
            if(offers.getProductOffersItems().stream().anyMatch(p -> p.getProduct().getProduct().equals(product.getProduct()))){
                int count = productForDiscount.getOrDefault(product.getProduct(), 0);
                productForDiscount.put(product, count + 1);
            } else if(offers.getProductOffers().stream().anyMatch(p -> p.getProduct().getProduct().equals(product.getProduct()))){
                ProductOffers offer = offers.getProductOffers().stream().filter(p -> p.getProduct().getProduct().equals(product.getProduct())).findFirst().get();
                if(orderMap.get(product) >= offer.getMinQty()){
                    if(offer.getValidFrom().before(date) && offer.getValidTo().after(date)){
                        if(offer.getType() == DiscountTypes.PERCENTAGE){
                            double discountVal = offer.getDiscountInPercentage();
                            double discountValue = ((discountVal/100) * product.getCost());
                            total += (product.getCost() *  orderMap.get(product)) - (discountValue * orderMap.get(product));
                            continue;
                        }

                        if(offer.getType() == DiscountTypes.ON_OTHER_PRODUCT){
                            ProductOffersItems offerItems = offers.getProductOffersItems()
                                    .stream()
                                    .filter(p -> p.getProductOffer().equals(offer))
                                    .findFirst().get();

                            hasDiscount.add(product);
                            total += (product.getCost() *  orderMap.get(product));
                            continue;
                        }
                    } else {
                        total += (product.getCost() * orderMap.get(product));
                    }
                }
            } else {
                total += (product.getCost() * orderMap.get(product));
            }
        }

        for (Product product : productForDiscount.keySet()){
            ProductOffersItems offerItems = offers.getProductOffersItems()
                    .stream()
                    .filter(p -> p.getProduct().getProduct().equals(product.getProduct()))
                    .findFirst().get();

            double discountVal = offerItems.getDiscountInPercentage();
            double discountValue = ((discountVal/100) * product.getCost());
            total += (product.getCost() *  orderMap.get(product)) - discountValue;
        }
        return Double.valueOf(String.format("%.2f", total));
    }




}
