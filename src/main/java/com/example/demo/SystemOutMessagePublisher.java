package com.example.demo;

/**
 * Publishes messages to {@link System#out}.
 */
public class SystemOutMessagePublisher implements MessagePublisher {

    @Override
    public void publish(String message) {
        System.out.println(message);
    }
}
