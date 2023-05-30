package creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LessonPrototypeTest {

    private final Lesson english = new Portuguese("How to learn english", 30);
    private final Lesson portuguese = new English("How to learn portuguese", 60);

    @Test
    void shouldCloneEnglishLesson() {

        var clone = english.duplicate();

        clone.setDuration(60);

        assertEquals(30, english.getDuration());
        assertEquals(60, clone.getDuration());
    }

    @Test
    void shouldClonePortugueseLesson() {

        var clone = portuguese.duplicate();

        clone.setDuration(30);

        assertEquals(60, portuguese.getDuration());
        assertEquals(30, clone.getDuration());
    }
}
