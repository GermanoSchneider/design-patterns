package creational.factory.abstract_factory;

abstract class Vehicle {

    private final Engine engine;

    private final Wheel wheel;

    Vehicle(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }
}
