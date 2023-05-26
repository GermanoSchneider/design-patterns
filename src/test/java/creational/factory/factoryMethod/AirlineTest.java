package creational.factory.factoryMethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AirlineTest {

    private Airline airline;

    @BeforeEach
    void setup() {

        airline = new BrazilianAirlines();
    }

    @Test
    void shouldCreateRouteForBrazilianAirlines() {

        Route route = new SouthAmericaRoute();

        assertDoesNotThrow(() -> airline.createRoute(route));
    }

    @Test
    void shouldNotCreateRouteForBrazilianAirlines() {

        Route route = new NorthAmericaRoute();

        assertThrows(RuntimeException.class, () -> airline.createRoute(route));
    }
}
