package Test;

import controller.ShippingBasket;
import controller.StockController;
import dto.Product;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

class ShippingBasketTest {

    StockController stocks = new StockController();
    ShippingBasket basket = new ShippingBasket();

    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    ShippingBasketTest() throws ParseException {
    }

    @Test
    public void test1() throws ParseException {
        Product soup = stocks.listOfProducts().get(0);
        Product bread = stocks.listOfProducts().get(1);
        basket.orderMap.put(soup, 3);
        basket.orderMap.put(bread, 2);
        double total = basket.getTotal(formatter.parse("20-03-2022"));
        System.out.println(total);

    }


}