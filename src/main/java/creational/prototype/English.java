package creational.prototype;

class English extends Lesson {

    English(String description, int duration) {
        super(description, duration);
    }

    English(English english) {

        super(english);
    }

    @Override
    protected Lesson duplicate() {

        return new English(this) ;
    }

}
