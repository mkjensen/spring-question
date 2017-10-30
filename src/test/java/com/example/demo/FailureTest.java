package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Demonstrates that two beans of type {@link MessagePublisher} are available (via {@link FailureConfiguration}) but an error is not
 * produced during Spring initialization.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FailureConfiguration.class)
public class FailureTest {

    @Autowired
    private DemoLogic demoLogic;

    @Autowired
    private MessagePublisherMock messagePublisherMock;

    @Autowired
    private MessagePublisher[] messagePublishers;

    @Test
    public void testAvailableMessagePublishers() {

        // Given: FailureConfiguration

        // Then: Only one MessagePublisher instance must be available
        Assert.assertEquals(1, messagePublishers.length);
    }
}
