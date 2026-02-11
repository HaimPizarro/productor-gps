package com.duoc.productorgps.model;

import java.io.Serializable;

public class UbicacionBus implements Serializable {
    private String patente;
    private String fechaHora;
    private double latitud;
    private double longitud;

    // Constructor vacío
    public UbicacionBus() {}

    // Constructor con datos
    public UbicacionBus(String patente, String fechaHora, double latitud, double longitud) {
        this.patente = patente;
        this.fechaHora = fechaHora;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    // Getters y Setters
    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }

    public String getFechaHora() { return fechaHora; }
    public void setFechaHora(String fechaHora) { this.fechaHora = fechaHora; }

    public double getLatitud() { return latitud; }
    public void setLatitud(double latitud) { this.latitud = latitud; }

    public double getLongitud() { return longitud; }
    public void setLongitud(double longitud) { this.longitud = longitud; }

    @Override
    public String toString() {
        return "UbicacionBus [patente=" + patente + ", latitud=" + latitud + ", longitud=" + longitud + "]";
    }
}