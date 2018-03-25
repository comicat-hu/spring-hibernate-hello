package com.comi.ap.service;

import org.apache.log4j.Logger;

public class MyService {
    
    private static final Logger logger = Logger.getLogger(MyService.class);

    public void run() {
        logger.info("Run Service");
    }
}