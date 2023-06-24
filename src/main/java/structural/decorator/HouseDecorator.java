package structural.decorator;

abstract class HouseDecorator implements House {

    private final House house;

    HouseDecorator(House house) {
        this.house = house;
    }

    @Override
    public void build() {
        house.build();
    }
}
