package structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SmallHouse implements House {

    private final Logger logger = LoggerFactory.getLogger(SmallHouse.class);

    @Override
    public void build() {

        logger.info("Building a small house!");
    }
}
