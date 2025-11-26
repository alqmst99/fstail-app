package com.fstail.fstail_admin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mantence")
public class Mantenimiento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoPlan;
    private double precioMes;
    private boolean active;



    @OneToOne
    @JoinColumn(name = "project_id")
    private Proyecto project;
 
    //constructors arg and all
        public Mantenimiento(Long id, String tipoPlan, double precioMes, boolean active) {
        this.id = id;
        this.tipoPlan = tipoPlan;
        this.precioMes = precioMes;
        this.active = active;
    }


    public Mantenimiento() {
    }


    //Getters and Setters
    
    
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getTipoPlan() {
        return tipoPlan;
    }


    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }


    public double getPrecioMes() {
        return precioMes;
    }


    public void setPrecioMes(double precioMes) {
        this.precioMes = precioMes;
    }


    public boolean isActive() {
        return active;
    }


    public void setActive(boolean active) {
        this.active = active;
    }


}
