package structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Slf4LogAdapter implements LogService {

    private final Logger logger = LoggerFactory.getLogger(Slf4LogAdapter.class);

    @Override
    public void debug(String message) {

        logger.debug("DEBUG: " + message);
    }

    @Override
    public void info(String message) {

        logger.info("INFO: " + message);
    }

    @Override
    public void error(String message, Throwable throwable) {

        logger.error("ERROR: " + message, throwable);
    }
}
