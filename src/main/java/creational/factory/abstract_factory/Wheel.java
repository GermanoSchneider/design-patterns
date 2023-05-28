package creational.factory.abstract_factory;

class Wheel {

    private final int number;

    Wheel(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return number == wheel.number;
    }
}
