package creational.prototype;

abstract class Lesson {

    private final String description;

    private int duration;

    Lesson(String description, int duration) {
        this.description = description;
        this.duration = duration;
    };

    protected Lesson(Lesson lesson) {
        this.duration = lesson.duration;
        this.description = lesson.description;
    }

    protected abstract Lesson duplicate();

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
