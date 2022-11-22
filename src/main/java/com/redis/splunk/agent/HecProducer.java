package com.redis.splunk.agent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class HecProducer implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(HecProducer.class);
    private static final int iteration = Integer.parseInt(System.getProperty("iter", String.valueOf(1)));

    public static void main(String[] args) {
        new HecProducer().run();
    }

    @Override
    public void run() {

        for (int i = 1; i <= iteration; i++) {
            String jsonMsg = String.format("{id:'%s', date:'%s', timestamp:'%d', message:'This is test event %d for Java Logging with Logback and Splunk HEC'}", UUID.randomUUID(), new Date(), Instant.now().toEpochMilli(), i);
            // Let's sleep for 1 sec between each iteration since HEC is dropping messages
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                logger.error(e.getMessage());
            }
            logger.info("{}", jsonMsg);
        }
    }
}