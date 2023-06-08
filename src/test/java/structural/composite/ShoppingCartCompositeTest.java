package structural.composite;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartCompositeTest {

    @Test
    void shouldGetTheTotalValueFromAllProductsInAShoppingCart() {

        var televisionPrice = new BigDecimal("1200");
        var televisionDiscount = new BigDecimal("50");

        var smartphonePrice = new BigDecimal("1000");
        var smartphoneDiscount = new BigDecimal("100");

        var products = List.of(
                new Television(televisionPrice, televisionDiscount),
                new Smartphone(smartphonePrice, smartphoneDiscount)
        );

        var shoppingCart = new ShoppingCart(products);

        var sum = shoppingCart.getTotal();

        assertEquals(new BigDecimal("2050"), sum);
    }
}
