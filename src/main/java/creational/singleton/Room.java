package creational.singleton;

class Room {

    private static Room INSTANCE;

    private boolean status;

    private Room() {
        this.status = false;
    }

    public static Room getInstance() {

        if (INSTANCE == null) {

            INSTANCE = new Room();
        }

        return INSTANCE;
    }

    public boolean isOpen() {

        return status;
    }

    public boolean isClosed() {

        return !status;
    }

    public void open() {

        status = true;
    }

    public void close() {

        status = false;
    }
}
