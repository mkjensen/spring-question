package com.example.demo;

/**
 * Publishes messages to somewhere.
 */
public interface MessagePublisher {

    /**
     * Publish the specified message to somewhere.
     */
    void publish(String message);
}
