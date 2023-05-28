package creational.factory.abstract_factory;

interface VehicleAbstractFactory {

    Engine createEngine();

    Wheel createWheels();
}
