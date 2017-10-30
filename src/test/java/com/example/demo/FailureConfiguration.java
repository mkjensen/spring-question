package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Like {@link SuccessConfiguration} but uses another bean name for the {@link MessagePublisherMock} instance.
 */
@Configuration
@Import(DemoConfiguration.class)
public class FailureConfiguration {

    /**
     * This is not named like {@link SuccessConfiguration#messagePublisher()} on purpose. Hence, it does not overwrite {@link
     * DemoConfiguration#messagePublisher()}. This results in an additional instance of {@link MessagePublisher}.
     */
    @Bean(BeanNames.MESSAGE_PUBLISHER + "just ensuring uniqueness")
    MessagePublisherMock messagePublisherMock() {
        return new MessagePublisherMock();
    }
}
