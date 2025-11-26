package com.example;
import java.util.logging.Logger;

public class LegacyPrinter {

    Logger logger = Logger.getLogger(getClass().getName());

    public void printMessage(String message) {
        logger.info(message);
    }
    
}
