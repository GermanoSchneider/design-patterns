package creational.factory.abstract_factory;

class TruckFactory implements VehicleAbstractFactory {

    @Override
    public Engine createEngine() {

        return new Engine(200);
    }

    @Override
    public Wheel createWheels() {

        return new Wheel(4);
    }
}
