package creational.builder;

import org.junit.jupiter.api.Test;

import static creational.builder.Car.CarBuilder;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarBuilderTest {

    private static final String BRAND = "Jaguar";
    private static final String MODEL = "F-type";

    @Test
    void shouldCreateAValidCar() {

        var doors = 2;

        var builder = new CarBuilder()
                .addNumberOfDoors(doors)
                .addBrand(BRAND)
                .addModel(MODEL);

        var car = builder.build();

        assertEquals(MODEL, car.getModel());
        assertEquals(BRAND, car.getBrand());
        assertEquals(doors, car.getDoors());
    }

    @Test
    void shouldCreateAnInvalidCar() {

        var builder = new CarBuilder()
                .addNumberOfDoors(0)
                .addBrand(BRAND)
                .addModel(MODEL);

        assertThrows(RuntimeException.class, builder::build);
    }
}
