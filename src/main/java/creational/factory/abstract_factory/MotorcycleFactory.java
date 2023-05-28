package creational.factory.abstract_factory;

class MotorcycleFactory implements VehicleAbstractFactory {

    @Override
    public Engine createEngine() {

        return new Engine(50);
    }

    @Override
    public Wheel createWheels() {

        return new Wheel(2);
    }
}
