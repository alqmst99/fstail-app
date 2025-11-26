package com.fstail.fstail_admin.dto;

public class MantenimientoDTO {
    private Long id;
    private Long proyectoId;
    private String plan;
    private Double PrecioMes;
    private boolean active;



//Contructor
    
    public MantenimientoDTO(Long id, Long proyectoId, String plan, Double PrecioMes, boolean active) {
        this.id = id;
        this.proyectoId = proyectoId;
        this.plan = plan;
        this.PrecioMes = PrecioMes;
        this.active = active;
    }


    public MantenimientoDTO() {
    }


//Getters & Setters
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getProyectoId() {
        return proyectoId;
    }
    public void setProyectoId(Long proyectoId) {
        this.proyectoId = proyectoId;
    }
    public String getPlan() {
        return plan;
    }
    public void setPlan(String plan) {
        this.plan = plan;
    }
    public Double getPrecioMes() {
        return PrecioMes;
    }
    public void setPrecioMes(Double PrecioMes) {
        this.PrecioMes = PrecioMes;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }




}
