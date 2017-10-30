package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Main configuration.
 */
@Configuration
public class DemoConfiguration {

    /**
     * Used by {@link DemoApplication} and tested by {@code SuccessTest}.
     */
    @Bean
    DemoLogic demoLogic() {
        return new DemoLogic();
    }

    /**
     * Used by {@link DemoLogic}.
     * <p>
     * Note: Method must have the same name as {@code SuccessConfiguration.messagePublisher()}.
     */
    @Bean(BeanNames.MESSAGE_PUBLISHER)
    MessagePublisher messagePublisher() {
        return new SystemOutMessagePublisher();
    }
}
