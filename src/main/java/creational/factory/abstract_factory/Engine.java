package creational.factory.abstract_factory;

class Engine {

    private final int hp;

    Engine(int hp) {
        this.hp = hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return hp == engine.hp;
    }
}
