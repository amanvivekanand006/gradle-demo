package com.bits.mvn;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class App {
    private static Logger logger = LogManager.getLogger(App.class);
    private String name = "Hello";

    public String greet(String name) {
        return "hello " + name + "!";
    }

    public static void main(String[] args) {
        App app = new App();
        try {
            logger.debug(3 / 0); // intentional error
        } catch (ArithmeticException e) {
            logger.error("Division by zero error!", e);
        }

        if (args.length > 0) {
            logger.info(app.greet(args[0]));
        } else {
            logger.info(app.greet("World"));
        }
    }
}
