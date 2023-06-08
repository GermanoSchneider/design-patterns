package structural.composite;

import java.math.BigDecimal;
import java.util.Collection;

import static java.math.BigDecimal.*;

class ShoppingCart {

    private final Collection<Product> products;

    ShoppingCart(Collection<Product> products) {
        this.products = products;
    }

    BigDecimal getTotal() {

        return products
                .stream()
                .map(Product::calculatePrice)
                .reduce(ZERO, BigDecimal::add);
    }
}
