package creational.factory.abstract_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {

    private final VehicleAbstractFactory motorcycleFactory = new MotorcycleFactory();

    private final VehicleAbstractFactory truckFactory = new TruckFactory();

    @Test
    void shouldCreateAMotorcycle() {

        var engine = motorcycleFactory.createEngine();

        var wheels = motorcycleFactory.createWheels();

        var motorcycle = new Motorcycle(engine, wheels);

        assertEquals(new Wheel(2), motorcycle.getWheel());
        assertEquals(new Engine(50), motorcycle.getEngine());
    }

    @Test
    void shouldCreateATruck() {

        var engine = truckFactory.createEngine();

        var wheels = truckFactory.createWheels();

        var truck = new Truck(engine, wheels);

        assertEquals(new Wheel(4), truck.getWheel());
        assertEquals(new Engine(200), truck.getEngine());
    }
}
