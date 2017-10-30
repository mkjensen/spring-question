package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Publishes messages to an internal {@link List} to allow for easy testing using {@link #getPublishedMessages()}.
 */
public class MessagePublisherMock implements MessagePublisher {

    private final List<String> publishedMessages = new ArrayList<>();

    @Override
    public void publish(String message) {
        publishedMessages.add(message);
    }

    /**
     * Returns messages that were published to this publisher since it was created.
     */
    public List<String> getPublishedMessages() {
        return publishedMessages;
    }
}
