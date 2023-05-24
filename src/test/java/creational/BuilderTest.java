package creational;

import org.junit.jupiter.api.Test;

import static creational.Dummy.DummyBuilder;
import static java.util.stream.IntStream.range;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BuilderTest {

    @Test
    void shouldCreateAnObjectWithAllFields() {

        var firstName = "Hello";
        var lastName = "World";

        var builder = new DummyBuilder()
                .withFirstName(firstName)
                .withLastName(lastName);

        var dummy = builder.build();

        assertEquals(firstName, dummy.getFirstName());
        assertEquals(lastName, dummy.getLastName());
    }

    @Test
    void shouldCreateAnObjectWithOnlyOneField() {

        var firstName = "Hello";

        var builder = new DummyBuilder().withFirstName(firstName);

        var dummy = builder.build();

        assertEquals(firstName, dummy.getFirstName());
        assertNull(dummy.getLastName());
    }

    @Test
    void shouldPopulateAListWithNumbers() {

        var builder = new DummyBuilder();

        range(0, 10).forEach(builder::addNumber);

        var dummy = builder.build();

        assertEquals(10, dummy.getNumbers().size());
    }
}
