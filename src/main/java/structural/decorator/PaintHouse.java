package structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class PaintHouse extends HouseDecorator {

    private final Logger logger = LoggerFactory.getLogger(PaintHouse.class);

    PaintHouse(House house) {
        super(house);
    }

    @Override
    public void build() {

        super.build();

        logger.info("Painting the house!");
    }
}
