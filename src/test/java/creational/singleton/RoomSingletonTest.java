package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RoomSingletonTest {

    @Test
    void shouldCreateOnlyOneRoomInstance() {

        var firstRoom = Room.getInstance();
        var secondRoom = Room.getInstance();

        firstRoom.open();

        assertTrue(secondRoom.isOpen());

        secondRoom.close();

        assertTrue(firstRoom.isClosed());
    }
}
