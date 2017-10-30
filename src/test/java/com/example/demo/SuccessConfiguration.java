package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Test configuration that imports the main configuration ({@link DemoConfiguration}) and uses {@link MessagePublisherMock} as {@link
 * MessagePublisher}.
 */
@Configuration
@Import(DemoConfiguration.class)
public class SuccessConfiguration {

    /**
     * Note: It's crucial that this method has the same name as {@link DemoConfiguration#messagePublisher()}.
     */
    @Bean(BeanNames.MESSAGE_PUBLISHER)
    MessagePublisherMock messagePublisher() {
        return new MessagePublisherMock();
    }
}
