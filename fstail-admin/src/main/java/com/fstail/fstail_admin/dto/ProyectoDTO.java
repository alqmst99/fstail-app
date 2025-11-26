package com.fstail.fstail_admin.dto;

import java.time.LocalDate;
import java.util.List;

public class ProyectoDTO {
    private Long id;
    private Long clientId;

    private String nombreProyecto;
    private String tipoServicio;
    private String estado;
    private LocalDate startedAt;
    private LocalDate finishedAt;

    private Double precio;
    private Integer dias;

    // checklist
    private List<String> pasos;

    public ProyectoDTO(Long id, Long clientId, String nombreProyecto, String tipoServicio, String estado,
            LocalDate startedAt, LocalDate finishedAt, Double precio, Integer dias, List<String> pasos) {
        this.id = id;
        this.clientId = clientId;
        this.nombreProyecto = nombreProyecto;
        this.tipoServicio = tipoServicio;
        this.estado = estado;
        this.startedAt = startedAt;
        this.finishedAt = finishedAt;
        this.precio = precio;
        this.dias = dias;
        this.pasos = pasos;
    }

    public ProyectoDTO() {
    }

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(LocalDate startedAt) {
        this.startedAt = startedAt;
    }

    public LocalDate getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(LocalDate finishedAt) {
        this.finishedAt = finishedAt;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public List<String> getPasos() {
        return pasos;
    }

    public void setPasos(List<String> pasos) {
        this.pasos = pasos;
    }
}
