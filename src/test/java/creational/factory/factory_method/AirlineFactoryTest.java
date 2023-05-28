package creational.factory.factory_method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AirlineFactoryTest {

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
