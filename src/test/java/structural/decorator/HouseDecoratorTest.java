package structural.decorator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(OutputCaptureExtension.class)
class HouseDecoratorTest {

    @Test
    void shouldOnlyBuildTheHouse(CapturedOutput output) {

        var house = new SmallHouse();

        house.build();

        var buildHouseMessage = "Building a small house!";

        assertTrue(output.getOut().contains(buildHouseMessage));
    }

    @Test
    void shouldPaintTheHouse(CapturedOutput output) {

        var house = new PaintHouse(new SmallHouse());

        house.build();

        var buildHouseMessage = "Building a small house!";
        var paintHouseMessage = "Painting the house!";

        assertTrue(output.getOut().contains(buildHouseMessage));
        assertTrue(output.getOut().contains(paintHouseMessage));
    }

    @Test
    void shouldPlasterTheHouse(CapturedOutput output) {

        var house = new PlasterHouse(new SmallHouse());

        house.build();

        var buildHouseMessage = "Building a small house!";
        var plasterHouseMessage = "Plastering the house!";

        assertTrue(output.getOut().contains(buildHouseMessage));
        assertTrue(output.getOut().contains(plasterHouseMessage));
    }

    @Test
    void shouldPaintAndPlasterTheHouse(CapturedOutput output) {

        var house = new PaintHouse(new PlasterHouse(new SmallHouse()));

        house.build();

        var buildHouseMessage = "Building a small house!";
        var paintHouseMessage = "Painting the house!";
        var plasterHouseMessage = "Plastering the house!";

        assertTrue(output.getOut().contains(buildHouseMessage));
        assertTrue(output.getOut().contains(paintHouseMessage));
        assertTrue(output.getOut().contains(plasterHouseMessage));
    }
}
