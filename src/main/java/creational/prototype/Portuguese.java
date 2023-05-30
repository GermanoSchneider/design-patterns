package creational.prototype;

class Portuguese extends Lesson {

    Portuguese(String description, int duration) {
        super(description, duration);
    }

    Portuguese(Portuguese portuguese) {

        super(portuguese);
    }

    @Override
    protected Lesson duplicate() {

        return new Portuguese(this);
    }
}
