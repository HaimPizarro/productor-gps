package com.duoc.productorgps.model;

import java.io.Serializable;

public class UbicacionBus implements Serializable {
    private Long id;
    private String accion;

    private String patente;
    private String fechaHora;
    private double latitud;
    private double longitud;

    public UbicacionBus() {}

    public UbicacionBus(String patente, String fechaHora, double latitud, double longitud) {
        this.patente = patente;
        this.fechaHora = fechaHora;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAccion() { return accion; }
    public void setAccion(String accion) { this.accion = accion; }

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
        return "UbicacionBus [id=" + id + ", accion=" + accion + ", patente=" + patente + "]";
    }
}