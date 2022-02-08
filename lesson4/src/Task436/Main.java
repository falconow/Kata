package Task436;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("com.javamentor.logging.Test");
        logger.log(Level.INFO, "Все хорошо");
        logger.log(Level.WARNING, "Произошла ошибка");
    }
}
