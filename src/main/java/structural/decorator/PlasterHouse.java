package structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class PlasterHouse extends HouseDecorator {

    private final Logger logger = LoggerFactory.getLogger(PlasterHouse.class);

    PlasterHouse(House house) {
        super(house);
    }

    @Override
    public void build() {

        super.build();

        logger.info("Plastering the house!");
    }
}
