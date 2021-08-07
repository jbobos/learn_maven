package com.mycompany.app;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App 
{
    static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        logger.debug("Hello World!");
    }
}
