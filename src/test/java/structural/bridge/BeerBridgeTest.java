package structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BeerBridgeTest {

    @Test
    void shouldMakeBeerAtCraftBrewery() {

        var ipa = new IndiaPaleAle("cascade", 60);

        var producedBeer = new CraftBrewery(ipa).produce();

        assertTrue(producedBeer.hasDryHopping());
        assertEquals(60, producedBeer.getIbu());
        assertEquals("cascade", producedBeer.getHop());
    }

    @Test
    void shouldMakeBeerAtIndustrialBrewery() {

        var ipa = new IndiaPaleAle("columbus", 40);

        var producedBeer = new IndustrialBrewery(ipa).produce();

        assertTrue(producedBeer.hasDryHopping());
        assertEquals(40, producedBeer.getIbu());
        assertEquals("columbus", producedBeer.getHop());
    }
}
