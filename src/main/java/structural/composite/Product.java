package structural.composite;

import java.math.BigDecimal;

abstract class Product {

    private final BigDecimal price;

    private final BigDecimal discount;

    Product(BigDecimal price, BigDecimal discount) {
        this.price = price;
        this.discount = discount;
    }

    protected BigDecimal calculatePrice() {

        return price.subtract(discount);
    }
}
