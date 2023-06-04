package structural.adapter;

interface LogService {

    void debug(String message);

    void info(String message);

    void error(String message, Throwable throwable);
}
