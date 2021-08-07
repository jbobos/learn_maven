package com.mycompany.app;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App 
{
    static final Logger logger1 = LogManager.getLogger("Primary");
    static final Logger logger2 = LogManager.getLogger("Secondary");

    public static void main( String[] args )
    {
        logger1.debug("Hello Primary!");
        logger2.debug("Hello Secondary!");
    }
}
