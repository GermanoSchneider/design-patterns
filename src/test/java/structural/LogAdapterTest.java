package structural;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(OutputCaptureExtension.class)
class LogAdapterTest {

    private final LogService log = new Slf4LogAdapter();

    private static final String LOG_MESSAGE = "Hello World!";

    @Test
    void shouldLogDebugLevel(CapturedOutput output) {

        log.debug(LOG_MESSAGE);

        var expectedMessage = "DEBUG: " + LOG_MESSAGE;

        assertTrue(output.getOut().contains(expectedMessage));

    }

    @Test
    void shouldLogInfoLevel(CapturedOutput output) {

        log.info(LOG_MESSAGE);

        var expectedMessage = "INFO: " + LOG_MESSAGE;

        assertTrue(output.getOut().contains(expectedMessage));
    }

    @Test
    void shouldLogErrorLevel(CapturedOutput output) {

        var exception = new RuntimeException("Throwing an error");

        log.error(LOG_MESSAGE, exception);

        var expectedMessage = "ERROR: " + LOG_MESSAGE;

        assertTrue(output.getOut().contains(expectedMessage));
        assertTrue(output.getOut().contains(exception.getMessage()));
    }
}
