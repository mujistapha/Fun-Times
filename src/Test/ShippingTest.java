package Test;

import controller.ShippingBasket;
import controller.StockController;
import dto.Product;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

class ShippingTest {

    StockController stocks = new StockController();
    ShippingBasket basket = new ShippingBasket();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    ShippingTest() throws ParseException {
    }

    @Test
    void getTotal() throws ParseException {
        Product soup = stocks.listOfProducts().get(0);
        Product bread = stocks.listOfProducts().get(1);
        basket.orderMap.put(bread, 2);
        basket.orderMap.put(soup, 3);
        double total = basket.getTotal(formatter.parse("20-03-2022"));
        assertEquals(3.15, total);
    }

    @Test
    void test2() throws ParseException {
        Product apples = stocks.listOfProducts().get(3);
        Product milk = stocks.listOfProducts().get(2);
        basket.orderMap.put(apples, 6);
        basket.orderMap.put(milk, 1);
        double total = basket.getTotal(formatter.parse("20-03-2022"));
        assertEquals(1.90, total);
    }

    @Test
    void test3() throws ParseException {
        Product apples = stocks.listOfProducts().get(3);
        Product milk = stocks.listOfProducts().get(2);
        basket.orderMap.put(apples, 6);
        basket.orderMap.put(milk, 1);
        double total = basket.getTotal(formatter.parse("25-03-2022"));
        assertEquals(1.84, total);
    }

    @Test
    void test4() throws ParseException {
        Product apples = stocks.listOfProducts().get(3);
        Product soup = stocks.listOfProducts().get(0);
        Product bread = stocks.listOfProducts().get(1);
        basket.orderMap.put(apples, 3);
        basket.orderMap.put(soup, 2);
        basket.orderMap.put(bread, 1);
        double total = basket.getTotal(formatter.parse("25-03-2022"));
        assertEquals(1.97, total);
    }
}