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

    @PostMapping("/enviar")
    public String enviarDatosGps(@RequestBody UbicacionBus ubicacion) {
        ubicacion.setAccion("CREAR");
        
        gpsService.enviarUbicacion(ubicacion);
        
        return "Solicitud de CREACIÓN enviada para patente: " + ubicacion.getPatente();
    }

    @PutMapping("/editar/{id}")
    public String editarDatosGps(@PathVariable Long id, @RequestBody UbicacionBus ubicacion) {
        ubicacion.setId(id);
        ubicacion.setAccion("EDITAR");
        
        gpsService.enviarUbicacion(ubicacion);
        
        return "Solicitud de EDICIÓN enviada para el ID: " + id;
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarDatosGps(@PathVariable Long id) {
        UbicacionBus ubicacion = new UbicacionBus();
        ubicacion.setId(id);
        ubicacion.setAccion("ELIMINAR");
        
        gpsService.enviarUbicacion(ubicacion);
        
        return "Solicitud de ELIMINACIÓN enviada para el ID: " + id;
    }
}