package com.duoc.productorgps.controller;

import com.duoc.productorgps.model.UbicacionBus;
import com.duoc.productorgps.service.GpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gps")
public class GpsController {

    @Autowired
    private GpsService gpsService;

    // Endpoint para recibir datos: POST http://localhost:8081/api/gps/enviar
    @PostMapping("/enviar")
    public String enviarDatosGps(@RequestBody UbicacionBus ubicacion) {
        // Llamamos al servicio para enviar a la cola
        gpsService.enviarUbicacion(ubicacion);
        
        return "Coordenadas recibidas y enviadas a la cola correctamente: " + ubicacion.getPatente();
    }
}