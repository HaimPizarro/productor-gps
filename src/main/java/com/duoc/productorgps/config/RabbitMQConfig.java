package com.duoc.productorgps.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    // Define el nombre de la cola como constante
    public static final String QUEUE_UBICACIONES = "cola-ubicaciones";

    @Bean
    public Queue gpsQueue() {
        return new Queue(QUEUE_UBICACIONES, true); 
    }
}