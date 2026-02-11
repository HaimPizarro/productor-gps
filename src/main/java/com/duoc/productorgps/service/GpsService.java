package com.duoc.productorgps.service;

import com.duoc.productorgps.config.RabbitMQConfig;
import com.duoc.productorgps.model.UbicacionBus;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GpsService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    // Usamos Jackson para convertir el objeto Java a JSON String
    private final ObjectMapper objectMapper = new ObjectMapper();

    public void enviarUbicacion(UbicacionBus ubicacion) {
        try {
            // Convertimos el objeto a JSON String
            String mensajeJson = objectMapper.writeValueAsString(ubicacion);
            
            // Enviamos a la cola definida en la configuración
            rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_UBICACIONES, mensajeJson);
            
            System.out.println("Mensaje enviado a RabbitMQ: " + mensajeJson);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al enviar mensaje");
        }
    }
}