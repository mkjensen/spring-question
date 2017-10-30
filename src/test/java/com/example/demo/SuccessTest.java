package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Tests {@link DemoLogic} by ensuring (via {@link SuccessConfiguration}) that {@link MessagePublisherMock} is used as {@link
 * MessagePublisher}.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SuccessConfiguration.class)
public class SuccessTest {

    @Autowired
    private DemoLogic demoLogic;

    @Autowired
    private MessagePublisherMock messagePublisherMock;

    @Autowired
    private MessagePublisher[] messagePublishers;

    @Test
    public void testAvailableMessagePublishers() {

        // Given: SuccessConfiguration

        // Then: We only have one MessagePublisher instance available
        Assert.assertEquals(1, messagePublishers.length);
    }

    @Test
    public void testPublishMessage() {

        // Given
        String input = "input";

        // When
        demoLogic.publishMessage(input);

        // Then
        Assert.assertEquals(1, messagePublisherMock.getPublishedMessages().size());
        Assert.assertEquals(input, messagePublisherMock.getPublishedMessages().get(0));

    }
}
