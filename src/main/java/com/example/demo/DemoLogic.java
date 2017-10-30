package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Very simple example logic to make it easy for tests to demonstrate the use of another {@link MessagePublisher} instance than in main.
 */
public class DemoLogic {

    @Autowired
    private MessagePublisher messagePublisher;

    public void publishMessage(String message) {
        messagePublisher.publish(message);
    }
}
